package com.javaguru.student_igors_jurkovs.lesson_10.level_4_junior;

class KelvinConverter implements TemperatureConverter {

    @Override
    public double convert(double celsiusTemperature) {
        return celsiusTemperature + 273.15;
    }
}
