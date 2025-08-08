package com.masai;

public abstract class Animal {
    private String name;

    public Animal(){}

    public Animal(String name){
        this.name = name;
    }

    public void eat(){
        System.out.println(name + " is eating");
    }

    public abstract void makeNoise();

    public void sleep(){
        System.out.println(name + " is sleeping");
    }

    public abstract void roam();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
