package com.javaguru.student_igors_jurkovs.lesson_7.level_6_middle;

import com.javaguru.teacher.codereview.CodeReview;
import com.javaguru.teacher.codereview.CodeReviewComment;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

@CodeReview(approved = false)
public class CreditCardTest {

    private CreditCard victim = new CreditCard("4552-2451-1255-2222", 1234);

    @Before
    @CodeReviewComment(teacher = "получается, что изначальные данные завязаны на работу метода withdraw")
    public void setUpCreditLimit() {
        victim.setCreditLimit(1000);
        victim.withdraw(100, 1234);
    }

    @Test
    public void depositWhenPinCorrect() {
        double expected = 100;
        double result = victim.deposit(200, 1234);
        assertEquals(expected, result, 0.01);
    }

    @Test
    public void withdrawWhenPinCorrect() {
        double expected = 0;
        double result = victim.withdraw(200, 1234);
        assertEquals(expected, result, 0.01);
    }

    @Test
    public void depositWhenPinIncorrect() {
        double expected = 0;
        double result = victim.deposit(200, 1235);
        assertEquals(expected, result, 0.01);
    }

    @Test
    public void withdrawWhenPinIncorrect() {
        double expected = 0;
        double result = victim.withdraw(200, 1235);
        assertEquals(expected, result, 0.01);
    }

    @Test
    public void shouldIncreaseLoanWhenWithdraw() {
        double expected = 200;
        victim.withdraw(100, 1234);
        double result = victim.getLoanDebt();
        assertEquals(expected, result, 0.01);
    }

    @Test
    public void shouldDecreaseLoanWhenDeposit() {
        double expected = 50;
        victim.deposit(50, 1234);
        double result = victim.getLoanDebt();
        assertEquals(expected, result, 0.01);
    }

    @Test
    public void creditLimitExceeded() {
        double expected = 0;
        double result = victim.withdraw(1000, 1234);
        assertEquals(expected, result, 0.01);
    }
}