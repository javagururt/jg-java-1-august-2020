package com.javaguru.student_igors_jurkovs.lesson_4.level_5_middle;

import com.javaguru.teacher.codereview.CodeReview;

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
@CodeReview(approved = true)
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

    void test(String expectedResult, String result) {
        if (result.equals(expectedResult)) {
            System.out.println(expectedResult + " color test: OK");
        } else {
            System.out.println(expectedResult + " color test: FAILED");
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

    //  Оставил строку присваивания значения длине волны, хотя можно было сделать, чтобы длину вволны вводили в мейне.
    void violetTest() {
        int waveLength = 400;
        LightColorDetector lightColorDetector = new LightColorDetector();
        String result = lightColorDetector.color(waveLength);
        lightColorDetector.test("Violet", result);
    }

    void blueTest() {
        int waveLength = 480;
        LightColorDetector lightColorDetector = new LightColorDetector();
        String result = lightColorDetector.color(waveLength);
        lightColorDetector.test("Blue", result);
    }

    void greenTest() {
        int waveLength = 500;
        LightColorDetector lightColorDetector = new LightColorDetector();
        String result = lightColorDetector.color(waveLength);
        lightColorDetector.test("Green", result);
    }

    void yellowTest() {
        int waveLength = 580;
        LightColorDetector lightColorDetector = new LightColorDetector();
        String result = lightColorDetector.color(waveLength);
        lightColorDetector.test("Yellow", result);
    }

    void orangeTest() {
        int waveLength = 600;
        LightColorDetector lightColorDetector = new LightColorDetector();
        String result = lightColorDetector.color(waveLength);
        lightColorDetector.test("Orange", result);
    }

    void redTest() {
        int waveLength = 700;
        LightColorDetector lightColorDetector = new LightColorDetector();
        String result = lightColorDetector.color(waveLength);
        lightColorDetector.test("Red", result);
    }

    void invisibleLightTest1() {
        int waveLength = 200;
        LightColorDetector lightColorDetector = new LightColorDetector();
        String result = lightColorDetector.color(waveLength);
        lightColorDetector.test("Invisible Light", result);
    }

    void invisibleLightTest2() {
        int waveLength = 800;
        LightColorDetector lightColorDetector = new LightColorDetector();
        String result = lightColorDetector.color(waveLength);
        lightColorDetector.test("Invisible Light", result);
    }
}

