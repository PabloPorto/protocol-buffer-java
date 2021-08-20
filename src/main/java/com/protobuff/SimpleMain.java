package com.protobuff;

import example.simple.Simple.SimpleMessage;

import java.util.Arrays;

public class SimpleMain {
    public static void main(String[] args) {
        System.out.println("Hello World");

        SimpleMessage.Builder builder = SimpleMessage.newBuilder();

        builder.setId(82939)
                .setIsSimple(true)
                .setName("How to use it now?")
                .addAllSampleList(Arrays.asList(4,6,7,8,8,5,3));

        System.out.println(builder.toString());
    }
}
