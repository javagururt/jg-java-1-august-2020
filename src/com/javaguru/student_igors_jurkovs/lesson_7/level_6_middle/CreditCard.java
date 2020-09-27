package com.javaguru.student_igors_jurkovs.lesson_7.level_6_middle;

class CreditCard {

    private final String cardNumber;
    private final int pin;
    private double balance;
    private double creditLimit;
    private double loanDebt;

    CreditCard(String cardNumber, int pin) {
        this.cardNumber = cardNumber;
        this.pin = pin;
        balance = 0;
        creditLimit = 1000;
        loanDebt = 0;
    }

    String getCardNumber() {
        return cardNumber;
    }

    double getBalance() {
        return balance;
    }

    void setCreditLimit(double creditLimit) {
        this.creditLimit = creditLimit;
    }

    double getLoanDebt() {
        return loanDebt;
    }

    double getCreditLimit() {
        return creditLimit;
    }

    double deposit(double deposit, int pin) {
        if (isPinValid(pin)) {
            calculateBalanceAfterDeposit(deposit);
            calculateLoanDebt();
        }

        return balance;
    }

    double withdraw(double withdraw, int pin) {
        if (isPinValid(pin)) {
            double balanceBeforeWithdraw = balance;
            calculateBalanceAfterWithdraw(withdraw);
            calculateLoanDebt();
            creditLimitExceeded(balanceBeforeWithdraw);
        }

        return balance;
    }

    private void calculateBalanceAfterWithdraw(double withdraw) {
        balance = balance - withdraw - loanDebt;
    }

    private void calculateBalanceAfterDeposit(double deposit) {
        balance = balance + deposit - loanDebt;
    }

    private void calculateLoanDebt() {
        if (balance < 0) {
            loanDebt = - balance;
            balance = 0;
        } else {
            loanDebt = 0;
        }
    }

    private void creditLimitExceeded(double balanceBeforeWithdraw) {
        if (isCreditLimitExceeded()) {
            balance = balanceBeforeWithdraw;
        }
    }

    private boolean isCreditLimitExceeded() {
        return loanDebt > creditLimit;
    }

    private boolean isPinValid(int userPin) {
        return pin == userPin;
    }

    void test(boolean condition, String action) {
        if (condition) {
            System.out.println(action + " test: OK");
        } else {
            System.out.println(action + " test: FAILED");
        }
    }
}
