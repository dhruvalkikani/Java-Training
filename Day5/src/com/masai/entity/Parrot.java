package com.masai.entity;

public class Parrot extends  Bird implements Flyable{
    public Parrot(String name) {
        super(name);
    }

    @Override
    public void makeNoise() {
        System.out.println(getName()+" com.masai.entity.main.Parrot");
    }

    @Override
    public void roam() {
        System.out.println(getName()+" Roaming");
    }

    public Parrot() {
    }

    @Override
    public void fly() {
        System.out.println(getName()+" Flying");
    }
}
