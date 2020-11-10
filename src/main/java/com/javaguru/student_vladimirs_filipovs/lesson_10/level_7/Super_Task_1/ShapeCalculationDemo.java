package com.javaguru.student_vladimirs_filipovs.lesson_10.level_7.Super_Task_1;

import java.math.BigDecimal;

class ShapeCalculationDemo {
    public static void main(String[] args) {
        Context context = new Context(new Rectangle());
        System.out.println("Rectangle area is: " + context.executeCalculation(BigDecimal.valueOf(7), BigDecimal.valueOf(3)));

        context = new Context(new Rhombus());
        System.out.println("Rhombus area is: " + context.executeCalculation(BigDecimal.valueOf(3), BigDecimal.valueOf(5)));
    }
}
