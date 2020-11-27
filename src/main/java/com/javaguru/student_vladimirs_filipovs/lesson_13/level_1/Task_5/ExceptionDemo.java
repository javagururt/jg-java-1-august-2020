package com.javaguru.student_vladimirs_filipovs.lesson_13.level_1.Task_5;

class ExceptionDemo extends Exception {
    public static void main(String[] args) {
        try {
            throw new Exception("Hi, my name is ERROR!!");
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            ex.printStackTrace();
        } finally {
            System.out.println("I'll become a great programmer!!");
        }
    }
}

