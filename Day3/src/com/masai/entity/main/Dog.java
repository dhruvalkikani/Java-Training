package com.masai.entity.main;

public class Dog extends Animal {

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

}
