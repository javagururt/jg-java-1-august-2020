package com.javaguru.student_ivan_shulga.lesson_15.level_2_intern;

import com.javaguru.student_ivan_shulga.lesson_14.level_3_4_junior_and_5_6_middle.Trader;
import org.junit.Test;

import static org.junit.Assert.*;

public class FraudDetectorTest {

    Trader trader = new Trader("TestTrader", "TestCity");
    Trader fraud = new Trader("TestTrader", "TestCity");
    FraudDetector victim = new FraudDetector(trader, fraud);


    @Test
    public void isFraud() {
        boolean actual = victim.isFraud();
        assertTrue(actual);
    }
}