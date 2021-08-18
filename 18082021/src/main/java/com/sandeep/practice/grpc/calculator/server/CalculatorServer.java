package com.sandeep.practice.grpc.calculator.server;

import com.sandeep.practice.grpc.greeting.server.GreetServiceImpl;
import io.grpc.Server;
import io.grpc.ServerBuilder;

import java.io.IOException;

public class CalculatorServer {
    public static void main(String[] args) throws IOException, InterruptedException {
        System.out.println("Hello I am a GRPC server");
        Server server = ServerBuilder.forPort(50052)
                .addService(new GreetServiceImpl())
                .addService(new CalculatorServiceImpl())
                .build();
        server.start();

        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            System.out.println("Received shutdown request for the server!");
            server.shutdown();
            System.out.println("Successfully stopped the server!");
        }));

        server.awaitTermination();
    }
}
