package com.javaguru.teacher.lesson_9.lessoncode.developers;

class MiddleDeveloper extends JuniorDeveloper {

    public MiddleDeveloper(String name) {
        super(name);
    }

    @Override
    void study() {
        System.out.println("Fast learning");
    }

    @Override
    void writeCode() {
        System.out.println("Write some code");
    }

    @Override
    void askQuestion() {
        System.out.println("How this code works?");
    }
}
