package com.masai.entity;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class FunctionalInterfaceDemo {

    public static void main(String[] args) {
        Consumer<String> printer = (s) -> System.out.println(s);
        printer.accept("Hello, Hello ! ");

        Predicate<Integer> isEven = (n) ->n%2 ==0;
        System.out.println(isEven.test(4));
        System.out.println(isEven.test(5));

        Function<Integer, String> concatInt = (n) -> "Number - " + n;
        System.out.println(concatInt.apply(120));

        Supplier<Double> getRandomValue = () -> Math.random();
        System.out.println(getRandomValue.get());

        List<String> names = List.of("Ravi","Ramesh","Anu" + "Ajay");
        names.stream().filter(n -> n.startsWith("R"))
                .map(String::toUpperCase)
                .sorted()
                .forEach(d -> System.out.println(d));
        List<String> newNames = names.stream()
                .filter(n -> n.startsWith(("R")))
                .map(String::toUpperCase)
                .sorted()
                .collect(Collectors.toList());

        System.out.println(newNames);

        Long numNames = names.stream()
                .filter(n -> n.startsWith(("R")))
                .map(String::toUpperCase)
                .sorted().count();

        System.out.println("Total names Starting with R - " + numNames);



    }



}
