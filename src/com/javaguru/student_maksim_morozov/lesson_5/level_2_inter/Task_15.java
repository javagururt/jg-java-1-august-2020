package com.javaguru.student_maksim_morozov.lesson_5.level_2_inter;

class Task_15 {
    public static void main(String[] args) {
        int [] numbers = new int[3];
        for(int i = 0; i < 3; i++) {
            numbers[i] =(int) (Math.random() * 10);
            System.out.println(numbers[i]);
            numbers[i] += 2; }
        System.out.println("Array elements after +2:");
        System.out.println(numbers[0]);
        System.out.println(numbers[1]);
        System.out.println(numbers[2]);
    }
}
