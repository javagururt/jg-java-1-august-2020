package com.javaguru.student_igors_gergeleziu.lesson_3.level_6.task_27;

 class BankAccount {

    private String owner;
    private int money;

    public BankAccount(String owner, int moneyAmount) {
        this.owner = owner;
        this.money=moneyAmount;
    }

    public String getOwner() {
        return this.owner;
    }

    public int getMoney() {
        return money;
    }

}
