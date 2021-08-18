package com.sandeep.practice.grpc.greeting.server;

import com.proto.greet.*;
import io.grpc.stub.StreamObserver;

public class GreetServiceImpl extends GreetServiceGrpc.GreetServiceImplBase {
    @Override
    public void greet(GreetRequest request, StreamObserver<GreetResponse> responseObserver) {
       String firstName= request.getGreeting().getFirstName();
       String lastName=request.getGreeting().getLastName();

       String result="Hello "+firstName+" "+lastName;

       GreetResponse response=GreetResponse.newBuilder().setResult(result).build();

        responseObserver.onNext(response);

        responseObserver.onCompleted();

    }

    @Override
    public void greetManyTime(GreetManyTimeRequest request, StreamObserver<GreetManyTimeResponse> responseObserver)  {
        String fullName=request.getGreeting().getFirstName()+" "+request.getGreeting().getLastName();
        try{
            for(int i=0;i<100;i++){
                GreetManyTimeResponse response=GreetManyTimeResponse.newBuilder().setResult(fullName +" response number : "+i).build();

                responseObserver.onNext(response);

                Thread.sleep(1000L);

            }
        }catch (InterruptedException exception){
            exception.printStackTrace();
        }
       finally {
            responseObserver.onCompleted();
       }

    }
}
