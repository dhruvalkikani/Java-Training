package com.masai.entity.main;

public class Bat extends Animal {
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
}
