package com.javaguru.student_ivan_shulga.lesson_3.level_6;
/*
Найти логическую ошибку в коде.
Исправить и запустить программу так, что бы она выводила
на консоль владельца банковского счёта и количество денег.
Менять можно только класс BankAccount.
*/

// !!! В данный момент смог решить задачу только меняя оба класса, изменения отмечены!!!

class BankAccount {

    private String owner;
    private int money;

    public BankAccount(String owner, int money) {  // добавлео "String owner", изменено moneyAmount на money
        this.owner = owner;
        this.money = money;
    }

    public String getOwner() {
        return this.owner;
    }

    public int getMoney() {    //  изменено void  на  int
        return this.money;
    }

}

class BankAccountDemo {

    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount("Viktor", 100000);
        String owner = bankAccount.getOwner();         // ownerFirstName
        int money = bankAccount.getMoney();               //String изменено на int и moneyAmount на money
        System.out.println("Owner = " + owner);
        System.out.println("Money = " + money);
    }

}
