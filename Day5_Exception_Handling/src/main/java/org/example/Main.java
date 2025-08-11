package org.example;

import org.example.exception.UnsufficientBalance;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    static void division(int a,int b){
        int nums [] = {1,2,3,4,5};
        try {
            System.out.println((a / b));
            System.out.println("Array element: " + nums[6]);
        }
        catch (ArithmeticException | ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Something went wrong ..!");
            e.printStackTrace();
            System.out.println(e.getMessage());

        }

    }

    static int divisionVersion2(int a,int b){
        int div =0;

        try {
            if (b == 0) {
                throw new ArithmeticException("Zero se mat kar bhai");
            }
            else {
                div = a/b;
            }
        }
        catch (ArithmeticException e)
        {
            System.out.println("Something went wrong ..!");
            System.out.println(e.getMessage());

        }
        return div;

    }


    public static void main(String[] args) {//TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.

//       int result =  divisionVersion2(15,0);
//        System.out.println(result);
//
//        division(1,0);

        BankAccount bankAccount1 = new BankAccount("Omesh",1,123456,10000,3000);
        BankTransactions t1 = new BankTransactions();

        System.out.println("Balance in your account - " + t1.checkBalance(bankAccount1));

        t1.withdrawAmount(bankAccount1,15000);
        System.out.println("Current Balance " + bankAccount1.getCustAccountBalance());

        t1.depositAmount(bankAccount1,5000);
        System.out.println("Current Balance " + bankAccount1.getCustAccountBalance());


    }
}