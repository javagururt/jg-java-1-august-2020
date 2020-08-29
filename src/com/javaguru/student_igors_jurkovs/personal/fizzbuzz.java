package com.javaguru.student_igors_jurkovs.personal;

import com.javaguru.teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class fizzbuzz {
    public static void main(String[] args) {
        int i = 1;
        while(i <= 100) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.print("FizzBuzz, ");
            }
            else if (i % 3 == 0) {
                System.out.print("Fizz, ");
            }
            else if (i % 5 == 0) {
                System.out.print("Buzz, ");
            }
            else {
                System.out.print(i + ", ");
            }
            i++;
        }
    }
}
