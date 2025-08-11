package org.example.service;

public interface BankAccountService {

    public double checkBalance(long custAccountNumber);
    public double withdrawAmount(long custAccountNumber,double amount);
    public double depositAmount(long custAccountNumber,double amount);
}
