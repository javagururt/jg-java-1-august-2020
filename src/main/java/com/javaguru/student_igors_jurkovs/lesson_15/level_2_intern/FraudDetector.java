package com.javaguru.student_igors_jurkovs.lesson_15.level_2_intern;

import com.javaguru.student_igors_jurkovs.lesson_14.level_3_junior.domain.Trader;

class FraudDetector {

    private final Trader trader;
    private final Trader fraud;

    public FraudDetector(Trader trader, Trader fraud) {
        this.trader = trader;
        this.fraud = fraud;
    }

    public boolean isFraud() {
        return compareTraderName() && compareCity();
    }

    private boolean compareTraderName() {
        return trader.getName().equals(fraud.getName());
    }

    private boolean compareCity() {
        return trader.getCity().equals(fraud.getCity());
    }

}
