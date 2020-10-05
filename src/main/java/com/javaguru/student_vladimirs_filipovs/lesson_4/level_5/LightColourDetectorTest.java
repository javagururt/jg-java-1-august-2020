package com.javaguru.student_vladimirs_filipovs.lesson_4.level_5;

import com.javaguru.teacher.codereview.CodeReview;

@CodeReview(approved = true)
class LightColourDetectorTest {
    public static void main(String[] args) {
        LightColourDetectorTest testRunner = new LightColourDetectorTest();
        testRunner.testViolet();
        testRunner.testBlue();
        testRunner.testGreen();
        testRunner.testYellow();
        testRunner.testOrange();
        testRunner.testRed();
        testRunner.testInvisibleLight();
    }

    void testViolet() {
        LightColorDetector lightColorDetector = new LightColorDetector();
        int waveLength = 400;
        String expectedColor = "Violet";
        String result = lightColorDetector.detect(waveLength);
        if (result == expectedColor) {
            System.out.println("testViolet: SUCCESS");
        } else {
            System.out.println("testViolet: FAIL");
        }
    }

    void testBlue() {
        LightColorDetector lightColorDetector = new LightColorDetector();
        int waveLength = 455;
        String expectedColor = "Blue";
        String result = lightColorDetector.detect(waveLength);
        if (result == expectedColor) {
            System.out.println("testBlue: SUCCESS");
        } else {
            System.out.println("testBlue: FAIL");
        }
    }

    void testGreen() {
        LightColorDetector lightColorDetector = new LightColorDetector();
        int waveLength = 555;
        String expectedColor = "Green";
        String result = lightColorDetector.detect(waveLength);
        if (result == expectedColor) {
            System.out.println("testGreen: SUCCESS");
        } else {
            System.out.println("testGreen: FAIL");
        }
    }

    void testYellow() {
        LightColorDetector lightColorDetector = new LightColorDetector();
        int waveLength = 577;
        String expectedColor = "Yellow";
        String result = lightColorDetector.detect(waveLength);
        if (result == expectedColor) {
            System.out.println("testYellow: SUCCESS");
        } else {
            System.out.println("testYellow: FAIL");
        }
    }

    void testOrange() {
        LightColorDetector lightColorDetector = new LightColorDetector();
        int waveLength = 611;
        String expectedColor = "Orange";
        String result = lightColorDetector.detect(waveLength);
        if (result == expectedColor) {
            System.out.println("testOrange: SUCCESS");
        } else {
            System.out.println("testOrange: FAIL");
        }
    }

    void testRed() {
        LightColorDetector lightColorDetector = new LightColorDetector();
        int waveLength = 666;
        String expectedColor = "Red";
        String result = lightColorDetector.detect(waveLength);
        if (result == expectedColor) {
            System.out.println("testRed: SUCCESS");
        } else {
            System.out.println("testRed: FAIL");
        }
    }

    void testInvisibleLight() {
        LightColorDetector lightColorDetector = new LightColorDetector();
        int waveLength = 777;
        String expectedColor = "Invisible Light";
        String result = lightColorDetector.detect(waveLength);
        if (result == expectedColor) {
            System.out.println("testInvisibleLight: SUCCESS");
        } else {
            System.out.println("testInvisibleLight: FAIL");
        }
    }
}
