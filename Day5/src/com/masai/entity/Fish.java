package com.masai.entity;

public class Fish extends Animal implements Swimable{
    @Override
    public void makeNoise() {
        System.out.println(getName()+" chap chap");
    }

    public Fish() {
    }

    public Fish(String name) {
        super(name);
    }

    @Override
    public void roam() {
        System.out.println(getName()+" Roaming");
    }

    @Override
    public void swim() {
        System.out.println(getName()+"Swimming");
    }
}
