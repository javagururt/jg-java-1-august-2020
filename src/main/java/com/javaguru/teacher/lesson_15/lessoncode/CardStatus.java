package com.javaguru.teacher.lesson_15.lessoncode;

public enum CardStatus {
    ACTIVE("Active"), BLOCKED("Blocked");

    CardStatus(String value) {
        this.value = value;
    }

    private String value;

    public String getValue() {
        return value;
    }
}
