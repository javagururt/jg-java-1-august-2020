package com.javaguru.student_ivan_shulga.lesson_10.level_4_junior.Task_12_with_UserAplication_Test.Task_12;
// тест менюшки консольной на основе предыдущего задания Task_12 lesson_10 для закрепления/повторения

class MenuStarter {

    public static void main(String[] args) {

        FahrenheitConverter farConv = new FahrenheitConverter();
        KelvinConverter kelConv = new KelvinConverter();
        CelsiusConverter celConv = new CelsiusConverter();

        ExitMenu exitMenu = new ExitMenu();

        TemperatureConverter[] menus = new TemperatureConverter[4];
        menus[0] = farConv;
        menus[1] = kelConv;
        menus[2] = celConv;
        menus[3] = exitMenu;

        MenuExecutor menuExecutor = new MenuExecutor(menus);
        menuExecutor.start();
    }

}
