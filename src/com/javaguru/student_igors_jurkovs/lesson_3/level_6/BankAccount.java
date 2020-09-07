package com.javaguru.student_igors_jurkovs.lesson_3.level_6;

import com.javaguru.teacher.codereview.CodeReview;

/*
Task_27
 */
@CodeReview(approved = true)
class BankAccount {

    private String owner;
    private int money;

    BankAccount(String owner, int moneyAmount) {
        this.money = moneyAmount;
        this.owner = owner;
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
