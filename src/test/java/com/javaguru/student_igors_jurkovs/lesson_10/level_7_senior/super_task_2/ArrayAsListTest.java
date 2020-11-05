package com.javaguru.student_igors_jurkovs.lesson_10.level_7_senior.super_task_2;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ArrayAsListTest {

    private final ArrayAsList<Object> victim = new ArrayAsList<>();
    private Object object1;
    private Object object2;
    private Object object3;
    private Object object4;
    private Object object5;
    private Object object6;
    private Object object7;

    @Before
    public void createObjects() {
        object1 = new Object();
        object2 = new Object();
        object3 = new Object();
        object4 = new Object();
        object5 = new Object();
        object6 = new Object();
        object7 = new Object();
    }

    @Test
    public void addObject() {
        boolean result = victim.addObject(object1);
        assertTrue(result);
    }

    @Test
    public void increaseArray() {
        int expected = 1;
        victim.increaseArray();
        int result = victim.getMyArrayLength();
        assertEquals(expected, result);
    }

    @Test
    public void increaseArrayTest2() {
        int expected = 4;
        victim.increaseArray();
        victim.increaseArray();
        victim.increaseArray();
        int result = victim.getMyArrayLength();
        assertEquals(expected, result);
    }

    @Test
    public void removeObject() {
        victim.addObject(object1);
        boolean result = victim.removeObject(object1);
        assertTrue(result);
    }

    @Test
    public void removeObjectAndAutoDecreaseArray() {
        victim.addObject(object1);
        victim.addObject(object2);
        victim.addObject(object3);
        victim.addObject(object4);
        victim.addObject(object5);
        victim.addObject(object6);
        victim.addObject(object7);
        victim.removeObject(object1);
        victim.removeObject(object2);
        victim.removeObject(object3);
        int expected = 4;
        int result = victim.getMyArrayLength();
        assertEquals(expected, result);
    }

    @Test
    public void findObject() {
        victim.addObject(object1);
        Object result = victim.findObject(object1);
        assertEquals(object1, result);
    }

    @Test
    public void decreaseArray() {
        victim.increaseArray();
        victim.increaseArray();
        victim.increaseArray();
        victim.increaseArray();
        victim.increaseArray();
        victim.decreaseArray();
        int expected = 8;
        int result = victim.getMyArrayLength();
        assertEquals(expected, result);
    }

    @Test
    public void decreaseArrayTest2() {
        victim.increaseArray();
        victim.decreaseArray();
        int expected = 0;
        int result = victim.getMyArrayLength();
        assertEquals(expected, result);
    }

    @Test
    public void sortArray() {
        victim.addObject(object1);
        victim.addObject(object2);
        victim.addObject(object3);
        victim.addObject(object4);
        victim.addObject(object5);
        victim.addObject(object6);
        victim.addObject(object7);
        victim.removeObject(object1);
        victim.removeObject(object2);
        victim.removeObject(object3);
        Object[] expected = {object7, object6, object5, object4};
        assertArrayEquals(expected, victim.getMyArray());

    }
}