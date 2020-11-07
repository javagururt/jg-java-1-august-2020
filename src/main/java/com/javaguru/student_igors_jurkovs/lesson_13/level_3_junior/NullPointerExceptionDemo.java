package com.javaguru.student_igors_jurkovs.lesson_13.level_3_junior;

class NullPointerExceptionDemo {

    public static void main(String[] args) {

        Integer number = null;

        Integer sum = number + number; // При попытке произвести действие с пустым объектом вылетает NullPointerException;

    }
}
