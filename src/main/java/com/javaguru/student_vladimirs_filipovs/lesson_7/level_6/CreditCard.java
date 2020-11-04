package com.javaguru.student_vladimirs_filipovs.lesson_7.level_6;

import com.javaguru.teacher.codereview.CodeReview;

@CodeReview(approved = true)
class CreditCard {
    private int cardNumber;
    private int cardPinCode;
    int cardBalance = 0;
    int creditLimit = 1000;
    int loanDebt = 0;

    public void setCardNumber(int cardNumber) {
        this.cardNumber = cardNumber;
    }

    public void setCardPinCode(int cardPinCode) {
        this.cardPinCode = cardPinCode;
    }

    public void withDraw(int takeMoney, int pinCode) {
        if (pinCode == cardPinCode) {
            if (loanDebt > creditLimit) {
                System.out.println("Loan debt is more than credit limit!");
            } else if (cardBalance > takeMoney && takeMoney > 0) {
                cardBalance = cardBalance - takeMoney;
            } else if (cardBalance + creditLimit > takeMoney && takeMoney > 0) {
                loanDebt = takeMoney - cardBalance;
                cardBalance = 0;
            } else if (cardBalance + creditLimit < takeMoney) {
                System.out.println("Your card balance and credit limit is less, then you want cash!");
            } else {
                System.out.println("Please enter correct sum what you want cash!");
            }
        } else {
            System.out.println("Card pin-code is wrong!");
        }
    }

    public void deposit(int putMoney, int pinCode) {
        if (pinCode == cardPinCode) {
            if (loanDebt == 0 && putMoney > 0) {
                cardBalance = cardBalance + putMoney;
            } else if (putMoney > loanDebt && putMoney > 0) {
                cardBalance = putMoney - loanDebt;
                loanDebt = 0;
            } else if (putMoney < loanDebt && putMoney > 0) {
                loanDebt = loanDebt - putMoney;
            } else {
                System.out.println("Please enter correct sum what you want put on the account!");
            }
        } else {
            System.out.println("Card pin-code is wrong!");
        }
    }

    public void printToConsoleBalance() {
        System.out.println("Card balance is: " + cardBalance);
        System.out.println("Card credit limit is: " + creditLimit);
        System.out.println("Card loan debt is: " + loanDebt);
        System.out.println("");
    }
}
