package com.sandeep.practice.grpc.calculator.server;

import com.proto.calculator.*;
import io.grpc.stub.StreamObserver;

public class CalculatorServiceImpl extends CalculatorServiceGrpc.CalculatorServiceImplBase {

    @Override
    public void sum(CalculatorRequest request, StreamObserver<CalculatorResponse> responseObserver) {
        InputNumbers numbers=request.getInputNumbers();
        int number1=numbers.getNum1();
        int number2= numbers.getNum2();

        int result= number1+number2;

        CalculatorResponse response=CalculatorResponse.newBuilder().setResult(result).build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void primeDecomposition(PrimeDecompositionServerStreamRequest request, StreamObserver<PrimeDecompositionServerStreamResponse> responseObserver) {
       int number=request.getNumber();
       int k=2;
       while(number>1){
           if(number % k ==0){
               PrimeDecompositionServerStreamResponse response=
                       PrimeDecompositionServerStreamResponse.newBuilder().setResult(k).build();
               responseObserver.onNext(response);
               number= number / k ;
           }else{
               k=k+1;
           }

       }
        responseObserver.onCompleted();

    }
}
