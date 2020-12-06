package com.javaguru.student_maksim_morozov.lesson_10.level_4_junior;

public class FahrenheitConverter implements TemperatureConverter{
    @Override
    public double convert(double celsiusTemperature) {
        return 1.8 * celsiusTemperature + 32;
    }
}
