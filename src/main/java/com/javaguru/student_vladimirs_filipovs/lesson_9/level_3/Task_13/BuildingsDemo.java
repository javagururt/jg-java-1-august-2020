package com.javaguru.student_vladimirs_filipovs.lesson_9.level_3.Task_13;

import com.javaguru.teacher.codereview.CodeReview;

@CodeReview(approved = true)
class BuildingsDemo {
    public static void main(String[] args) {
        House house = new House("My house", 6, 5.85);
        Tower tower = new Tower("Tokyo tower", 12.2);
        System.out.println("Houses the first flour area is: " + house.firstFlourArea());
        System.out.println("Towers the first flour area is: " + tower.firstFlourArea());
    }
}
