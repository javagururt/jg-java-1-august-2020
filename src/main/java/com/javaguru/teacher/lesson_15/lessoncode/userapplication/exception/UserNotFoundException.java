package com.javaguru.teacher.lesson_15.lessoncode.userapplication.exception;

public class UserNotFoundException extends RuntimeException {

    public UserNotFoundException(String message) {
        super(message);
    }
}
