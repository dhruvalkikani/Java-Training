package com.masai.entity;

public class Multiply implements MathOperation{
    @Override
    public int operator(int a, int b) {
        return a *b ;
    }
}
