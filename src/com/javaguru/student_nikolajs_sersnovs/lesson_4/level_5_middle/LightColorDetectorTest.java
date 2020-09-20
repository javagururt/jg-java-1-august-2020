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
        lightColorDetectorTest.invisibleLightColorTest2();
    }

    public static final String RESET = "\u001B[0m";
    public static final String VIOLET = "\u001B[0;95m";
    public static final String BLUE = "\u001B[0;34m";
    public static final String GREEN = "\u001B[0;32m";
    public static final String YELLOW = "\u001B[0;33m";
    public static final String ORANGE = "\u001B[0;96m";
    public static final String RED = "\u001B[0;31m";
    public static final String invisible = "\u001B[0;37m";

    public void violetColorTest() {
        int wavelength = 400;
        if (wavelength >= 380 & wavelength <= 449) {
            System.out.println(VIOLET + "Wavelength test = OK" + RESET);
        } else {
            System.out.println("Wavelength test = FAIL");
        }

    }

    public void blueColorTest() {
        int wavelength = 480;
        if (wavelength >= 450 & wavelength <= 494) {
            System.out.println(BLUE + "Wavelength test = OK" + RESET);
        } else {
            System.out.println("Wavelength test = FAIL");
        }
    }

    public void greenColorTest() {
        int wavelength = 520;
        if (wavelength >= 495 & wavelength <= 569) {
            System.out.println(GREEN + "Wavelength test = OK" + RESET);
        } else {
            System.out.println("Wavelength test = FAIL");
        }
    }

    public void yellowColorTest() {
        int wavelength = 580;
        if (wavelength >= 570 & wavelength <= 589) {
            System.out.println(YELLOW + "Wavelength test = OK" + RESET);
        } else {
            System.out.println("Wavelength test = FAIL");
        }
    }

    public void orangeColorTest() { // Оранжевый цвет не нашёл в консольных цветах от JAVA,
                                    // а вот с помощью RGB выдает ошибку и цвет не меняет  java.awt.Color[r=255,g=200,b=0]
        int wavelength = 600;
        if (wavelength >= 590 & wavelength <= 619) {
            System.out.println(ORANGE + "Wavelength test = OK" + RESET);
        } else {
            System.out.println("Wavelength test = FAIL");
        }
    }

    public void redColorTest() {
        int wavelength = 700;
        if (wavelength >= 620 & wavelength <= 750) {
            System.out.println(RED + "Wavelength test = OK" + RESET);
        } else {
            System.out.println("Wavelength test = FAIL");
        }
    }

    public void invisibleLightColorTest() {
        int wavelength = 100;
        if (wavelength <= 379) {
            System.out.println(invisible + "Wavelength test = OK" + RESET);
        } else {
            System.out.println("Wavelength test = FAIL");
        }
    }

    public void invisibleLightColorTest2() {
        int wavelength = 800;
        if (wavelength >= 751) {
            System.out.println(invisible + "Wavelength test = OK" + RESET);
        } else {
            System.out.println("Wavelength test = FAIL");
        }
    }


}

