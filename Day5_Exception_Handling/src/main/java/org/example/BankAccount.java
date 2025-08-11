package org.example;

public class BankAccount {

    private String cutName;
    private int custID;
    private long custAccountNumber;
    private  double custAccountBalance;
    private double limit;

    public String getCutName() {
        return cutName;
    }

    public void setCutName(String cutName) {
        this.cutName = cutName;
    }

    public int getCustID() {
        return custID;
    }

    public void setCustID(int custID) {
        this.custID = custID;
    }

    public long getCustAccountNumber() {
        return custAccountNumber;
    }

    public void setCustAccountNumber(long custAccountNumber) {
        this.custAccountNumber = custAccountNumber;
    }

    public double getCustAccountBalance() {
        return custAccountBalance;
    }

    public void setCustAccountBalance(double custAccountBalance) {
        this.custAccountBalance = custAccountBalance;
    }

    public double getLimit() {
        return limit;
    }

    public BankAccount(String cutName, int custID, long custAccountNumber, double custAccountBalance, double limit) {
        this.cutName = cutName;
        this.custID = custID;
        this.custAccountNumber = custAccountNumber;
        this.custAccountBalance = custAccountBalance;
        this.limit = limit;
    }

    public void setLimit(double limit) {
        this.limit = limit;
    }
}
