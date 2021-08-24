package com.sandeep.practice.grpc.greeting.client;

import com.proto.dummy.DummyServiceGrpc;
import com.proto.greet.*;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public class GreetingClient {

    public static void main(String[] args) {
        System.out.println("Hello I am a GRPC client");

        GreetingClient greetingClient = new GreetingClient();

        greetingClient.run();
        System.out.println("Shutting down the client");

    }

    private void run() {
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 50051)
                .usePlaintext()
                .build();

        Greeting greeting = Greeting.newBuilder().setFirstName("Sandeep").setLastName("Jaiswal").build();

        //1-Unary api client calling...
      //  doUnaryCall(channel, greeting);

        //2- server streaming calling

      //  doServerStreamingCall(channel, greeting);

        //3- client streaming calling...
       // doClientStreamingCall(channel, greeting);

        //4- bi directional streaming calling

        doBiDirectionalStreaming(channel);

        channel.shutdown();
    }

    private void doBiDirectionalStreaming(ManagedChannel channel) {
        GreetServiceGrpc.GreetServiceStub async=GreetServiceGrpc.newStub(channel);
        CountDownLatch countDownLatch=new CountDownLatch(1);
        StreamObserver<GreetEveryoneRequest> requestStreamObserver=async.greetEveryOne(new StreamObserver<GreetEveryoneResponse>() {
            @Override
            public void onNext(GreetEveryoneResponse value) {
                System.out.println("Response received from the server: "+value.getResult());
            }

            @Override
            public void onError(Throwable t) {
                countDownLatch.countDown();
            }

            @Override
            public void onCompleted() {
                countDownLatch.countDown();
            }
        });

        Arrays.asList("Sandeep","Kumar","Jaiswal").stream().forEach(name->{
            System.out.println("Sending request for name: "+name);
            requestStreamObserver.onNext(GreetEveryoneRequest.newBuilder().setGreeting(

                    Greeting.newBuilder().setFirstName(name).setLastName(" Last_name").build()
            ).build());
           /* try {
                Thread.sleep(1000);
            } catch (InterruptedException exception) {
                exception.printStackTrace();
            }*/
        });
        requestStreamObserver.onCompleted();
        try {
            countDownLatch.await(3L,TimeUnit.SECONDS);
        } catch (InterruptedException exception) {
            exception.printStackTrace();
        }
    }

    private void doUnaryCall(ManagedChannel channel, Greeting greeting) {
        GreetServiceGrpc.GreetServiceBlockingStub syncClient = GreetServiceGrpc.newBlockingStub(channel);

        GreetRequest request = GreetRequest.newBuilder()
                .setGreeting(greeting).build();

        GreetResponse response = syncClient.greet(request);
        System.out.println(response);

    }

    private void doServerStreamingCall(ManagedChannel channel, Greeting greeting) {
        GreetServiceGrpc.GreetServiceBlockingStub syncClient = GreetServiceGrpc.newBlockingStub(channel);
        //2-Server streaming...api calling
        GreetManyTimeRequest greetManyTimeRequest = GreetManyTimeRequest.newBuilder()
                .setGreeting(greeting).build();
        syncClient.greetManyTime(greetManyTimeRequest).forEachRemaining(response -> System.out.println(response));

    }

    private void doClientStreamingCall(ManagedChannel channel, Greeting greeting) {
        //Async client
        GreetServiceGrpc.GreetServiceStub asyncClient =
                GreetServiceGrpc.newStub(channel);
        CountDownLatch countDownLatch=new CountDownLatch(1);
        StreamObserver<LongGreetRequest> requestStreamObserver = asyncClient.longGreet(new StreamObserver<LongGreetResponse>() {
            @Override
            public void onNext(LongGreetResponse value) {
                //we get a response from the server
                System.out.println("Received response from the server!");
                System.out.println( value.getResult());
                //onNext will called only once
            }

            @Override
            public void onError(Throwable t) {
                // we get an error from the server
            }

            @Override
            public void onCompleted() {
                // the server is done sending us data
                System.out.println("Server has completed sending us something...");
                //oncompleted right after the onNext()

                countDownLatch
                        .countDown();
            }
        });

        // streaming msg #1
        System.out.println("Sending msg #1");
        requestStreamObserver.onNext(LongGreetRequest.newBuilder().setGreeting(Greeting.newBuilder().setFirstName("Sandeep").build()).build());

        // streaming msg #2
        System.out.println("Sending msg #2");
        requestStreamObserver.onNext(LongGreetRequest.newBuilder().setGreeting(Greeting.newBuilder().setFirstName("Kumar").build()).build());

        // streaming msg #3
        System.out.println("Sending msg #3");
        requestStreamObserver.onNext(LongGreetRequest.newBuilder().setGreeting(Greeting.newBuilder().setFirstName("Jaiswal").build()).build());

        //we tell the server that client is done sending the data
        requestStreamObserver.onCompleted();
        try {
            countDownLatch
                    .await(3L, TimeUnit.SECONDS);
        } catch (InterruptedException exception) {
            exception.printStackTrace();
        }

    }
}
