package com.javaguru.student_nikolajs_sersnovs.lesson_4.level_5_middle;


import java.awt.Color;

class LightColorDetectorTest {


    /*
        public static final Color VIOLET = new Color(238, 130, 238);
        public static final Color BLUE = new Color(0, 0, 255);
        public static final Color GREEN = new Color(0, 128, 0);
        public static final Color YELLOW = new Color(255, 255, 0);
        public static final Color ORANGE = new Color(255, 165, 0);
        public static final Color RED = new Color(255, 0, 0);
        public static final Color INVISIBLE = new Color(255, 255, 255);
    */
    public static void main(String[] args) {
        LightColorDetectorTest lightColorDetectorTest = new LightColorDetectorTest();
        lightColorDetectorTest.violetColorTest();
        lightColorDetectorTest.blueColorTest();
        lightColorDetectorTest.greenColorTest();
        lightColorDetectorTest.yellowColorTest();
        lightColorDetectorTest.orangeColorTest();
        lightColorDetectorTest.redColorTest();
        lightColorDetectorTest.invisibleLightColorTest();

    }

    public static final String RESET = "\u001B[0m";
    public static final String VIOLET = "\u001B[0;95m";
    public static final String BLUE = "\u001B[0;94m";
    public static final String GREEN = "\u001B[0;32m";
    public static final String YELLOW = "\u001B[0;93m";
    public static final String ORANGE = "\u001B[0;91m";
    public static final String RED = "\u001B[0;31m";
    public static final String Invisible = "\u001B[0;97m";

    public void violetColorTest() {
        LightColorDetector lightColorDetector = new LightColorDetector();
        String actualResult = lightColorDetector.detect(400);
        String expectResult = "Violet";
        if (actualResult.equals(expectResult)) {
            System.out.println(VIOLET + "Wavelength Violet Color test = OK" + RESET);
        } else {
            System.out.println("Wavelength Violet Color test = FAIL! "
                    + " Expect Result " + VIOLET + expectResult + RESET + " but Actual result: " + Invisible + actualResult + RESET);
        }

    }

    public void blueColorTest() {
        LightColorDetector lightColorDetector = new LightColorDetector();
        String actualResult = lightColorDetector.detect(460);
        String expectResult = "Blue";
        if (actualResult.equals(expectResult)) {
            System.out.println(BLUE + "Wavelength Blue Color test = OK" + RESET);
        } else {
            System.out.println("Wavelength Blue Color test = FAIL! "
                    + " Expect Result " + BLUE + expectResult + RESET + " but Actual result: " + Invisible + actualResult + RESET);
        }

    }

    public void greenColorTest() {
        LightColorDetector lightColorDetector = new LightColorDetector();
        String actualResult = lightColorDetector.detect(500);
        String expectResult = "Green";
        if (actualResult.equals(expectResult)) {
            System.out.println(GREEN + "Wavelength Green Color test = OK" + RESET);
        } else {
            System.out.println("Wavelength Green Color test = FAIL! "
                    + " Expect Result " + GREEN + expectResult + RESET + " but Actual result: " + Invisible + actualResult + RESET);
        }

    }

    public void yellowColorTest() {
        LightColorDetector lightColorDetector = new LightColorDetector();
        String actualResult = lightColorDetector.detect(580);
        String expectResult = "Yellow";
        if (actualResult.equals(expectResult)) {
            System.out.println(YELLOW + "Wavelength Yellow Color test = OK" + RESET);
        } else {
            System.out.println("Wavelength Yellow Color test = FAIL! "
                    + " Expect Result " + YELLOW + expectResult + RESET + " but Actual result: " + Invisible + actualResult + RESET);
        }

    }

    public void orangeColorTest() { // Оранжевый цвет не нашёл в консольных цветах от JAVA,
        // а вот с помощью RGB выдает ошибку и цвет не меняет  java.awt.Color[r=255,g=200,b=0]
        LightColorDetector lightColorDetector = new LightColorDetector();
        String actualResult = lightColorDetector.detect(600);
        String expectResult = "Orange";
        if (actualResult.equals(expectResult)) {
            System.out.println(ORANGE + "Wavelength Orange Color test = OK" + RESET);
        } else {
            System.out.println("Wavelength Orange Color test = FAIL! "
                    + " Expect Result " + ORANGE + expectResult + RESET + " but Actual result: " + Invisible + actualResult + RESET);
        }

    }

    public void redColorTest() {
        LightColorDetector lightColorDetector = new LightColorDetector();
        String actualResult = lightColorDetector.detect(700);
        String expectResult = "Red";
        if (actualResult.equals(expectResult)) {
            System.out.println(RED + "Wavelength Red Color test = OK" + RESET);
        } else {
            System.out.println("Wavelength Red Color test = FAIL! "
                    + " Expect Result " + RED + expectResult + RESET + " but Actual result: " + Invisible + actualResult + RESET);
        }
    }

    public void invisibleLightColorTest() {
        LightColorDetector lightColorDetector = new LightColorDetector();
        String actualResult = lightColorDetector.detect(300);
        String expectResult = "Invisible Light";
        if (actualResult.equals(expectResult)) {
            System.out.println(Invisible + "Wavelength Invisible Light test = OK" + RESET);
        } else {
            System.out.println("Wavelength Violet Color test = FAIL! ");
        }
    }
}

