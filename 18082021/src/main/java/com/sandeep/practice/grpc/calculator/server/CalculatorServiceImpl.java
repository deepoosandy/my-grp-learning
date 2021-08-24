package com.sandeep.practice.grpc.calculator.server;

import com.proto.calculator.*;
import io.grpc.Status;
import io.grpc.stub.StreamObserver;

import java.util.ArrayList;
import java.util.List;

public class CalculatorServiceImpl extends CalculatorServiceGrpc.CalculatorServiceImplBase {

    @Override
    public void sum(CalculatorRequest request, StreamObserver<CalculatorResponse> responseObserver) {
        InputNumbers numbers = request.getInputNumbers();
        int number1 = numbers.getNum1();
        int number2 = numbers.getNum2();

        int result = number1 + number2;

        CalculatorResponse response = CalculatorResponse.newBuilder().setResult(result).build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void primeDecomposition(PrimeDecompositionServerStreamRequest request, StreamObserver<PrimeDecompositionServerStreamResponse> responseObserver) {
        int number = request.getNumber();
        int k = 2;
        while (number > 1) {
            if (number % k == 0) {
                PrimeDecompositionServerStreamResponse response =
                        PrimeDecompositionServerStreamResponse.newBuilder().setResult(k).build();
                responseObserver.onNext(response);
                number = number / k;
            } else {
                k = k + 1;
            }

        }
        responseObserver.onCompleted();

    }

    @Override
    public StreamObserver<InputNumersRequest> calculateAvg(StreamObserver<AverageResponse> responseObserver) {

        StreamObserver<InputNumersRequest> streamObserverRequest = new StreamObserver<InputNumersRequest>() {
            int count = 0;
            int sum = 0;
            double avg = 0;

            @Override
            public void onNext(InputNumersRequest value) {
                sum = sum + value.getNumber();
                count++;
            }

            @Override
            public void onError(Throwable t) {

            }

            @Override
            public void onCompleted() {
                avg = (double) sum / count;
                responseObserver.onNext(AverageResponse.newBuilder().setAverage(avg).build());
                responseObserver.onCompleted();
            }
        };

        return streamObserverRequest;


    }

    @Override
    public StreamObserver<FindMaximumRequest> findMaximum(StreamObserver<FindMaximumResponse> responseObserver) {
        StreamObserver<FindMaximumRequest> requestStreamObserver=new StreamObserver<FindMaximumRequest>() {
            int currentMax=0;
            @Override
            public void onNext(FindMaximumRequest value) {
                if(value.getNumber()> currentMax){
                    currentMax=value.getNumber();
                    responseObserver.onNext(FindMaximumResponse.newBuilder().setMaxValue(currentMax).build());
                }
            }

            @Override
            public void onError(Throwable t) {

            }

            @Override
            public void onCompleted() {
                responseObserver.onNext(FindMaximumResponse.newBuilder().setMaxValue(currentMax).build());
                responseObserver.onCompleted();
            }
        };
        return requestStreamObserver;
    }

    @Override
    public void squreRoot(SqureRootRequest request, StreamObserver<SqureRootResponse> responseObserver) {

        int number=request.getNumber();

        if(number>=0){
            double squareRoot=Math.sqrt(number);
            responseObserver.onNext(SqureRootResponse.newBuilder().setNumberRoot(squareRoot).build());
            responseObserver.onCompleted();
        }else{
            responseObserver.onError(Status.INVALID_ARGUMENT
            .withDescription("The number being sent is not positive.")
                    .augmentDescription("Number sent: "+number).asRuntimeException()
            );
        }
    }
}
