package com.javaguru.student_nikolajs_sersnovs.lesson_3.level_6;
/*
Найти логическую ошибку в коде.
Исправить и запустить программу так, что бы она выводила
на консоль владельца банковского счёта и количество денег.
Менять можно только класс BankAccount.
 */

import com.javaguru.teacher.codereview.CodeReview;

/*
В задании сказано что можно менять только BankAccount, но без вмешательства в BankAccountDemo невозможно было запустить код.
В этих трех строках были ошибки:
        String moneyAmount = bankAccount.getMoney();
        System.out.println("Owner = " + owner);
        System.out.println("Money = " + money);
 */
@CodeReview(approved = true)
class BankAccount {

    private String owner;
    private int  money;

    public BankAccount(String owner,int moneyAmount) {
        this.owner = owner;
        this.money = moneyAmount;
    }

    public String getOwner() {
        return this.owner;
    }

    public int getMoney() {
        return this.money;
    }

}

class BankAccountDemo {

    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount("Viktor", 100000);
        String ownerFirstName = bankAccount.getOwner();
        int moneyAmount = bankAccount.getMoney();
        System.out.println("Owner = " + ownerFirstName);
        System.out.println("Money = " + moneyAmount);
    }

}
