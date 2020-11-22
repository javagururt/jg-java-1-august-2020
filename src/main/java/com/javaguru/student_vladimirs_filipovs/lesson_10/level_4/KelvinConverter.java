package com.javaguru.student_vladimirs_filipovs.lesson_10.level_4;

import com.javaguru.teacher.codereview.CodeReview;

@CodeReview(approved = true)
class KelvinConverter implements TemperatureConverter {

    @Override
    public double convert(double celsiusTemperature) {
        return celsiusTemperature + 273.15;
    }
}
