package com.javaguru.student_vladimirs_filipovs.lesson_7.level_6;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CreditCardTest {
    private CreditCard victim;

    @Before
    public void setUp() {
        victim = new CreditCard();
    }

    @Test
    public void withDrawCardBalanceMoreThenTakeMoney() {
        victim.setCardPinCode(123);
        victim.cardBalance = 1000;
        victim.creditLimit = 1000;
        victim.loanDebt = 0;
        victim.withDraw(500, 123);
        int actualCardBalance = victim.cardBalance;
        int actualCreditLimit = victim.creditLimit;
        int actualLoanDebt = victim.loanDebt;
        assertEquals(500, actualCardBalance);
        assertEquals(1000, actualCreditLimit);
        assertEquals(0, actualLoanDebt);
    }

    @Test
    public void withDrawCardBalanceLessThenTakeMoney() {
        victim.setCardPinCode(123);
        victim.cardBalance = 200;
        victim.creditLimit = 1000;
        victim.loanDebt = 0;
        victim.withDraw(500, 123);
        int actualCardBalance = victim.cardBalance;
        int actualCreditLimit = victim.creditLimit;
        int actualLoanDebt = victim.loanDebt;
        assertEquals(0, actualCardBalance);
        assertEquals(1000, actualCreditLimit);
        assertEquals(300, actualLoanDebt);
    }

    @Test
    public void withDrawCreditLimitLess() {
        victim.setCardPinCode(123);
        victim.cardBalance = 200;
        victim.creditLimit = 1000;
        victim.loanDebt = 0;
        victim.withDraw(1500, 123);
        int actualCardBalance = victim.cardBalance;
        int actualCreditLimit = victim.creditLimit;
        int actualLoanDebt = victim.loanDebt;
        assertEquals(200, actualCardBalance);
        assertEquals(1000, actualCreditLimit);
        assertEquals(0, actualLoanDebt);
    }

    @Test
    public void withDrawIncorrectNumber() {
        victim.setCardPinCode(123);
        victim.cardBalance = 1000;
        victim.creditLimit = 1000;
        victim.loanDebt = 0;
        victim.withDraw(-100, 123);
        int actualCardBalance = victim.cardBalance;
        int actualCreditLimit = victim.creditLimit;
        int actualLoanDebt = victim.loanDebt;
        assertEquals(1000, actualCardBalance);
        assertEquals(1000, actualCreditLimit);
        assertEquals(0, actualLoanDebt);
    }

    @Test
    public void withDrawIncorrectNumberZERO() {
        victim.setCardPinCode(123);
        victim.cardBalance = 1000;
        victim.creditLimit = 1000;
        victim.loanDebt = 0;
        victim.withDraw(0, 123);
        int actualCardBalance = victim.cardBalance;
        int actualCreditLimit = victim.creditLimit;
        int actualLoanDebt = victim.loanDebt;
        assertEquals(1000, actualCardBalance);
        assertEquals(1000, actualCreditLimit);
        assertEquals(0, actualLoanDebt);
    }

    @Test
    public void withDrawIncorrectPinCode() {
        victim.setCardPinCode(123);
        victim.cardBalance = 1000;
        victim.creditLimit = 1000;
        victim.loanDebt = 0;
        victim.withDraw(500, 12345);
        int actualCardBalance = victim.cardBalance;
        int actualCreditLimit = victim.creditLimit;
        int actualLoanDebt = victim.loanDebt;
        assertEquals(1000, actualCardBalance);
        assertEquals(1000, actualCreditLimit);
        assertEquals(0, actualLoanDebt);
    }

    @Test
    public void depositSimple() {
        victim.setCardPinCode(123);
        victim.cardBalance = 1000;
        victim.creditLimit = 1000;
        victim.loanDebt = 0;
        victim.deposit(500, 123);
        int actualCardBalance = victim.cardBalance;
        int actualCreditLimit = victim.creditLimit;
        int actualLoanDebt = victim.loanDebt;
        assertEquals(1500, actualCardBalance);
        assertEquals(1000, actualCreditLimit);
        assertEquals(0, actualLoanDebt);
    }

    @Test
    public void depositWithLoanDebt() {
        victim.setCardPinCode(123);
        victim.cardBalance = 0;
        victim.creditLimit = 1000;
        victim.loanDebt = 200;
        victim.deposit(500, 123);
        int actualCardBalance = victim.cardBalance;
        int actualCreditLimit = victim.creditLimit;
        int actualLoanDebt = victim.loanDebt;
        assertEquals(300, actualCardBalance);
        assertEquals(1000, actualCreditLimit);
        assertEquals(0, actualLoanDebt);
    }

    @Test
    public void depositWithAllMoneyToLoanDebt() {
        victim.setCardPinCode(123);
        victim.cardBalance = 0;
        victim.creditLimit = 1000;
        victim.loanDebt = 1000;
        victim.deposit(500, 123);
        int actualCardBalance = victim.cardBalance;
        int actualCreditLimit = victim.creditLimit;
        int actualLoanDebt = victim.loanDebt;
        assertEquals(0, actualCardBalance);
        assertEquals(1000, actualCreditLimit);
        assertEquals(500, actualLoanDebt);
    }

    @Test
    public void depositIncorrectNumber() {
        victim.setCardPinCode(123);
        victim.cardBalance = 200;
        victim.creditLimit = 1000;
        victim.loanDebt = 0;
        victim.deposit(-100, 123);
        int actualCardBalance = victim.cardBalance;
        int actualCreditLimit = victim.creditLimit;
        int actualLoanDebt = victim.loanDebt;
        assertEquals(200, actualCardBalance);
        assertEquals(1000, actualCreditLimit);
        assertEquals(0, actualLoanDebt);
    }

    @Test
    public void depositIncorrectNumberZERO() {
        victim.setCardPinCode(123);
        victim.cardBalance = 200;
        victim.creditLimit = 1000;
        victim.loanDebt = 0;
        victim.deposit(0, 123);
        int actualCardBalance = victim.cardBalance;
        int actualCreditLimit = victim.creditLimit;
        int actualLoanDebt = victim.loanDebt;
        assertEquals(200, actualCardBalance);
        assertEquals(1000, actualCreditLimit);
        assertEquals(0, actualLoanDebt);
    }

    @Test
    public void depositIncorrectPinCode() {
        victim.setCardPinCode(123);
        victim.cardBalance = 200;
        victim.creditLimit = 1000;
        victim.loanDebt = 0;
        victim.deposit(500, 12345);
        int actualCardBalance = victim.cardBalance;
        int actualCreditLimit = victim.creditLimit;
        int actualLoanDebt = victim.loanDebt;
        assertEquals(200, actualCardBalance);
        assertEquals(1000, actualCreditLimit);
        assertEquals(0, actualLoanDebt);
    }
}