package com.javaguru.student_vladimirs_filipovs.lesson_13.level_4;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

class Task_25 {
    public static void main(String[] args) {
        List<String> text = new ArrayList<>();
        while (true) {
            text.add(UUID.randomUUID().toString());
        }
    }
}
