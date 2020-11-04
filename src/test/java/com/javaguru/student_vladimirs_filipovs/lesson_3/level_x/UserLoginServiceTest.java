package com.javaguru.student_vladimirs_filipovs.lesson_3.level_x;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class UserLoginServiceTest {
    private UserLoginService victim;

    @Before
    public void setUp() {
        victim = new UserLoginService("vova", "sqrt");
    }

    @Test
    public void signInIsCorrect() {
        boolean actual = victim.signIn(victim.checkLoginAndPassword("vova", "sqrt"));
        assertEquals(true, actual);
    }

    @Test
    public void signInUserNameIsIncorrect() {
        boolean actual = victim.signIn(victim.checkLoginAndPassword("www", "sqrt"));
        assertEquals(false, actual);
    }

    @Test
    public void signInPasswordIsIncorrect() {
        boolean actual = victim.signIn(victim.checkLoginAndPassword("vova", "www"));
        assertEquals(false, actual);
    }

    @Test
    public void signInAllAreIncorrect() {
        boolean actual = victim.signIn(victim.checkLoginAndPassword("www", "www"));
        assertEquals(false, actual);
    }

    @Test
    public void signInNumberOfTriesIs3() {
        victim.signIn(victim.checkLoginAndPassword("www", "www"));
        victim.signIn(victim.checkLoginAndPassword("www", "www"));
        boolean actual = victim.signIn(victim.checkLoginAndPassword("vova", "sqrt"));
        assertEquals(true, actual);
    }

    @Test
    public void signInNumberOfTriesMoreThen3() {
        victim.signIn(victim.checkLoginAndPassword("www", "www"));
        victim.signIn(victim.checkLoginAndPassword("www", "www"));
        victim.signIn(victim.checkLoginAndPassword("www", "www"));
        victim.signIn(victim.checkLoginAndPassword("www", "www"));
        boolean actual = victim.signIn(victim.checkLoginAndPassword("www", "sqrt"));
        assertEquals(false, actual);
    }

    @Test
    public void resetLoginCounts() {
        victim.signIn(victim.checkLoginAndPassword("www", "www"));
        victim.signIn(victim.checkLoginAndPassword("www", "www"));
        victim.signIn(victim.checkLoginAndPassword("www", "www"));
        victim.resetLoginNumberOfTries();
        int actual = victim.loginNumberOfTries;
        assertEquals(0, actual);
    }

    @Test
    public void resetLoginCountsPlusOne() {
        victim.signIn(victim.checkLoginAndPassword("www", "www"));
        victim.signIn(victim.checkLoginAndPassword("www", "www"));
        victim.resetLoginNumberOfTries();
        victim.signIn(victim.checkLoginAndPassword("www", "www"));
        int actual = victim.loginNumberOfTries;
        assertEquals(1, actual);
    }

    @Test
    public void userIsNotBlockedInStart() {
        boolean actual = victim.isUserBlocked;
        assertEquals(false, actual);
    }

    @Test
    public void userIsNotBlocked() {
        victim.signIn(victim.checkLoginAndPassword("www", "www"));
        victim.signIn(victim.checkLoginAndPassword("www", "www"));
        boolean actual = victim.isUserBlocked;
        assertEquals(false, actual);
    }

    @Test
    public void userIsBlocked() {
        victim.signIn(victim.checkLoginAndPassword("www", "www"));
        victim.signIn(victim.checkLoginAndPassword("www", "www"));
        victim.signIn(victim.checkLoginAndPassword("www", "www"));
        boolean actual = victim.isUserBlocked;
        assertEquals(true, actual);
    }
}