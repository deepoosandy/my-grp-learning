package com.prottobuftes;

import example.enumerations.EnumExample;
import example.enumerations.EnumExample.EnumMessage;

public class EnumMain {
    public static void main(String[] args) {
            System.out.println("Examples for Enum");

            EnumMessage.Builder builder = EnumMessage.newBuilder();
            builder.setId(1)
                    .setDayOfTheWeek(EnumExample.DayOfTheWeek.FRIDAY);
            EnumMessage message=builder.build();
    }
}
