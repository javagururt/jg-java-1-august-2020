package com.javaguru.student_vadim_migun.lesson_14.level_1;

import com.javaguru.teacher.codereview.CodeReview;

import org.junit.Before;
import org.junit.Test;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;
@CodeReview(approved = true)
public class FruitStorageTest {

    FruitStorage victim = new FruitStorage();
    List<Apple> apples = new ArrayList<>();

    @Before
    public void storageWithApples() {
        apples.add(new Apple("red", 100));
        apples.add(new Apple("red", 160));
        apples.add(new Apple("red", 200));
        apples.add(new Apple("green", 200));
        apples.add(new Apple("green", 90));
        apples.add(new Apple("green", 50));
        apples.add(new Apple("yellow", 50));
        apples.add(new Apple("yellow", 170));
    }


    @Test
    public void getAllGreenApples() {
        List<Apple> expected = new ArrayList<>();
        expected.add(new Apple("green",200));
        expected.add(new Apple("green",90));
        expected.add(new Apple("green",50));
        List<Apple> result = victim.findAllGreenApples();
        assertEquals(expected, result);
    }




}