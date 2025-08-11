package org.example.service;

import org.example.BankAccount;
import org.example.exception.UnsufficientBalance;

public interface BankAccountService {

    public double checkBalance(BankAccount account);
    public double withdrawAmount(BankAccount account, double amount) throws UnsufficientBalance;
    public double depositAmount(BankAccount account, double amount);
}
