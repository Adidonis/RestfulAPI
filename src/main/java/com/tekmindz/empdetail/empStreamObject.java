package com.tekmindz.empdetail;

import java.util.ArrayList;

import java.util.List;
import java.util.stream.Stream;


public class empStreamObject {

    public static void main(String[] args) {

        //Stream Api - Collection process(collection/group of object)
        
        // 1- blank 
        Stream<Object> emptyStream = Stream.empty();
        emptyStream.forEach(e -> {
            System.out.println(e);
        });


        // 2- array object /collector object

        String data [] = {"Aditya", "Divyansh", "Sunny", "Ishaan"};

        Stream<String> stream1 = Stream.of(data);
        stream1.forEach(e -> {
            System.out.println(e);
        });


        // 3- builder operation

        Stream<Object> StreamBuilder = Stream.builder().add("This is a stream builder operation").build();
        StreamBuilder.forEach(e ->{
            System.out.println(e);
        });


        // 4- Collection Object, list, set

        List<Integer> list2 = new ArrayList<>();
        list2.add(12);
        list2.add(21);
        list2.add(33);
        list2.add(45);

        Stream<Integer> stream2 = list2.stream();
        stream2.forEach(e -> {
            System.out.println(e);
        });
    }
}
