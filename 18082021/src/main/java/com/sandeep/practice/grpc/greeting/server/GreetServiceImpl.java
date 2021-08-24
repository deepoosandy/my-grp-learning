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

    @Override
    public StreamObserver<LongGreetRequest> longGreet(StreamObserver<LongGreetResponse> responseObserver) {



        StreamObserver<LongGreetRequest> requestStreamObserver=new StreamObserver<LongGreetRequest>() {
            String result="Hello";
            @Override
            public void onNext(LongGreetRequest value) {
                //Run when request comes
                result=result+ value.getGreeting().getFirstName()+" "+value.getGreeting().getLastName()+" !";
            }

            @Override
            public void onError(Throwable t) {
                //Run when error occur

            }

            @Override
            public void onCompleted() {
                // when task complete and service will resturn
                LongGreetResponse response= LongGreetResponse.newBuilder().setResult(result).build();
                responseObserver.onNext(response);
                responseObserver.onCompleted();
            }
        };
      return requestStreamObserver;
    }

    @Override
    public StreamObserver<GreetEveryoneRequest> greetEveryOne(StreamObserver<GreetEveryoneResponse> responseObserver) {
        StreamObserver<GreetEveryoneRequest> requestStreamObserver=
                new StreamObserver<GreetEveryoneRequest>() {
                    @Override
                    public void onNext(GreetEveryoneRequest value) {
                        String result="Hello "+value.getGreeting().getFirstName()+" "+value.getGreeting().getLastName();

                        responseObserver.onNext(GreetEveryoneResponse.newBuilder().setResult(result).build());
                    }

                    @Override
                    public void onError(Throwable t) {

                    }

                    @Override
                    public void onCompleted() {
                        responseObserver.onCompleted();
                    }
                };
                return requestStreamObserver;
    }
}
