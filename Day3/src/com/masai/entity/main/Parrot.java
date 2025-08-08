package com.masai;

public class Parrot extends  Bird{
    public Parrot(String name) {
        super(name);
    }

    @Override
    public void makeNoise() {
        System.out.println(getName()+" com.masai.Parrot");
    }

    @Override
    public void roam() {
        System.out.println(getName()+" Roaming");
    }

    public Parrot() {
    }
}
