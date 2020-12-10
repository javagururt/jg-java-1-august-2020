package com.javaguru.student_ivan_shulga.lesson_15.level_2_intern;

import com.javaguru.student_ivan_shulga.lesson_14.level_3_4_junior_and_5_6_middle.Trader;

public class FraudDetector {

    private final Trader trader;
    private final Trader fraud;

    public FraudDetector(Trader trader, Trader fraud) {
        this.trader = trader;
        this.fraud = fraud;
    }

    public boolean isFraud() {
        return compareTraderNameWithFraudTraderName() && (compareCityWithFraudTraderCity());
    }

    private boolean compareTraderNameWithFraudTraderName () {
        return trader.getName().equals(fraud.getName());
    }

    private boolean compareCityWithFraudTraderCity() {
        return trader.getCity().equals(fraud.getCity());
    }

}
