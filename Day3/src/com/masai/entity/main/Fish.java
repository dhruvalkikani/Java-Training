package com.masai.entity.main;

public class Fish extends Animal {
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
}
