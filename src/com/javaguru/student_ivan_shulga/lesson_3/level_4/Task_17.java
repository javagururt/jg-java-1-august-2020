package com.javaguru.student_ivan_shulga.lesson_3.level_4;

import com.javaguru.teacher.codereview.CodeReview;

//Найти ошибку в коде.
//Исправить и запустить программу.
@CodeReview(approved = true)
class BankAccount {

    private String ownerFirstName;
    private String ownerLastName;
    private int moneyAmount;

    public BankAccount(String ownerFirstName,
                       String ownerLastName,    //добавлено  ","
                       int moneyAmount) {
        this.ownerFirstName = ownerFirstName;
        this.ownerLastName = ownerLastName;
        this.moneyAmount = moneyAmount;         //изменено  "money" на "moneyAmount"
    }

    public String getOwnerFirstName() {         //добавлено  ")"
        return this.ownerFirstName;             //добавлено  ";"
    }

    public String getOwnerLastName() {          //добавлено   "("
        return this.ownerLastName;             //добавлено   ";"
    }

    public int getMoneyAmount() {               //добавлено "int"
        return this.moneyAmount;
    }

}

class BankAccountDemo {

    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount("Viktor", "Savonin", 100000);
        String ownerFirstName = bankAccount.getOwnerFirstName();
        String ownerLastName = bankAccount.getOwnerLastName();   //изменено "ownerFirstName" на "ownerLastName"
        int moneyAmount = bankAccount.getMoneyAmount();   //изменено "String" на "int"
        System.out.println("Owner first name = " + ownerFirstName);
        System.out.println("Owner last name = " + ownerLastName);
        System.out.println("Money amount = " + moneyAmount);
    }

}
