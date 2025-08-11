package org.example.exception;

public class DepositLimit extends RuntimeException {
    public DepositLimit(String message) {
        super(message);
    }

    public DepositLimit(){}

    private String msg;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }


}
