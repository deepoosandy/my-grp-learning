package com.prottobuftes;

import example.simple.Simple.SimpleMessage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class SimpleMain {
    public static void main(String[] args) {
        System.out.println("Hi there!");
       SimpleMessage.Builder builder= SimpleMessage.newBuilder();

        builder.setId(12);
        builder.setName("Sandeep");
        builder.setIsSimple(true);
        builder.addSampleList(1);
        builder.addAllSampleList(Arrays.asList(2,3,4,5));

        SimpleMessage  message=builder.build();
        // writing protocol buffer binary to a file
        try {
            FileOutputStream outputStream=new FileOutputStream("simple_message.bin");
            message.writeTo(outputStream);
            outputStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        //send as byte array
       byte[] bytes= message.toByteArray();

        try {
            FileInputStream fileInputStream=new FileInputStream("simple_message.bin");
            try {
                SimpleMessage messageFromFile=SimpleMessage.parseFrom(fileInputStream);
                System.out.println(messageFromFile);
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}
