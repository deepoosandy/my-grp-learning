package com.example.options;

import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.util.JsonFormat;
import example.simple.Simple;

import java.util.Arrays;

public class ProtoToJsonMain {
    public static void main(String[] args) throws InvalidProtocolBufferException {
        Simple.SimpleMessage.Builder builder= Simple.SimpleMessage.newBuilder();

        builder.setId(12);
        builder.setName("Sandeep");
        builder.setIsSimple(true);
        builder.addSampleList(1);
        builder.addAllSampleList(Arrays.asList(2,3,4,5));
        String jsonString=null;

            jsonString= JsonFormat.printer().print(builder);
            System.out.println(jsonString);


        //Parse Json into ProtoBuf
        Simple.SimpleMessage.Builder builder1= Simple.SimpleMessage.newBuilder();

        JsonFormat.parser().merge(jsonString,builder1);

        System.out.println(builder1);
        System.out.println(builder1.build());


    }
}
