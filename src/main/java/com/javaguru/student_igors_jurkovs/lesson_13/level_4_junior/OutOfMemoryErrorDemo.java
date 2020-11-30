package com.javaguru.student_igors_jurkovs.lesson_13.level_4_junior;

import com.javaguru.teacher.codereview.CodeReview;

import java.util.ArrayList;
import java.util.List;
@CodeReview(approved = true)
class OutOfMemoryErrorDemo {

    public static void main(String[] args) {

        List<Object> ourOfMemoryExample = new ArrayList<>();

        for (int i = 0; i < 100_000_000; i++) {
            ourOfMemoryExample.add(new Object());
        }
    }
}
