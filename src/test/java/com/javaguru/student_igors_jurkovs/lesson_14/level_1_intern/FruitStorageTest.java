package com.javaguru.student_igors_jurkovs.lesson_14.level_1_intern;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class FruitStorageTest {

    private FruitStorage victim = new FruitStorage();
    private List<Apple> apples = new ArrayList<>();

    @Before
    public void fillStorageWithApples() {
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
        expected.add(new Apple("green", 200));
        expected.add(new Apple("green", 90));
        expected.add(new Apple("green", 50));
        List<Apple> result = victim.findApples(apples, new AppleGreenColorPredicate());
        assertEquals(expected, result);
    }

    @Test
    public void getAllRedApples() {
        List<Apple> expected = new ArrayList<>();
        expected.add(new Apple("red", 100));
        expected.add(new Apple("red", 160));
        expected.add(new Apple("red", 200));
        List<Apple> result = victim.findApples(apples, new AppleRedColorPredicate());
        assertEquals(expected, result);
    }

    @Test
    public void findHeavyApples() {
        List<Apple> expected = new ArrayList<>();
        expected.add(new Apple("red", 160));
        expected.add(new Apple("red", 200));
        expected.add(new Apple("green", 200));
        expected.add(new Apple("yellow", 170));
        List<Apple> result = victim.findApples(apples, new AppleHeavyWeightPredicate());
        assertEquals(expected, result);
    }

    @Test
    public void findLightApples() {
        List<Apple> expected = new ArrayList<>();
        expected.add(new Apple("red", 100));
        expected.add(new Apple("green", 90));
        expected.add(new Apple("green", 50));
        expected.add(new Apple("yellow", 50));
        List<Apple> result = victim.findApples(apples, new AppleLightWeightPredicate());
        assertEquals(expected, result);
    }

    @Test
    public void findGreenHeavyApples() {
        List<Apple> expected = new ArrayList<>();
        expected.add(new Apple("green", 200));
        List<Apple> result = victim.findApples(apples,
                apple -> apple.getWeight() >= 150 && apple.getColor().equalsIgnoreCase("green"));
        assertEquals(expected, result);
    }

    @Test
    public void findGreenLightApples() {
        List<Apple> expected = new ArrayList<>();
        expected.add(new Apple("green", 90));
        expected.add(new Apple("green", 50));
        List<Apple> result = victim.findApples(apples,
                apple -> apple.getWeight() <= 150 && apple.getColor().equalsIgnoreCase("green"));
        assertEquals(expected, result);
    }

}