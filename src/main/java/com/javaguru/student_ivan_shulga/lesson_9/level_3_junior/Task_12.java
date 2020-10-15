package com.javaguru.student_ivan_shulga.lesson_9.level_3_junior;

abstract class LoanSystem2 {

    abstract boolean canReceiveLoan(Human human);

    private class Human {
    }
}

/*
Исправьте код программы так, что бы он компилировался.
Реализовывать метод canReceiveLoan() нельзя.

class LoanSystem {

    abstract boolean canReceiveLoan(Human human);

}
 */