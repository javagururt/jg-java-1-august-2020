package com.javaguru.student_vadim_migun.lesson_4.level_5_middle;

import org.junit.Test;

import static org.junit.Assert.*;

public class LightColorDetectorTest {

    LightColorDetector victim = new LightColorDetector();


    @Test
    public void colourShouldViolet() {
        String actual = victim.detect(385);
        assertEquals("Color detect", "Violet", actual);
    }

    @Test
    public void colourShouldBlue() {
        String actual = victim.detect(460);
        assertEquals("Color detect", "Blue", actual);
    }

    @Test
    public void colourShouldGreen() {
        String actual = victim.detect(500);
        assertEquals("Color detect", "Green", actual);
    }

    @Test
    public void colourShouldYellow() {
        String actual = victim.detect(580);
        assertEquals("Color detect", "Yellow", actual);
    }

    @Test
    public void colourShouldOrange() {
        String actual = victim.detect(600);
        assertEquals("Color detect", "Orange", actual);
    }

    @Test
    public void colourShouldRed() {
        String actual = victim.detect(650);
        assertEquals("Color detect", "Red", actual);
    }

    @Test
    public void colourShouldInvisibleLight() {
        String actual = victim.detect(200);
        assertEquals("Color detect", "Invisible Light", actual);
    }


}