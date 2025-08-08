package com.masai.entity;

public class Bat extends Animal implements Flyable, Swimable {
    public Bat(String name) {
        super(name);
    }

    public Bat() {
    }

    @Override
    public void makeNoise() {
        System.out.println(getName()+" mau mau");
    }

    @Override
    public void roam() {
        System.out.println(getName()+" Roaming");
    }

    @Override
    public void fly() {
        System.out.println(getName()+"Flying");
    }

    @Override
    public void swim() {
        System.out.println(getName()+"Swimming");
    }
}
