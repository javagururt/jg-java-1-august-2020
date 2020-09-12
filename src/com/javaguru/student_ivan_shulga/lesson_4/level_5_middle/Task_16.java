package com.javaguru.student_ivan_shulga.lesson_4.level_5_middle;

// в данном случае не разделял на два файла, и программу, и тесты вписал в одно место
// проверял верхнюю и нижнюю границы каждого спектра и по одной проверке вне спектра вверху и внизу, итого 14 тестов

class LightColorDetector {    // программа

    String violet = "Фиолетовый";
    String blue = "Синий";
    String green = "Зелёный";
    String yellow = "Жёлтый";
    String orange = "Оранжевый";
    String red = "Красный";
    String invisibleLight = "Невидимый спектр";


    public String detect(int wavelength) {
        if (wavelength >= 380 && wavelength <= 449) {
            return violet;
        } else if (wavelength >= 450 && wavelength <= 494) {
            return blue;
        } else if (wavelength >= 495 && wavelength <= 569) {
            return green;
        } else if (wavelength >= 570 && wavelength <= 589) {
            return yellow;
        } else if (wavelength >= 590 && wavelength <= 619) {
            return orange;
        } else if (wavelength >= 620 && wavelength <= 750) {
            return red;
        } else {
            return invisibleLight;
        }
    }
}

class LightColorDetectorTest {     // тесты

    public static void main(String[] args) {

        LightColorDetectorTest colorTest = new LightColorDetectorTest();

        colorTest.testInvisibleLight1();
        colorTest.testViolet1();
        colorTest.testViolet2();
        colorTest.testBlue1();
        colorTest.testBlue2();
        colorTest.testGreen1();
        colorTest.testGreen2();
        colorTest.testYellow1();
        colorTest.testYellow2();
        colorTest.testOrange1();
        colorTest.testOrange2();
        colorTest.testRed1();
        colorTest.testRed2();
        colorTest.testInvisibleLight2();

    }

    private void testInvisibleLight1() {
        LightColorDetector colorDetector = new LightColorDetector();
        String spectrum = colorDetector.detect(379);
        String expectedSpectrum = "Невидимый спектр";
        if (spectrum.equals(expectedSpectrum)) {
            System.out.println("testInvisibleLight1: SUCCESS");
        } else {
            System.out.println("testInvisibleLight1: FAILURE, expected: " + expectedSpectrum + " but actual: " + spectrum);
        }
    }

    private void testViolet1() {
        LightColorDetector colorDetector = new LightColorDetector();
        String spectrum = colorDetector.detect(380);
        String expectedSpectrum = "Фиолетовый";
        if (spectrum.equals(expectedSpectrum)) {
            System.out.println("testViolet1: SUCCESS");
        } else {
            System.out.println("testViolet1: FAILURE, expected: " + expectedSpectrum + " but actual: " + spectrum);
        }
    }

    private void testViolet2() {
        LightColorDetector colorDetector = new LightColorDetector();
        String spectrum = colorDetector.detect(449);
        String expectedSpectrum = "Фиолетовый";
        if (spectrum.equals(expectedSpectrum)) {
            System.out.println("testViolet2: SUCCESS");
        } else {
            System.out.println("testViolet2: FAILURE, expected: " + expectedSpectrum + " but actual: " + spectrum);
        }
    }

    private void testBlue1() {
        LightColorDetector colorDetector = new LightColorDetector();
        String spectrum = colorDetector.detect(450);
        String expectedSpectrum = "Синий";
        if (spectrum.equals(expectedSpectrum)) {
            System.out.println("testBlue1: SUCCESS");
        } else {
            System.out.println("testBlue1: FAILURE, expected: " + expectedSpectrum + " but actual: " + spectrum);
        }
    }

    private void testBlue2() {
        LightColorDetector colorDetector = new LightColorDetector();
        String spectrum = colorDetector.detect(494);
        String expectedSpectrum = "Синий";
        if (spectrum.equals(expectedSpectrum)) {
            System.out.println("testBlue2: SUCCESS");
        } else {
            System.out.println("testBlue2: FAILURE, expected: " + expectedSpectrum + " but actual: " + spectrum);
        }
    }

    private void testGreen1() {
        LightColorDetector colorDetector = new LightColorDetector();
        String spectrum = colorDetector.detect(495);
        String expectedSpectrum = "Зелёный";
        if (spectrum.equals(expectedSpectrum)) {
            System.out.println("testGreen1: SUCCESS");
        } else {
            System.out.println("testGreen1: FAILURE, expected: " + expectedSpectrum + " but actual: " + spectrum);
        }
    }

    private void testGreen2() {
        LightColorDetector colorDetector = new LightColorDetector();
        String spectrum = colorDetector.detect(569);
        String expectedSpectrum = "Зелёный";
        if (spectrum.equals(expectedSpectrum)) {
            System.out.println("testGreen2: SUCCESS");
        } else {
            System.out.println("testGreen2: FAILURE, expected: " + expectedSpectrum + " but actual: " + spectrum);
        }
    }

    private void testYellow1() {
        LightColorDetector colorDetector = new LightColorDetector();
        String spectrum = colorDetector.detect(570);
        String expectedSpectrum = "Жёлтый";
        if (spectrum.equals(expectedSpectrum)) {
            System.out.println("testYellow1: SUCCESS");
        } else {
            System.out.println("testYellow1: FAILURE, expected: " + expectedSpectrum + " but actual: " + spectrum);
        }
    }

    private void testYellow2() {
        LightColorDetector colorDetector = new LightColorDetector();
        String spectrum = colorDetector.detect(589);
        String expectedSpectrum = "Жёлтый";
        if (spectrum.equals(expectedSpectrum)) {
            System.out.println("testYellow2: SUCCESS");
        } else {
            System.out.println("testYellow2: FAILURE, expected: " + expectedSpectrum + " but actual: " + spectrum);
        }
    }

    private void testOrange1() {
        LightColorDetector colorDetector = new LightColorDetector();
        String spectrum = colorDetector.detect(590);
        String expectedSpectrum = "Оранжевый";
        if (spectrum.equals(expectedSpectrum)) {
            System.out.println("testOrange1: SUCCESS");
        } else {
            System.out.println("testOrange1: FAILURE, expected: " + expectedSpectrum + " but actual: " + spectrum);
        }
    }

    private void testOrange2() {
        LightColorDetector colorDetector = new LightColorDetector();
        String spectrum = colorDetector.detect(619);
        String expectedSpectrum = "Оранжевый";
        if (spectrum.equals(expectedSpectrum)) {
            System.out.println("testOrange2: SUCCESS");
        } else {
            System.out.println("testOrange2: FAILURE, expected: " + expectedSpectrum + " but actual: " + spectrum);
        }
    }

    private void testRed1() {
        LightColorDetector colorDetector = new LightColorDetector();
        String spectrum = colorDetector.detect(620);
        String expectedSpectrum = "Красный";
        if (spectrum.equals(expectedSpectrum)) {
            System.out.println("testRed1: SUCCESS");
        } else {
            System.out.println("testRed1: FAILURE, expected: " + expectedSpectrum + " but actual: " + spectrum);
        }
    }

    private void testRed2() {
        LightColorDetector colorDetector = new LightColorDetector();
        String spectrum = colorDetector.detect(750);
        String expectedSpectrum = "Красный";
        if (spectrum.equals(expectedSpectrum)) {
            System.out.println("testRed2: SUCCESS");
        } else {
            System.out.println("testRed2: FAILURE, expected: " + expectedSpectrum + " but actual: " + spectrum);
        }
    }

    private void testInvisibleLight2() {
        LightColorDetector colorDetector = new LightColorDetector();
        String spectrum = colorDetector.detect(751);
        String expectedSpectrum = "Невидимый спектр";
        if (spectrum.equals(expectedSpectrum)) {
            System.out.println("testInvisibleLight2: SUCCESS");
        } else {
            System.out.println("testInvisibleLight2: FAILURE, expected: " + expectedSpectrum + " but actual: " + spectrum);
        }
    }

}

/*
380 ... 449 - Фиолетовый ("Violet")
450 ... 494 - Синий ("Blue")
495 ... 569 - Зеленый ("Green")
570 ... 589 - Желтый ("Yellow")
590 ... 619 - Оранжевый ("Orange")
620 ... 750 - Красный ("Red")
Вне диапазонов - невидимый спектр ("Invisible Light")
 */

    /*
    public void detect(int wavelength) {                  // заменил String на void
        if (wavelength >= 380 && wavelength <=449) {
            System.out.println("Violet");
        } else if (wavelength >= 450 && wavelength <=494) {
            System.out.println("Blue");
        } else if (wavelength >= 495 && wavelength <=569) {
            System.out.println("Green");
        } else if (wavelength >= 570 && wavelength <=589) {
            System.out.println("Yellow");
        } else if (wavelength >= 590 && wavelength <=619) {
            System.out.println("Orange");
        } else if (wavelength >= 620 && wavelength <=750) {
            System.out.println("Red");
        } else { System.out.println("Invisible Light");
        }
    }
    */

