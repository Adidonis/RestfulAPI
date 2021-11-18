package com.tekmindz.empdetail;

import java.util.List;
import java.util.stream.Collectors;

public class empStreamMethod {

    public static void main(String[] args) {

        //filter(predicate) | boolean value function

        List<String> names = List.of("Aditya", "Aman", "Divyansh", "Sunny", "Ishaan");
        List<String> newNames = names.stream().filter(e ->e.startsWith("A")).collect(Collectors.toList());
        System.out.println(newNames);
    

        //map(function) | each element operation 

        List<Integer> numbers  = List.of(23,2,4,6,7,21);
        List<Integer> newNumbers = numbers.stream().map(i -> i * i).collect(Collectors.toList());
        System.out.println(newNumbers);

        //sorted

        numbers.stream().sorted().forEach(System.out::println);

        // min | max

        Integer integer = numbers.stream().min((x,y) -> x.compareTo(y)).get();
        System.out.println("min " + integer);

        Integer integer1 = numbers.stream().max((x,y) -> x.compareTo(y)).get();
        System.out.println("max " + integer1);

}
}
