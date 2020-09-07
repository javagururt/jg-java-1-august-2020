package com.javaguru.teacher.lesson_4.lessoncode;

class Tv {

    public static final int MAX_VOLUME = 50;
    public static final int MIN_VOLUME = 0;

    private final String manufacturer;
    private int currentVolume;

    public Tv(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        this.currentVolume = currentVolume;
    }

    void increaseVolume() {
        if (currentVolume < MAX_VOLUME) {
            currentVolume += 1;
        }
        // volume = volume + 1;
    }

    void decreaseVolume() {
        if (currentVolume > MIN_VOLUME) {
            currentVolume -= 1;
        }
    }

}
