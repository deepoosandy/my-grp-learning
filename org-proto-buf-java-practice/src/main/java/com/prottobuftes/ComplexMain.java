package com.prottobuftes;

import example.complex.Complex.*;

import java.util.Arrays;

public class ComplexMain {
    public static void main(String[] args) {
        System.out.println("Complex Example");


        ComplexMessage.Builder builder = ComplexMessage.newBuilder();

        ComplexMessage message = builder.setOneDummy(createDummyMessage("1st dummy msg", 1)).addAllMultipleDummy(Arrays.asList(
                createDummyMessage("2st dummy msg", 2),
                createDummyMessage("3st dummy msg", 3),
                createDummyMessage("4st dummy msg", 4),
                createDummyMessage("5st dummy msg", 5)

        )).build();
        System.out.println(message);

    }

    public static DummyMessage createDummyMessage(String name, int id) {
        DummyMessage.Builder builderForDummy =
                DummyMessage.newBuilder();

        return builderForDummy.setId(id)
                .setName(name).build();
    }
}
