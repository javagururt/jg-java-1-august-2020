package com.javaguru.student_ivan_shulga.lesson_10.level_4_junior.Task_12;

import java.util.Scanner;

class KelvinConverter implements TemperatureConverter {

    @Override
    public double convert(double celsiusTemperature) {
        return celsiusTemperature + 273.15;
    }

}
