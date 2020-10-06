package com.javaguru.student_igors_jurkovs.lesson_3.level_4;

import com.javaguru.teacher.codereview.CodeReview;

/*
Найти ошибку в коде.
Исправить и запустить программу.
 */
@CodeReview(approved = true)
class BankAccount {

    private String ownerFirstName;
    private String ownerLastName;
    private int moneyAmount;

    public BankAccount(String ownerFirstName, String ownerLastName, int moneyAmount) {
        this.ownerFirstName = ownerFirstName;
        this.ownerLastName = ownerLastName;
        this.moneyAmount = moneyAmount; // неправильная переменная
    }

    public String getOwnerFirstName() { // пропущена закрывающая круглая скобка
        return this.ownerFirstName; // пропущена ";"
    }

    public String getOwnerLastName() { // пропущена открывающая круглая скобка
        return this.ownerLastName; // пропущена ";", неправильная переменная ownerFirstName ---> ownerLastName
    }

    public int getMoneyAmount() { // void ничего не возваращает
        return this.moneyAmount;
    }

}

class BankAccountDemo {

    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount("Viktor", "Savonin", 100000);
        String ownerFirstName = bankAccount.getOwnerFirstName();
        String ownerLastName = bankAccount.getOwnerLastName(); // неправильная переменная ownerFirstName ---> ownerLastName
        int moneyAmount = bankAccount.getMoneyAmount(); // неправильно указан тип данных
        System.out.println("Owner first name = " + ownerFirstName);
        System.out.println("Owner last name = " + ownerLastName);
        System.out.println("Money amount = " + moneyAmount);
    }

}
