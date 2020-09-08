package com.javaguru.student_igors_jurkovs.lesson_4.level_5_middle;
/*
Функциональные требования:
Программа должна определять цвет в зависимости
от длины волны в соответствии со следующими правилами:

380 ... 449 - Фиолетовый ("Violet")
450 ... 494 - Синий ("Blue")
495 ... 569 - Зеленый ("Green")
570 ... 589 - Желтый ("Yellow")
590 ... 619 - Оранжевый ("Orange")
620 ... 750 - Красный ("Red")
Вне диапазонов - невидимый спектр ("Invisible Light")
 */
class LightColorDetector {

    String color(int waveLength) {
        if (waveLength >= 380 && waveLength <= 449) {
            return "Violet";
        } else if (waveLength >= 450 && waveLength <= 494) {
            return "Blue";
        } else if (waveLength >= 495 && waveLength <= 569) {
            return "Green";
        } else if (waveLength >= 570 && waveLength <= 589) {
            return "Yellow";
        } else if (waveLength >= 590 && waveLength <= 619) {
            return "Orange";
        } else if (waveLength >= 620 && waveLength <= 750) {
            return "Red";
        } else {
            return "Invisible Light";
        }
    }
}

class LightColorDetectorTest {

    public static void main(String[] args) {
        LightColorDetectorTest lightColorDetectorTest = new LightColorDetectorTest();
        lightColorDetectorTest.violetTest();
        lightColorDetectorTest.blueTest();
        lightColorDetectorTest.greenTest();
        lightColorDetectorTest.yellowTest();
        lightColorDetectorTest.orangeTest();
        lightColorDetectorTest.redTest();
        lightColorDetectorTest.invisibleLightTest1();
        lightColorDetectorTest.invisibleLightTest2();
    }

    void violetTest() {
        int waveLength = 400;
        LightColorDetector lightColorDetector = new LightColorDetector();
        String result = lightColorDetector.color(waveLength);
        if (result.equals("Violet")) {
            System.out.println("Violet color test: OK");
        } else {
            System.out.println("Violet color test: FAILED");
        }
    }
    void blueTest() {
        int waveLength = 480;
        LightColorDetector lightColorDetector = new LightColorDetector();
        String result = lightColorDetector.color(waveLength);
        if (result.equals("Blue")) {
            System.out.println("Blue color test: OK");
        } else {
            System.out.println("Blue color test: FAILED");
        }
    }
    void greenTest() {
        int waveLength = 500;
        LightColorDetector lightColorDetector = new LightColorDetector();
        String result = lightColorDetector.color(waveLength);
        if (result.equals("Green")) {
            System.out.println("Green color test: OK");
        } else {
            System.out.println("Green color test: FAILED");
        }
    }
    void yellowTest() {
        int waveLength = 580;
        LightColorDetector lightColorDetector = new LightColorDetector();
        String result = lightColorDetector.color(waveLength);
        if (result.equals("Yellow")) {
            System.out.println("Yellow color test: OK");
        } else {
            System.out.println("Violet color test: FAILED");
        }
    }
    void orangeTest() {
        int waveLength = 600;
        LightColorDetector lightColorDetector = new LightColorDetector();
        String result = lightColorDetector.color(waveLength);
        if (result.equals("Orange")) {
            System.out.println("Orange color test: OK");
        } else {
            System.out.println("Orange color test: FAILED");
        }
    }
    void redTest() {
        int waveLength = 700;
        LightColorDetector lightColorDetector = new LightColorDetector();
        String result = lightColorDetector.color(waveLength);
        if (result.equals("Red")) {
            System.out.println("Red color test: OK");
        } else {
            System.out.println("Red color test: FAILED");
        }
    }
    void invisibleLightTest1() {
        int waveLength = 200;
        LightColorDetector lightColorDetector = new LightColorDetector();
        String result = lightColorDetector.color(waveLength);
        if (result.equals("Invisible Light")) {
            System.out.println("Invisible Light test(lower than 380 wave length): OK");
        } else {
            System.out.println("Invisible Light test: FAILED");
        }
    }
    void invisibleLightTest2() {
        int waveLength = 800;
        LightColorDetector lightColorDetector = new LightColorDetector();
        String result = lightColorDetector.color(waveLength);
        if (result.equals("Invisible Light")) {
            System.out.println("Invisible Light test(greater than 750 wave length): OK");
        } else {
            System.out.println("Invisible Light test: FAILED");
        }
    }
}

