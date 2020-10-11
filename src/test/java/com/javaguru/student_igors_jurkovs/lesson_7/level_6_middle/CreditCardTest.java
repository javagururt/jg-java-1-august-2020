package com.javaguru.student_igors_jurkovs.lesson_7.level_6_middle;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;
import static org.assertj.core.api.Assertions.assertThat;

@RunWith(JUnitParamsRunner.class)
@Category(CreditCard.class)
public class CreditCardTest {

    private final CreditCard victim = new CreditCard("4552-2451-1255-2222", 1234);

    @Before
    public void setUpCreditLimit() {
        victim.setCreditLimit(1000);
        victim.withdraw(100, 1234);
    }

    @Test
    @Parameters({
            "200, 1234, 100",
            "200, 1235, 0"

    })
    public void depositWhenPinCorrectAndIncorrect(double deposit, int pin, double expected) {
        double result = victim.deposit(deposit, pin);
        assertThat(result).isEqualByComparingTo(expected);
    }

    @Test
    @Parameters({
            "200, 1234, 0",
            "200, 1235, 0"

    })
    public void withdrawWhenPinCorrectAndIncorrect(double withdraw, int pin, double expected) {
        double result = victim.withdraw(withdraw, pin);
        assertThat(result).isEqualByComparingTo(expected);
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