package com.javaguru.student_vladimirs_filipovs.lesson_10.level_7.Super_Task_1;

import java.math.BigDecimal;
import java.math.RoundingMode;

class Rhombus implements Shape {
    @Override
    public BigDecimal calculateArea(BigDecimal firstLength, BigDecimal secondLength) {
        return ((firstLength.multiply(secondLength))
                .divide(BigDecimal.valueOf(2)))
                .setScale(2, RoundingMode.HALF_UP);
    }
}
