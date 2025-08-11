package org.example;

import org.example.exception.DepositLimit;
import org.example.exception.UnsufficientBalance;
import org.example.service.BankAccountService;

public class BankTransactions implements BankAccountService {
    @Override
    public double checkBalance(BankAccount account) {

        return account.getCustAccountBalance();
    }

    @Override
    public double withdrawAmount(BankAccount account, double amount) {

        double currentBalance = account.getCustAccountBalance();
        try {
            if (currentBalance < 0 || currentBalance < amount) {
               throw new UnsufficientBalance("Get Rich");
            }
            else
            {
                account.setCustAccountBalance(account.getCustAccountBalance()-amount);
                System.out.println("Amount Withdrawn Successful ");

            }
        }

        catch (UnsufficientBalance e)
        {
            System.out.println("Your Current Balance is insufficient " + account.getCustAccountBalance());
        }

        return account.getCustAccountBalance();
    }

    @Override
    public double depositAmount(BankAccount account, double amount) {

        double currentBalance = account.getCustAccountBalance();
        try {
            if (amount >= account.getLimit()) {
                throw new DepositLimit("Max Deposit Reached");
            } else {
                account.setCustAccountBalance(account.getCustAccountBalance() + amount);
                System.out.println("Amount deposited Successful ");
            }
        }
        catch (DepositLimit d){

            System.out.println("Your Deposit limit is " + account.getLimit());
        }

        return account.getCustAccountBalance();
    }

}
