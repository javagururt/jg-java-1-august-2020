package com.javaguru.student_vladimir_larin.lesson_3.level_6;

class BankAccount {

    private String owner;
    private int money;

    public BankAccount(String owner, int money) {
        this.owner = owner;
        this.money = money;
    }

    public String getOwner() {
        return owner;
    }

    public int getMoney() {
        return money;
    }
}
