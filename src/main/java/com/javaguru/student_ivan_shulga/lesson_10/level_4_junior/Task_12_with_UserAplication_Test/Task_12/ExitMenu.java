package com.javaguru.student_ivan_shulga.lesson_10.level_4_junior.Task_12_with_UserAplication_Test.Task_12;

class ExitMenu implements TemperatureConverter {

    @Override
    public void convert() {
        System.out.println("See you again!");
        System.exit(0);
    }

    @Override
    public String getMenuName() {
        return "Exit.";
    }

}
