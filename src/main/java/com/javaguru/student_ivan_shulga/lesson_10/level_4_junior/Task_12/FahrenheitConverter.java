package com.javaguru.student_ivan_shulga.lesson_10.level_4_junior.Task_12;

class FahrenheitConverter implements TemperatureConverter {

    @Override
    public double convert(double celsiusTemperature) {
        return 1.8 * celsiusTemperature + 32;
    }

}
