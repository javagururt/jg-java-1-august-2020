package com.javaguru.student_vladimir_petranovski.lesson_9.level_3.task_12;

import com.javaguru.teacher.codereview.CodeReview;

/*
Исправьте код программы так, что бы он компилировался.
Реализовывать метод canReceiveLoan() нельзя.

class LoanSystem {

    abstract boolean canReceiveLoan(Human human);

}
 */
@CodeReview(approved = true)
abstract class LoanSystem {
    abstract boolean canReceiveLoan();
}
