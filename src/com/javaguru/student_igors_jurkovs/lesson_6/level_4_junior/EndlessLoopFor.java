package com.javaguru.student_igors_jurkovs.lesson_6.level_4_junior;
/*
Task 15 and 16
 */
public class EndlessLoopFor {
    public static void main(String[] args) {
        for (int i = 0; i >= 0; i++) {
            System.out.println(i);
            if (i == 100) {
                break;
            }
        }
    }
}
