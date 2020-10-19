package com.javaguru.student_igors_jurkovs.lesson_9.level_6_middle;

import com.javaguru.teacher.codereview.CodeReview;

@CodeReview(approved = true)
class VarArgsExample {

    int sumOfAllNumbers(int ... numbers) {
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        
        return sum;
    }
}
