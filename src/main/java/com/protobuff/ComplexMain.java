package com.protobuff;

import example.complex.Complex;
import example.complex.Complex.DummyMessage;

import java.util.Arrays;

public class ComplexMain {
    public static void main(String[] args) {

        DummyMessage one = createDummyMessage(23432,"anything");
        DummyMessage two = createDummyMessage(345,"little thing");
        DummyMessage three = createDummyMessage(5665,"everything");
        DummyMessage four = createDummyMessage(765,"nothing");
        DummyMessage five = createDummyMessage(45323,"something");

        Complex.ComplexMessage.Builder complexMessage = Complex.ComplexMessage.newBuilder();

        complexMessage.addAllMultipleDummy(Arrays.asList(one,two,three,four,five));
        Complex.ComplexMessage message = complexMessage.build();
        System.out.println(message.toString());

    }

    private static DummyMessage createDummyMessage (int id, String name){
        DummyMessage.Builder builder = DummyMessage.newBuilder();
        DummyMessage message = builder.setId(id)
                .setName(name)
                .build();

        return message;
    }
}
