package com.javaguru.student_vladimirs_filipovs.lesson_4.level_5;

import com.javaguru.teacher.codereview.CodeReview;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
@CodeReview(approved = true)
public class LightColorDetectorTest {
    private LightColorDetector victim;

    @Before
    public void setUp() {
        victim = new LightColorDetector();
    }

    @Test
    public void colourShouldBeViolet() {
        String actualResult = victim.detect(444);
        assertEquals("Violet", actualResult);
    }

    @Test
    public void colourShouldBeBlue() {
        String actualResult = victim.detect(455);
        assertEquals("Blue", actualResult);
    }

    @Test
    public void colourShouldBeGreen() {
        String actualResult = victim.detect(555);
        assertEquals("Green", actualResult);
    }

    @Test
    public void colourShouldBeYellow() {
        String actualResult = victim.detect(589);
        assertEquals("Yellow", actualResult);
    }

    @Test
    public void colourShouldBeOrange() {
        String actualResult = victim.detect(590);
        assertEquals("Orange", actualResult);
    }

    @Test
    public void colourShouldBeRed() {
        String actualResult = victim.detect(666);
        assertEquals("Red", actualResult);
    }

    @Test
    public void colourShouldBeInvisibleLight() {
        String actualResult = victim.detect(-111);
        assertEquals("Invisible Light", actualResult);
    }
}