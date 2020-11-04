package com.javaguru.student_vladimirs_filipovs.lesson_7.level_6;

class CreditCardTest {
    public static void main(String[] args) {
        CreditCardTest testRunner = new CreditCardTest();
        testRunner.withDrawCardBalanceMoreThenTakeMoney();
        testRunner.withDrawCardBalanceLessThenTakeMoney();
        testRunner.withDrawCreditLimitLess();
        testRunner.withDrawIncorrectNumber();
        testRunner.withDrawIncorrectNumberZERO();
        testRunner.withDrawIncorrectPinCode();
        testRunner.depositSimple();
        testRunner.depositWithLoanDebt();
        testRunner.depositWithAllMoneyToLoanDebt();
        testRunner.depositIncorrectNumber();
        testRunner.depositIncorrectNumberZERO();
        testRunner.depositIncorrectPinCode();
    }

    public void withDrawCardBalanceMoreThenTakeMoney() {
        CreditCard creditCard = new CreditCard();
        creditCard.setCardPinCode(123);
        creditCard.cardBalance = 1000;
        creditCard.creditLimit = 1000;
        creditCard.loanDebt = 0;
        creditCard.withDraw(500, 123);
        int expectedCardBalance = 500;
        int expectedCreditLimit = 1000;
        int expectedLoanDebt = 0;
        int actualCardBalance = creditCard.cardBalance;
        int actualCreditLimit = creditCard.creditLimit;
        int actualLoanDebt = creditCard.loanDebt;
        assertResultString(expectedCardBalance, expectedCreditLimit, expectedLoanDebt, actualCardBalance, actualCreditLimit, actualLoanDebt, "withDrawCardBalanceMoreThenTakeMoney");
    }

    public void withDrawCardBalanceLessThenTakeMoney() {
        CreditCard creditCard = new CreditCard();
        creditCard.setCardPinCode(123);
        creditCard.cardBalance = 200;
        creditCard.creditLimit = 1000;
        creditCard.loanDebt = 0;
        creditCard.withDraw(500, 123);
        int expectedCardBalance = 0;
        int expectedCreditLimit = 1000;
        int expectedLoanDebt = 300;
        int actualCardBalance = creditCard.cardBalance;
        int actualCreditLimit = creditCard.creditLimit;
        int actualLoanDebt = creditCard.loanDebt;
        assertResultString(expectedCardBalance, expectedCreditLimit, expectedLoanDebt, actualCardBalance, actualCreditLimit, actualLoanDebt, "withDrawCardBalanceLessThenTakeMoney");
    }

    public void withDrawCreditLimitLess() {
        CreditCard creditCard = new CreditCard();
        creditCard.setCardPinCode(123);
        creditCard.cardBalance = 200;
        creditCard.creditLimit = 1000;
        creditCard.loanDebt = 0;
        creditCard.withDraw(1500, 123);
        int expectedCardBalance = 200;
        int expectedCreditLimit = 1000;
        int expectedLoanDebt = 0;
        int actualCardBalance = creditCard.cardBalance;
        int actualCreditLimit = creditCard.creditLimit;
        int actualLoanDebt = creditCard.loanDebt;
        assertResultString(expectedCardBalance, expectedCreditLimit, expectedLoanDebt, actualCardBalance, actualCreditLimit, actualLoanDebt, "withDrawCreditLimitLess");
    }

    public void withDrawIncorrectNumber() {
        CreditCard creditCard = new CreditCard();
        creditCard.setCardPinCode(123);
        creditCard.cardBalance = 1000;
        creditCard.creditLimit = 1000;
        creditCard.loanDebt = 0;
        creditCard.withDraw(-100, 123);
        int expectedCardBalance = 1000;
        int expectedCreditLimit = 1000;
        int expectedLoanDebt = 0;
        int actualCardBalance = creditCard.cardBalance;
        int actualCreditLimit = creditCard.creditLimit;
        int actualLoanDebt = creditCard.loanDebt;
        assertResultString(expectedCardBalance, expectedCreditLimit, expectedLoanDebt, actualCardBalance, actualCreditLimit, actualLoanDebt, "withDrawIncorrectNumber");
    }

    public void withDrawIncorrectNumberZERO() {
        CreditCard creditCard = new CreditCard();
        creditCard.setCardPinCode(123);
        creditCard.cardBalance = 1000;
        creditCard.creditLimit = 1000;
        creditCard.loanDebt = 0;
        creditCard.withDraw(0, 123);
        int expectedCardBalance = 1000;
        int expectedCreditLimit = 1000;
        int expectedLoanDebt = 0;
        int actualCardBalance = creditCard.cardBalance;
        int actualCreditLimit = creditCard.creditLimit;
        int actualLoanDebt = creditCard.loanDebt;
        assertResultString(expectedCardBalance, expectedCreditLimit, expectedLoanDebt, actualCardBalance, actualCreditLimit, actualLoanDebt, "withDrawIncorrectNumberZERO");
    }

    public void withDrawIncorrectPinCode() {
        CreditCard creditCard = new CreditCard();
        creditCard.setCardPinCode(123);
        creditCard.cardBalance = 1000;
        creditCard.creditLimit = 1000;
        creditCard.loanDebt = 0;
        creditCard.withDraw(500, 12345);
        int expectedCardBalance = 1000;
        int expectedCreditLimit = 1000;
        int expectedLoanDebt = 0;
        int actualCardBalance = creditCard.cardBalance;
        int actualCreditLimit = creditCard.creditLimit;
        int actualLoanDebt = creditCard.loanDebt;
        assertResultString(expectedCardBalance, expectedCreditLimit, expectedLoanDebt, actualCardBalance, actualCreditLimit, actualLoanDebt, "withDrawIncorrectPinCode");
    }

    public void depositSimple() {
        CreditCard creditCard = new CreditCard();
        creditCard.setCardPinCode(123);
        creditCard.cardBalance = 1000;
        creditCard.creditLimit = 1000;
        creditCard.loanDebt = 0;
        creditCard.deposit(500, 123);
        int expectedCardBalance = 1500;
        int expectedCreditLimit = 1000;
        int expectedLoanDebt = 0;
        int actualCardBalance = creditCard.cardBalance;
        int actualCreditLimit = creditCard.creditLimit;
        int actualLoanDebt = creditCard.loanDebt;
        assertResultString(expectedCardBalance, expectedCreditLimit, expectedLoanDebt, actualCardBalance, actualCreditLimit, actualLoanDebt, "depositSimple");
    }

    public void depositWithLoanDebt() {
        CreditCard creditCard = new CreditCard();
        creditCard.setCardPinCode(123);
        creditCard.cardBalance = 0;
        creditCard.creditLimit = 1000;
        creditCard.loanDebt = 200;
        creditCard.deposit(500, 123);
        int expectedCardBalance = 300;
        int expectedCreditLimit = 1000;
        int expectedLoanDebt = 0;
        int actualCardBalance = creditCard.cardBalance;
        int actualCreditLimit = creditCard.creditLimit;
        int actualLoanDebt = creditCard.loanDebt;
        assertResultString(expectedCardBalance, expectedCreditLimit, expectedLoanDebt, actualCardBalance, actualCreditLimit, actualLoanDebt, "depositWithLoanDebt");
    }

    public void depositWithAllMoneyToLoanDebt() {
        CreditCard creditCard = new CreditCard();
        creditCard.setCardPinCode(123);
        creditCard.cardBalance = 0;
        creditCard.creditLimit = 1000;
        creditCard.loanDebt = 1000;
        creditCard.deposit(500, 123);
        int expectedCardBalance = 0;
        int expectedCreditLimit = 1000;
        int expectedLoanDebt = 500;
        int actualCardBalance = creditCard.cardBalance;
        int actualCreditLimit = creditCard.creditLimit;
        int actualLoanDebt = creditCard.loanDebt;
        assertResultString(expectedCardBalance, expectedCreditLimit, expectedLoanDebt, actualCardBalance, actualCreditLimit, actualLoanDebt, "depositWithAllMoneyToLoanDebt");
    }

    public void depositIncorrectNumber() {
        CreditCard creditCard = new CreditCard();
        creditCard.setCardPinCode(123);
        creditCard.cardBalance = 200;
        creditCard.creditLimit = 1000;
        creditCard.loanDebt = 0;
        creditCard.deposit(-100, 123);
        int expectedCardBalance = 200;
        int expectedCreditLimit = 1000;
        int expectedLoanDebt = 0;
        int actualCardBalance = creditCard.cardBalance;
        int actualCreditLimit = creditCard.creditLimit;
        int actualLoanDebt = creditCard.loanDebt;
        assertResultString(expectedCardBalance, expectedCreditLimit, expectedLoanDebt, actualCardBalance, actualCreditLimit, actualLoanDebt, "depositIncorrectNumber");
    }

    public void depositIncorrectNumberZERO() {
        CreditCard creditCard = new CreditCard();
        creditCard.setCardPinCode(123);
        creditCard.cardBalance = 200;
        creditCard.creditLimit = 1000;
        creditCard.loanDebt = 0;
        creditCard.deposit(0, 123);
        int expectedCardBalance = 200;
        int expectedCreditLimit = 1000;
        int expectedLoanDebt = 0;
        int actualCardBalance = creditCard.cardBalance;
        int actualCreditLimit = creditCard.creditLimit;
        int actualLoanDebt = creditCard.loanDebt;
        assertResultString(expectedCardBalance, expectedCreditLimit, expectedLoanDebt, actualCardBalance, actualCreditLimit, actualLoanDebt, "depositIncorrectNumberZERO");
    }

    public void depositIncorrectPinCode() {
        CreditCard creditCard = new CreditCard();
        creditCard.setCardPinCode(123);
        creditCard.cardBalance = 200;
        creditCard.creditLimit = 1000;
        creditCard.loanDebt = 0;
        creditCard.deposit(500, 12345);
        int expectedCardBalance = 200;
        int expectedCreditLimit = 1000;
        int expectedLoanDebt = 0;
        int actualCardBalance = creditCard.cardBalance;
        int actualCreditLimit = creditCard.creditLimit;
        int actualLoanDebt = creditCard.loanDebt;
        assertResultString(expectedCardBalance, expectedCreditLimit, expectedLoanDebt, actualCardBalance, actualCreditLimit, actualLoanDebt, "depositIncorrectPinCode");
    }


    private void assertResultString(int expectedCardBalance, int expectedCreditLimit, int expectedLoanDebt, int actualCardBalance, int actualCreditLimit, int actualLoanDebt, String testName) {
        if (expectedCardBalance == actualCardBalance && expectedCreditLimit == actualCreditLimit && expectedLoanDebt == actualLoanDebt) {
            System.out.println(testName + ": SUCCESS");
        } else {
            System.out.println(testName + ": FAIL:");
            System.out.println("Expected card balance " + expectedCardBalance + ", actual card balance " + actualCardBalance);
            System.out.println("Expected credit limit " + expectedCreditLimit + ", actual credit limit " + actualCreditLimit);
            System.out.println("Expected loan debt " + expectedLoanDebt + ", actual loan debt " + actualLoanDebt);
        }
    }
}
