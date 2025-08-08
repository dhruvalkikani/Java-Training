package com.masai.entity;

public class Addition implements MathOperation{
    public Addition() {
    }

    @Override
    public int operator(int a, int b) {
        return a+b;
    }
}
