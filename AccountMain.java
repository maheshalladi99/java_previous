package com.maheshalladi;

public class AccountMain {
    public static void main(String[] args) {
        Account testAccount=new Account(112,20000,4.5);
        if(testAccount.withdraw(2500))
            System.out.println("with draw successful");
        else
            System.out.println("not successfully");
        testAccount.deposit(3000);
        System.out.println("Account Id:"+testAccount.getId()+"\nAccount Balance:"+testAccount.getBalance()+"\nAccount Interest:"+testAccount.getAnnualInterestRate());

    }
}
