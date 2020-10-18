package com.javaguru.student_igors_gergeleziu.lesson_4.level_5;

class LightColorDetectorTest {

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
        LightColorDetector detector = new LightColorDetector();
        LightColorDetectorTest test = new LightColorDetectorTest();
        boolean result = test.cicleTest(waveLengthMin, waveLengthMax, "Violet", detector);
        if (result) System.out.println("violetColorTest = Success");
        else System.out.println("violetColorTest = Fail");
    }

    public void blueColorTest() {
        int waveLengthMin = 450;
        int waveLengthMax = 494;
        LightColorDetector detector = new LightColorDetector();
        LightColorDetectorTest test = new LightColorDetectorTest();
        boolean result = test.cicleTest(waveLengthMin, waveLengthMax, "Blue", detector);
        if (result) System.out.println("blueColorTest = Success");
        else System.out.println("blueColorTest = Fail");
    }

    public void greenColorTest() {
        int waveLengthMin = 495;
        int waveLengthMax = 569;
        LightColorDetector detector = new LightColorDetector();
        LightColorDetectorTest test = new LightColorDetectorTest();
        boolean result = test.cicleTest(waveLengthMin, waveLengthMax, "Green", detector);
        if (result) System.out.println("greenColorTest = Success");
        else System.out.println("greenColorTest = Fail");
    }

    public void yellowColorTest() {
        int waveLengthMin = 570;
        int waveLengthMax = 589;
        LightColorDetector detector = new LightColorDetector();
        LightColorDetectorTest test = new LightColorDetectorTest();
        boolean result = test.cicleTest(waveLengthMin, waveLengthMax, "Yellow", detector);
        if (result) System.out.println("yellowColorTest = Success");
        else System.out.println("yellowColorTest = Fail");
    }

    public void orangeColorTest() {
        int waveLengthMin = 590;
        int waveLengthMax = 619;
        LightColorDetector detector = new LightColorDetector();
        LightColorDetectorTest test = new LightColorDetectorTest();
        boolean result = test.cicleTest(waveLengthMin, waveLengthMax, "Orange", detector);
        if (result) System.out.println("orangeColorTest = Success");
        else System.out.println("orangeColorTest = Fail");
    }

    public void redColorTest() {
        int waveLengthMin = 620;
        int waveLengthMax = 750;
        LightColorDetector detector = new LightColorDetector();
        LightColorDetectorTest test = new LightColorDetectorTest();
        boolean result = test.cicleTest(waveLengthMin, waveLengthMax, "Red", detector);
        if (result) System.out.println("redColorTest = Success");
        else System.out.println("redColorTest = Fail");
    }

    public void invisibleLightColor1Test() {
        int waveLengthMin = 0;
        int waveLengthMax = 379;
        LightColorDetector detector = new LightColorDetector();
        LightColorDetectorTest test = new LightColorDetectorTest();
        boolean result = test.cicleTest(waveLengthMin, waveLengthMax, "Invisible Light", detector);
        if (result) System.out.println("invisibleLightColor1Test = Success");
        else System.out.println("invisibleLightColor1Test = Fail");
    }

    public void invisibleLightColor2Test() {
        int waveLengthMin = 751;
        int waveLengthMax = 1000;
        LightColorDetector detector = new LightColorDetector();
        LightColorDetectorTest test = new LightColorDetectorTest();
        boolean result = test.cicleTest(waveLengthMin, waveLengthMax, "Invisible Light", detector);
        if (result) System.out.println("invisibleLightColor2Test = Success");
        else System.out.println("invisibleLightColor2Test = Fail");
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
}
