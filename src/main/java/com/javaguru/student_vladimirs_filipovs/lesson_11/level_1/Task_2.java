package com.javaguru.student_vladimirs_filipovs.lesson_11.level_1;

import java.util.ArrayList;
import java.util.LinkedList;

class Task_2 {
    public static void main(String[] args) {

        ArrayList<String> car1 = new ArrayList<>();
        ArrayList<Integer> car2 = new ArrayList<>();
        ArrayList<Double> car3 = new ArrayList<>();
        ArrayList<Long> car4 = new ArrayList<>();
        ArrayList<Boolean> car5 = new ArrayList<>();

        LinkedList<String> moto1 = new LinkedList<>();
        LinkedList<Integer> moto2 = new LinkedList<>();
        LinkedList<Double> moto3 = new LinkedList<>();
        LinkedList<Long> moto4 = new LinkedList<>();
        LinkedList<Boolean> moto5 = new LinkedList<>();

        String bestCar = "Alfa Romeo";
        String worstedCar = "Lada";
        car1.add(bestCar);
        car1.add(worstedCar);

        int aNumber = 3;
        int bNumber = 4;
        car2.add(aNumber);
        car2.add(bNumber);

        int sumAB = 0;
        for (Integer integer : car2) {
            sumAB += integer;
        }
        System.out.println(sumAB);
    }
}
