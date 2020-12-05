package com.javaguru.student_vladimirs_filipovs.lesson_15.level_2;

class FraudDetector {
    boolean checkIsTraderFraud(Trader trader) {
        return checkIsTraderNameLikeFraudName(trader, "pokemon") || (checkIsTheCityBlocked(trader, "Riga"));
    }

    private boolean checkIsTraderNameLikeFraudName(Trader trader, String fraudName) {
        return trader.getFullName().equalsIgnoreCase(fraudName);
    }

    private boolean checkIsTheCityBlocked(Trader trader, String blockedCity) {
        return trader.getCity().equals(blockedCity);
    }
}
