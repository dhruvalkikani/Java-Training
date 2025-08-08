package com.masai.entity;

public class Dog extends Animal implements Swimable {

    public Dog(String name) {
        super(name);
    }
    public Dog(){}

    public void play(){
        System.out.println(getName()+" Playing");
    }

    @Override
    public void makeNoise(){
        System.out.println(getName()+" Bhow Bhow");
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
