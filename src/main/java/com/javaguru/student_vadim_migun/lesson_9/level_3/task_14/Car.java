package com.javaguru.student_vadim_migun.lesson_9.level_3.task_14;

import com.javaguru.teacher.codereview.CodeReview;

/*
Исправьте код программы так, что бы он компилировался.
Класс Car менять нельзя.
Классы ElectricCar и PetrolCar должны наследоваться
от класса Car.


abstract class Car {

    abstract void accelerate();

}

class ElectricCar extends Car {

    private int batteryCharge;


}

class PetrolCar extends Car {

    private double petrolTankCapacity;

}
 */
@CodeReview(approved = true)
abstract class Car {

    abstract void accelerate();

}

abstract class ElectricCar extends Car {

    private int batteryCharge;


}

abstract class PetrolCar extends Car {

    private double petrolTankCapacity;

}