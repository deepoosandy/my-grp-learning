package com.sandeep.practice.grpc.greeting.client;

import com.proto.dummy.DummyServiceGrpc;
import com.proto.greet.*;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

import java.util.List;

public class GreetingClient {
    public static void main(String[] args) {
        System.out.println("Hello I am a GRPC client");

        ManagedChannel channel= ManagedChannelBuilder.forAddress("localhost",50051)
                .usePlaintext()
                .build();
        // this is for dummy
       /* DummyServiceGrpc.DummyServiceBlockingStub syncClient
                = DummyServiceGrpc.newBlockingStub(channel);*/
      /*  DummyServiceGrpc.DummyServiceFutureStub asyncClient
                =DummyServiceGrpc.newFutureStub(channel);*/

        GreetServiceGrpc.GreetServiceBlockingStub syncClinet=GreetServiceGrpc.newBlockingStub(channel);

        Greeting greeting=Greeting.newBuilder().setFirstName("Sandeep").setLastName("Jaiswal").build();
        //1-Unary api client calling
       /*
        GreetRequest request=GreetRequest.newBuilder()
                .setGreeting(greeting).build();

       GreetResponse response= syncClinet.greet(request);
        System.out.println(response);
       */

        //2-Server streaming...api calling
        GreetManyTimeRequest greetManyTimeRequest=GreetManyTimeRequest.newBuilder()
                .setGreeting(greeting).build();
        syncClinet.greetManyTime(greetManyTimeRequest).forEachRemaining(response-> System.out.println(response));


        System.out.println("Shutting down the client");
        channel.shutdown();
    }
}
