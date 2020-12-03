package com.javaguru.teacher.lesson_15.lessoncode;

class CardDetails {
    private String cardHolder;
    private String cardNumber;
    private String cvv;
    private CardStatus status;

    public String getCardHolder() {
        return cardHolder;
    }

    public void setCardHolder(String cardHolder) {
        this.cardHolder = cardHolder;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getCvv() {
        return cvv;
    }

    public void setCvv(String cvv) {
        this.cvv = cvv;
    }

    public CardStatus getStatus() {
        return status;
    }

    public void setStatus(CardStatus status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "CardDetails{" +
                "cardHolder='" + cardHolder + '\'' +
                ", cardNumber='" + "***********" + '\'' +
                ", cvv='" + "***" + '\'' +
                ", status=" + status.getValue() +
                '}';
    }
}
