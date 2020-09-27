package com.javaguru.student_igors_jurkovs.lesson_7.level_6_middle;

class CreditCardTest {

    private final CreditCard creditCard = new CreditCard("4580 2345 2211 0421", 1234);

    public static void main(String[] args) {

        CreditCardTest creditCardTest = new CreditCardTest();
        creditCardTest.shouldDepositMoney();
        creditCardTest.shouldNotDepositMoneyBecauseOfInvalidPin();
        creditCardTest.shouldWithdrawMoney();
        creditCardTest.shouldNotWithdrawMoneyBecauseOfInvalidPin();
        creditCardTest.shouldIncreaseCreditLimit();
        creditCardTest.shouldIncreaseLoanDebtBy100();
        creditCardTest.shouldRepayLoanFirst();
        creditCardTest.shouldDeclineWithdrawBecauseOfExceededCreditLimit();
    }

    void shouldDepositMoney() {
        double expected = 200;
        double result = creditCard.deposit(200, 1234);
        creditCard.test(expected == result, "Deposit");
    }

    void shouldNotDepositMoneyBecauseOfInvalidPin() {
        double expected = 200;
        double result = creditCard.deposit(200, 1235);
        creditCard.test(expected == result, "Deposit declined, invalid pin");
    }

    void shouldWithdrawMoney() {
        double expected = 100;
        double result = creditCard.withdraw(100, 1234);
        creditCard.test(expected == result, "Withdraw");
    }

    void shouldNotWithdrawMoneyBecauseOfInvalidPin() {
        double expected = 100;
        double result = creditCard.withdraw(100, 1235);
        creditCard.test(expected == result, "Withdraw declined, invalid pin");
    }

    void shouldIncreaseCreditLimit() {
        creditCard.setCreditLimit(2000);
        double expected = 2000;
        double result = creditCard.getCreditLimit();
        creditCard.test(expected == result, "Increase credit limit");
    }

    void shouldIncreaseLoanDebtBy100() {
        double expected = 100;
        creditCard.withdraw(200, 1234);
        double result = creditCard.getLoanDebt();
        creditCard.test(expected == result, "Loan debt increase");
    }

    void shouldRepayLoanFirst() {
        double expected = 0;
        creditCard.deposit(100, 1234);
        double result = creditCard.getLoanDebt();
        creditCard.test(expected == result, "Loan debt repay");
    }

    void shouldDeclineWithdrawBecauseOfExceededCreditLimit() {
        double expected = 0;
        double result = creditCard.withdraw(2500, 1234);
        creditCard.test(expected == result, "Withdraw declined, credit limit exceeded");
    }
}
