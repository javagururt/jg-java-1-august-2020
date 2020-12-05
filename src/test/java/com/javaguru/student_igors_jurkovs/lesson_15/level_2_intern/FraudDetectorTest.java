package com.javaguru.student_igors_jurkovs.lesson_15.level_2_intern;

import com.javaguru.student_igors_jurkovs.lesson_14.level_3_junior.domain.Trader;
import org.junit.Test;

import static org.junit.Assert.*;

public class FraudDetectorTest {

    private final Trader trader1 = new Trader("Tim", "City");
    private final Trader fraud = new Trader("Tim", "City");
    private final FraudDetector victim = new FraudDetector(trader1, fraud);

    @Test
    public void isFraud() {
        boolean result = victim.isFraud();
        assertTrue(result);
    }
}