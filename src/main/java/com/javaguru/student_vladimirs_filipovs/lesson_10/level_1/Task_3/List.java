package com.javaguru.student_vladimirs_filipovs.lesson_10.level_1.Task_3;

class List implements MyList {
    int arrayLength;

    @Override
    public String[] createArray(int arrayLength) {
        return new String[arrayLength];
    }

    @Override
    public void chekArraysFillingAndIncreaseArray(String[] array) {
        if (array[arrayLength] != null) {
            arrayLength = arrayLength * 2;
        }
    }
}