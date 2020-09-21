package com.javaguru.student_maksim_morozov.lesson_5.level_2_inter;

class Task_14 {
    public static void main(String[] args) {
        int [] numbers = new int[3];
        int sumOfNumbers = 0;
        int i;
        for(i = 0; i < 3; i++) {
            numbers[i] =(int) (Math.random() * 10);
            sumOfNumbers += numbers[i]; }
        System.out.println(sumOfNumbers / i);
    }
}
