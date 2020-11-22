package com.javaguru.student_ivan_shulga.lesson_9.level_6_middle;

/*
Varargs — или Variable Arguments — это технология, которая позволяет создавать методы с произвольным количеством аргументов.
(сокращение термина variable-length arguments — аргументы переменной длины)
Фича, которая появилась еще в JDK5. Varargs позволяют нам создавать методы с произвольным количеством аргументов.

 */

class Task_30 {

    public int sumAll(int ... numbers) {
        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            sum = sum + numbers[i];
        }
        return sum;
    }

    public void printAll(int ... numbers) {
        int sum = 0;
        System.out.println("Передано чисел: " + numbers.length + ";");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Под индексом " + i + " число " + numbers[i] + ";");

        }

    }

}

class Task_30_Demo {

    public static void main(String[] args) {

        Task_30 demoTask_30 = new Task_30();

        int[] testInt = {2,2,3,13,22};

        int sum = demoTask_30.sumAll(testInt);

        demoTask_30.printAll(testInt);

        System.out.println("Сумма чисел равна: " + sum);

    }

}
