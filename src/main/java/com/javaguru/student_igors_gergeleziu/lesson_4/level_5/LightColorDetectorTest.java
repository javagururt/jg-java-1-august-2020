package com.javaguru.student_igors_gergeleziu.lesson_4.level_5;

class LightColorDetectorTest {

    private LightColorDetector detector = new LightColorDetector();

    public static void main(String[] args) {
        LightColorDetectorTest test = new LightColorDetectorTest();
        test.violetColorTest();
        test.blueColorTest();
        test.greenColorTest();
        test.yellowColorTest();
        test.orangeColorTest();
        test.redColorTest();
        test.invisibleLightColor1Test();
        test.invisibleLightColor2Test();
    }

    public void violetColorTest() {
        int waveLengthMin = 380;
        int waveLengthMax = 440;
        LightColorDetectorTest test = new LightColorDetectorTest();
        boolean result = test.cicleTest(waveLengthMin, waveLengthMax, "Violet", detector);
        checkResults(result, "violetColorTest");
    }

    public void blueColorTest() {
        int waveLengthMin = 450;
        int waveLengthMax = 494;
        LightColorDetectorTest test = new LightColorDetectorTest();
        boolean result = test.cicleTest(waveLengthMin, waveLengthMax, "Blue", detector);
        checkResults(result, "blueColorTest");
    }

    public void greenColorTest() {
        int waveLengthMin = 495;
        int waveLengthMax = 569;
        LightColorDetectorTest test = new LightColorDetectorTest();
        boolean result = test.cicleTest(waveLengthMin, waveLengthMax, "Green", detector);
        checkResults(result, "greenColorTest");
    }

    public void yellowColorTest() {
        int waveLengthMin = 570;
        int waveLengthMax = 589;
        LightColorDetectorTest test = new LightColorDetectorTest();
        boolean result = test.cicleTest(waveLengthMin, waveLengthMax, "Yellow", detector);
        checkResults(result, "yellowColorTest");
    }

    public void orangeColorTest() {
        int waveLengthMin = 590;
        int waveLengthMax = 619;
        LightColorDetectorTest test = new LightColorDetectorTest();
        boolean result = test.cicleTest(waveLengthMin, waveLengthMax, "Orange", detector);
        checkResults(result, "orangeColorTest");
    }

    public void redColorTest() {
        int waveLengthMin = 620;
        int waveLengthMax = 750;
        LightColorDetectorTest test = new LightColorDetectorTest();
        boolean result = test.cicleTest(waveLengthMin, waveLengthMax, "Red", detector);
        checkResults(result, "redColorTest");
    }

    public void invisibleLightColor1Test() {
        int waveLengthMin = 0;
        int waveLengthMax = 379;
        LightColorDetectorTest test = new LightColorDetectorTest();
        boolean result = test.cicleTest(waveLengthMin, waveLengthMax, "Invisible Light", detector);
        checkResults(result, "invisibleLightColor1Test");
    }

    public void invisibleLightColor2Test() {
        int waveLengthMin = 751;
        int waveLengthMax = 1000;
        LightColorDetectorTest test = new LightColorDetectorTest();
        boolean result = test.cicleTest(waveLengthMin, waveLengthMax, "Invisible Light", detector);
        checkResults(result, "invisibleLightColor2Test");
    }

    public boolean cicleTest(int waveLengthMin, int waveLengthMax, String color, LightColorDetector detector) {
        int missmatch = 0;
        for (int i = waveLengthMin; i <= waveLengthMax; i++) {
            if (detector.detect(i) != color) {
                missmatch += 1;
            }
        }
        if (missmatch > 0) return false;
        else return true;
    }

    public void checkResults(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " = Success");
        } else {
            System.out.println(testName + "= Fail");
        }
    }
}
