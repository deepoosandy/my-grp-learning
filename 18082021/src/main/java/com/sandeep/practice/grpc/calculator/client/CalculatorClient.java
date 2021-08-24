package com.sandeep.practice.grpc.calculator.client;

import com.proto.calculator.*;

import com.sun.org.apache.xpath.internal.objects.XNumber;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.StatusRuntimeException;
import io.grpc.stub.StreamObserver;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public class CalculatorClient {
    public static void main(String[] args) {
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 50052)
                .usePlaintext().build();
        new CalculatorClient().run(channel);
        channel.shutdown();
    }

    private void run(ManagedChannel channel) {
        //doUnaryCall(channel);
        //  doClientStreamingCall(channel);
        //  doServerStreamingCall(channel);
        // doBiDirectionalCall(channel);
        doErrorHandlingSquareRootCall(channel);

    }

    private void doErrorHandlingSquareRootCall(ManagedChannel channel) {
        CalculatorServiceGrpc.CalculatorServiceBlockingStub synClient =
                CalculatorServiceGrpc.newBlockingStub(channel);
        try {
            synClient.squreRoot(SqureRootRequest.newBuilder().setNumber(-1).build());
        }catch (StatusRuntimeException e){
            e.printStackTrace();
        }
    }

    private void doBiDirectionalCall(ManagedChannel channel) {
        CalculatorServiceGrpc.CalculatorServiceStub async = CalculatorServiceGrpc.newStub(channel);
        CountDownLatch latch = new CountDownLatch(1);
        StreamObserver<FindMaximumRequest> request = async.findMaximum(new StreamObserver<FindMaximumResponse>() {
            @Override
            public void onNext(FindMaximumResponse value) {
                System.out.println("Max number : " + value.getMaxValue());
            }

            @Override
            public void onError(Throwable t) {
                latch.countDown();
            }

            @Override
            public void onCompleted() {
                latch.countDown();
            }
        });
        Arrays.asList(3, 5, 17, 9, 8, 30, 12).forEach(inputNumber -> {
            request.onNext(FindMaximumRequest.newBuilder().setNumber(inputNumber).build());
        });
        request.onCompleted();
        try {
            latch.await(3L, TimeUnit.SECONDS);
        } catch (InterruptedException exception) {
            exception.printStackTrace();
        }
    }

    private void doClientStreamingCall(ManagedChannel channel) {

        CalculatorServiceGrpc.CalculatorServiceStub async = CalculatorServiceGrpc.newStub(channel);

        CountDownLatch latch = new CountDownLatch(1);
        StreamObserver<InputNumersRequest> request = async.calculateAvg(new StreamObserver<AverageResponse>() {
            @Override
            public void onNext(AverageResponse value) {
                System.out.println("Server send some response");
                System.out.println("Average of Input numbers " + value.getAverage());
            }

            @Override
            public void onError(Throwable t) {

            }

            @Override
            public void onCompleted() {

                latch.countDown();
            }
        });

        for (int i = 0; i < 10000; i++) {
            request.onNext(InputNumersRequest.newBuilder().setNumber(i).build());
        }

    }

    private void doServerStreamingCall(ManagedChannel channel) {
        CalculatorServiceGrpc.CalculatorServiceBlockingStub synClient =
                CalculatorServiceGrpc.newBlockingStub(channel);
        synClient.primeDecomposition(PrimeDecompositionServerStreamRequest.
                newBuilder().setNumber(120).build()).forEachRemaining(response -> System.out.println("Decomposition of given number: " + response));


    }

    private void doUnaryCall(ManagedChannel channel) {
        CalculatorServiceGrpc.CalculatorServiceBlockingStub synClient =
                CalculatorServiceGrpc.newBlockingStub(channel);

        InputNumbers numbers = InputNumbers.newBuilder()
                .setNum1(18)
                .setNum2(23).build();
        CalculatorRequest request = CalculatorRequest.newBuilder().setInputNumbers(numbers).build();
        CalculatorResponse response = synClient.sum(request);
        System.out.println(response);
    }

}
