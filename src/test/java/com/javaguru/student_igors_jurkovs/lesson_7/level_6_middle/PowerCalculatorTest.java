package com.javaguru.student_igors_jurkovs.lesson_7.level_6_middle;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(JUnitParamsRunner.class)
@Category(PowerCalculator.class)
public class PowerCalculatorTest {

    @Test
    @Parameters({
            "0, 0, 1",
            "2, 2, 4",
            "1, 0, 1",
            "0, 100, 0"
    })
    public void powerCalculator(int number, int power, int expected) {
        PowerCalculator victim = new PowerCalculator();
        int result = victim.powerCalculator(number, power);
        assertThat(result).isEqualByComparingTo(expected);
    }
}