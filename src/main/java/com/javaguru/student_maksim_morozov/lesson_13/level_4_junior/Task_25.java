package com.javaguru.student_maksim_morozov.lesson_13.level_4_junior;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

class Task_25 {
    static class OutOfMemoryError{
        public static void main(String[] args){
            List<Integer> integers = new LinkedList<>();
            Random random = new Random();
            while (true){
                int randomValue = random.nextInt();
                integers.add(randomValue);
            }
        }
    }
}
