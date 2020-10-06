package com.javaguru.teacher.lesson_4.lessoncode;

class TvTest {

    public static void main(String[] args) {
        TvTest testRunner = new TvTest();
        testRunner.shouldIncreaseVolume();
        testRunner.shouldNotDecreaseVolumeWhenMinVolume();
        testRunner.shouldNotIncreaseVolumeWhenMaxVolume();
        testRunner.shouldDecreaseVolume();
    }

    void shouldIncreaseVolume() {
        Tv tv = new Tv("LG");
        tv.increaseVolume();

        int actualResult = tv.getCurrentVolume();
        int expectedResult = 1;

        if (expectedResult == actualResult) {
            System.out.println("shouldIncreaseVolume: SUCCESS");
        } else {
            System.out.println("shouldIncreaseVolume: FAILURE, expected: " + expectedResult + " but actual: " + actualResult);
        }
    }

    void shouldNotDecreaseVolumeWhenMinVolume() {
        Tv tv = new Tv("LG");
        tv.setCurrentVolume(Tv.MIN_VOLUME);
        tv.decreaseVolume();

        int actualResult = tv.getCurrentVolume();
        int expectedResult = Tv.MIN_VOLUME;

        if (expectedResult == actualResult) {
            System.out.println("shouldNotDecreaseVolumeWhenMinVolume: SUCCESS");
        } else {
            System.out.println("shouldNotDecreaseVolumeWhenMinVolume: FAILURE, expected: " + expectedResult + " but actual: " + actualResult);
        }
    }

    void shouldNotIncreaseVolumeWhenMaxVolume() {
        Tv tv = new Tv("LG");
        tv.setCurrentVolume(Tv.MAX_VOLUME);
        tv.increaseVolume();

        int actualResult = tv.getCurrentVolume();
        int expectedResult = Tv.MAX_VOLUME;

        if (expectedResult == actualResult) {
            System.out.println("shouldNotIncreaseVolumeWhenMaxVolume: SUCCESS");
        } else {
            System.out.println("shouldNotIncreaseVolumeWhenMaxVolume: FAILURE, expected: " + expectedResult + " but actual: " + actualResult);
        }
    }

    void shouldDecreaseVolume() {
        Tv tv = new Tv("LG");
        tv.setCurrentVolume(10);
        tv.decreaseVolume();

        int actualResult = tv.getCurrentVolume();
        int expectedResult = 9;

        if (expectedResult == actualResult) {
            System.out.println("shouldDecreaseVolume: SUCCESS");
        } else {
            System.out.println("shouldDecreaseVolume: FAILURE, expected: " + expectedResult + " but actual: " + actualResult);
        }
    }
}
