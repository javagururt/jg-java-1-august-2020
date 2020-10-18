package com.javaguru.student_igors_jurkovs.lesson_9.level_1_intern;

import com.javaguru.teacher.codereview.CodeReview;

@CodeReview(approved = true)
class DefaultConstructorExampleDemo {

    public static void main(String[] args) {

        DefaultConstructorExample defaultConstructorExample = new DefaultConstructorExample();

        defaultConstructorExample.printInfo();

        DefaultConstructorExample2 defaultConstructorExample2 = new DefaultConstructorExample2();

        defaultConstructorExample2.printInfo();
    }
}
