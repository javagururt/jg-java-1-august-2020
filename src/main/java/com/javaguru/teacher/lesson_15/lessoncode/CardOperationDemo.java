package com.javaguru.teacher.lesson_15.lessoncode;

import java.math.BigDecimal;

class CardOperationDemo {

    public static void main(String[] args) {
        CardOperation.DEPOSIT.apply(new BigDecimal("100.00"));
        CardOperation.WITHDRAW.apply(new BigDecimal("300.00"));
    }
}
