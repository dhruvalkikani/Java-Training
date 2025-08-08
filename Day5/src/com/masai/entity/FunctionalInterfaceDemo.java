package com.masai.entity;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class FunctionalInterfaceDemo {

     static List<Integer> findEvenNumber(List<Integer> numbers)
     {
         List<Integer> evenNumber = numbers.stream()
                 .filter( n -> n %2 ==0)
                 .collect(Collectors.toList());

         System.out.println(evenNumber);

        return evenNumber;
     }

     static  List<Integer> uniqueValues(List<Integer> numbers){
         List<Integer> uniqueNums = numbers.stream()
                 .distinct()
                 .collect(Collectors.toList());

         return uniqueNums;
     }

    static List<Employee> sortBySalary (List<Employee> employees){
                List<Employee> salarySort = employees.stream()
                 .sorted(Comparator.comparing(Employee::getSalary))
                 .collect(Collectors.toList());
         return salarySort;
    }


    public static List<String> findDeveloperNames(List<Employee> devs){
        return devs.stream()
                .filter(e -> e.getRole().equals("Developers"))
                .map(Employee::getName)
                .collect(Collectors.toList());
    }

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

        List<Integer> numbers = Arrays.asList(10, 13, 22, 35, 40, 51, 68, 77);

        List<Integer> evenNumbers = findEvenNumber(numbers);


        System.out.println("Even numbers: " + evenNumbers);


        List<Employee> employees = Arrays.asList(
                new Employee(70000 ,"Developers","Alice"),
                new Employee(90000, "Manager","Bob" ),
                new Employee(80000, "Developer","Charlie" ),
                new Employee(60000,"Tester", "Beta")
        );

        List<Employee> sortedBySalary = sortBySalary(employees);

        System.out.println("Employees sorted by salary:");
        sortedBySalary.forEach(e -> System.out.println(e.getName()));
        List<String> developerNames = findDeveloperNames(employees);

        System.out.println("Developer Names: " + developerNames);

     }



}
