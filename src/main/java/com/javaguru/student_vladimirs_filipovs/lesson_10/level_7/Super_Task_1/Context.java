package com.javaguru.student_vladimirs_filipovs.lesson_10.level_7.Super_Task_1;

import java.math.BigDecimal;

class Context {
    private Shape shape;

    public Context(Shape shape) {
        this.shape = shape;
    }

    public BigDecimal executeCalculation(BigDecimal firstLength, BigDecimal secondLength) {
        return shape.calculateArea(firstLength, secondLength);
    }
}
