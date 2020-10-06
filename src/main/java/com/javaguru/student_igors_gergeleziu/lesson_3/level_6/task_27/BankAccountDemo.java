package com.javaguru.student_igors_gergeleziu.lesson_3.level_6.task_27;

import com.javaguru.teacher.codereview.CodeReview;

@CodeReview(approved = true)
 class BankAccountDemo {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount("Viktor", 1000000);
        String ownerFirstName = bankAccount.getOwner();
        int moneyAmount = bankAccount.getMoney();
        System.out.println("Owner = " + ownerFirstName);
        System.out.println("Money = " + moneyAmount);
    }

}
