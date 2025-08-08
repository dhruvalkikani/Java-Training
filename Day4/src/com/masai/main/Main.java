package com.masai.main;

import com.masai.entity.*;
import com.masai.enums.Day;
import com.masai.enums.OrderStatus;
import com.masai.enums.Role;
import com.masai.enums.Status;
import com.masai.utils.AnimalUtils;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public int sum(int... numbers) {
        int total = 0;
        for (int num : numbers) {
            total += num;
        }
        return total;
    }

    public static void main(String[] args) {
//        com.masai.entity.main.Animal animal=new com.masai.entity.main.Animal("name....");
//
//        animal.makeNoise();
//
//        com.masai.entity.main.Cat an = new com.masai.entity.main.Cat();
//        an.makeNoise();
//
//        com.masai.entity.main.Animal a= new com.masai.entity.main.Cat();
//        a.makeNoise();
//
//        com.masai.entity.main.Cat c = (com.masai.entity.main.Cat)a;
//        c.jump();

        com.masai.entity.Dog d = new com.masai.entity.Dog("Tyson");
        com.masai.entity.Cat c = new com.masai.entity.Cat("Billi");
        com.masai.entity.Bat b = new com.masai.entity.Bat("Tom");
        com.masai.entity.Fish f = new com.masai.entity.Fish("Lilly");
        com.masai.entity.Ostrich o  = new com.masai.entity.Ostrich("Billy");
        com.masai.entity.Parrot p = new com.masai.entity.Parrot("Cilly");

        com.masai.entity.Animal[] animals = { d, c, b, f, o, p };

        for (com.masai.entity.Animal animal : animals) {
            animal.makeNoise();
            animal.roam();
            animal.eat();
            animal.sleep();
            System.out.println();
        }

        AnimalUtils animalUtils = new AnimalUtils();
        animalUtils.addanimal(d);
        animalUtils.addanimal(c);
        animalUtils.addanimal(p);


        //Variable Args
        int x = new Main().sum(2,23,45);
        System.out.println(x);


        // Enum Examples
        Day today = Day.MONDAY;

        switch (today){

            case MONDAY :
                System.out.println("Start of week"); break;

            case FIRDAY :
                System.out.println("Start of week"); break;

            default:
                System.out.println("Enjoy its a weekday");
                break;

        }

        //Enum example 2
        Order o1 = new Order(OrderStatus.DELIVERED,1);
        Order o2 = new Order(OrderStatus.PENDING,2);
        Order o3 = new Order(OrderStatus.SHIPPED,3);
        Order o4 = new Order(OrderStatus.CANCELLED,4);
        Order o5 = new Order(OrderStatus.PROCESSING,5);

        o1.printStatus();
        o2.printStatus();
        o3.printStatus();;
        o4.printStatus();
        o5.printStatus();


        // Enum example 3
        Role role = Role.ADMIN;

        switch (role){

            case ADMIN :
                System.out.println("Welcome " + Role.ADMIN);
                break;

            case USER :
                System.out.println("Welcome " + Role.USER);
                break;

            case GUEST:
                System.out.println("Welcome " + Role.GUEST);
                break;
    }
        Status s = Status.SUCCESS;
        System.out.println("Status: " + s);
        System.out.println("Code: " + s.getCode());


        MathOperation addition = new MathOperation() {
            @Override
            public int operator(int a, int b) {
                return a + b;
            }
        };

     //   MathOperation add = (a,y) -> a+y;
        MathOperation add = Integer::sum;

        MathOperation multiplication = new MathOperation() {
            @Override
            public int operator(int a, int b) {
                return a * b;
            }
        };

        MathOperation multiply = (a,y) -> a * y;

        System.out.println("Addition:" + add.operator(20,20));
        System.out.println("Multiply: " + multiply.operator(2,5));

        Flyable flyParrot = () -> System.out.println( p.getName() + " is flying");
        flyParrot.fly();
    }

}