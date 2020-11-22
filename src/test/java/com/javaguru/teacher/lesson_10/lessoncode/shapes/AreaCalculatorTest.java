package com.javaguru.teacher.lesson_10.lessoncode.shapes;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class AreaCalculatorTest {

    private AreaCalculator victim = new AreaCalculator();

    @Test
    public void shouldCalculateAreas() {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle("Red", 10);
        shapes[1] = new Square("Black", 30);
        shapes[2] = new Square("Green", 20);

        double totalArea = victim.calculateTotalArea(shapes);

        assertEquals(1614.16, totalArea, 0.001);
    }
}