package com.javaguru.student_ivan_shulga.lesson_14.level_1_intern;

import com.javaguru.student_ivan_shulga.lesson_14.level_2_intern.*;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class FruitStorageTest {

    private final FruitStorage victim = new FruitStorage();

    @Test
    public void findAllGreenApples() {
        List<Apple> actual = victim.findApples(victim.getAllApples(), new AppleGreenColorPredicate());

        List<Apple> expected = new ArrayList<>();
        expected.add(new Apple("green", 200));
        expected.add(new Apple("green", 90));
        expected.add(new Apple("green", 50));

        assertEquals(expected, actual);
    }

    @Test
    public void findAllRedApples() {
        List<Apple> actual = victim.findApples(victim.getAllApples(), new AppleRedColorPredicate());

        List<Apple> expected = new ArrayList<>();
        expected.add(new Apple("red", 100));
        expected.add(new Apple("red", 160));
        expected.add(new Apple("red", 200));

        assertEquals(expected, actual);
    }

    @Test
    public void findAllHeavyWeightApples() {
        List<Apple> actual = victim.findApples(victim.getAllApples(), new AppleHeavyWeightPredicate());

        List<Apple> expected = new ArrayList<>();
        expected.add(new Apple("red", 160));
        expected.add(new Apple("red", 200));
        expected.add(new Apple("green", 200));
        expected.add(new Apple("yellow", 170));

        assertEquals(expected, actual);
    }

    @Test
    public void findAllLightWeightApples() {
        List<Apple> actual = victim.findApples(victim.getAllApples(), new AppleLightWeightPredicate());

        List<Apple> expected = new ArrayList<>();
        expected.add(new Apple("red", 100));
        expected.add(new Apple("green", 90));
        expected.add(new Apple("green", 50));
        expected.add(new Apple("yellow", 50));

        assertEquals(expected, actual);
    }

    @Test
    public void findAllGreenAndHeavyWeightApples() {
        List<Apple> actual = victim.findApples(victim.getAllApples(), new AppleGreenAndHeavyWeightPredicate());

        List<Apple> expected = new ArrayList<>();
        expected.add(new Apple("green", 200));

        assertEquals(expected, actual);
    }

    @Test
    public void findAllYellowApples() {
        List<Apple> actual = victim.findApples(victim.getAllApples(), new ApplePredicate() {
            @Override
            public boolean test(Apple apple) {
                return "yellow".equals(apple.getColor());
            }
        });

        List<Apple> expected = new ArrayList<>();
        expected.add(new Apple("yellow", 50));
        expected.add(new Apple("yellow", 170));

        assertEquals(expected, actual);
    }

    @Test
    public void findAllYellowHeavyWeightApples() {
        List<Apple> actual = victim.findApples(victim.getAllApples(), ap -> ap.getWeight() > 150 && ap.getColor().equals("yellow"));

        List<Apple> expected = new ArrayList<>();
        expected.add(new Apple("yellow", 170));

        assertEquals(expected, actual);
    }

    @Test
    public void findAllRedHeavyWeightApples() {
        List<Apple> actual = victim.findApples(victim.getAllApples(), ap -> ap.getWeight() > 150 && ap.getColor().equals("red"));

        List<Apple> expected = new ArrayList<>();
        expected.add(new Apple("red", 160));
        expected.add(new Apple("red", 200));

        assertEquals(expected, actual);
    }

}