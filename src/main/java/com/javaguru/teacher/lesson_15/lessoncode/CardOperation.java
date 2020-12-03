package com.javaguru.teacher.lesson_15.lessoncode;

import java.math.BigDecimal;
import java.util.function.Function;

public enum CardOperation implements Function<BigDecimal, BigDecimal> {

    DEPOSIT {
        @Override
        public BigDecimal apply(BigDecimal o) {
            System.out.println("Deposit: " + o);
            return o;
        }
    },

    WITHDRAW {
        @Override
        public BigDecimal apply(BigDecimal o) {
            System.out.println("Withdraw: " + o);
            return o;
        }
    }
}
