package org.example.exception;

public class UnsufficientBalance extends Exception {

    private String msg;

    public UnsufficientBalance(String message) {
        super(message);
    }
    public UnsufficientBalance() {
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
