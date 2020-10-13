package com.javaguru.student_igors_jurkovs.lesson_9.level_6_middle;

class VarArgsExample {

    int sumOfAllNumbers(int ... numbers) {
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        
        return sum;
    }
}
