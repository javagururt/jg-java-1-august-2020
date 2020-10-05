package com.javaguru.student_igors_jurkovs.personal;

import com.javaguru.teacher.codereview.CodeReview;
import com.javaguru.teacher.codereview.CodeReviewComment;

import java.util.Scanner;

@CodeReview(approved = true)
@CodeReviewComment(teacher = "методы encode/decode могут принимать аргументы из вне" +
        " (к примеру аргументы можно получить в мейн методе, а затем уже передать в encode," +
        " это позволит переиспользовать код.")
class Encoder {

    char userChar;
    int aCode;

    void encode(int aCode) {
        userChar = (char) aCode;
        System.out.println("Your char is: " + userChar);
    }

    void decode(char userChar) {
        aCode = userChar;
        System.out.println("Your ASCII is: " + aCode);
    }
}

