package com.masai.entity;

import com.masai.enums.OrderStatus;

public class Order {

    int orderId;
    OrderStatus status;

    public Order(OrderStatus status, int orderId) {
        this.status = status;
        this.orderId = orderId;
    }

    public void printStatus(){
        System.out.println("Order ID: " + orderId + " is " + status);
    }
}
