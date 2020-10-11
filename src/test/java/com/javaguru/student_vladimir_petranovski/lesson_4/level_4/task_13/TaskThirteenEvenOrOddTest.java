package com.javaguru.student_vladimir_petranovski.lesson_4.level_4.task_13;

import com.javaguru.teacher.codereview.CodeReview;
import com.javaguru.teacher.codereview.CodeReviewComment;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

@CodeReview(approved = true)
@CodeReviewComment(teacher = "можно упростить некоторые выражения до assertTrue, assertFalse")
public class TaskThirteenEvenOrOddTest {
    private TaskThirteenEvenOrOdd taskThirteenEvenOrOdd;

    @Before
    public void setUp(){
        taskThirteenEvenOrOdd = new TaskThirteenEvenOrOdd();
    }

    @Test
    public void isEvenTrue() {
        assertEquals(true, taskThirteenEvenOrOdd.isEven(4));
    }

    @Test
    public void isEvenFalse() {
        assertEquals(false, taskThirteenEvenOrOdd.isEven(7));
    }
}