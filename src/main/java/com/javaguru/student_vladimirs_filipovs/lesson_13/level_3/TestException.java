package com.javaguru.student_vladimirs_filipovs.lesson_13.level_3;

class TestException extends Exception {
}

class Main {
    public static void main(String args[]) {
        try {
            throw new TestException();
        } catch (TestException t) {
            System.out.println("Got the Test Exception");
        } finally {
            System.out.println("Inside finally block ");
        }
    }
}
//Ловится ошибка "Got the Test Exception" с помощю catch.
//Затем запускается блок finally "Inside finally block " вне зависимости от того, поймана ошибка или нет.