package com.sandeep.practice.grpc.calculator.client;

import com.proto.calculator.*;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class CalculatorClient {
    public static void main(String[] args) {
        ManagedChannel channel= ManagedChannelBuilder.forAddress("localhost",50052)
                .usePlaintext().build();

        CalculatorServiceGrpc.CalculatorServiceBlockingStub synClient=
        CalculatorServiceGrpc.newBlockingStub(channel);

       /* InputNumbers numbers=InputNumbers.newBuilder()
                .setNum1(18)
                .setNum2(23).build();
        CalculatorRequest request=CalculatorRequest.newBuilder().setInputNumbers(numbers).build();
        CalculatorResponse response= synClient.sum(request);*/

        synClient.primeDecomposition(PrimeDecompositionServerStreamRequest.
                newBuilder().setNumber(120).build()).forEachRemaining(response -> System.out.println("Decomposition of given number: "+response));

      //  System.out.println(response);
        channel.shutdown();




    }
}
