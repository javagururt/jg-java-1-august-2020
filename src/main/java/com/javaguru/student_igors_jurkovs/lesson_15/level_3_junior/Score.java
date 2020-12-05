package com.javaguru.student_igors_jurkovs.lesson_15.level_3_junior;

import java.util.HashMap;
import java.util.Map;

public class Score {

    private Score() {
    }

    public static String getScores(Integer numericalScore) {
        Map<Integer, String> scores = new HashMap<>();
        scores.put(0, "Love");
        scores.put(1, "Fifteen");
        scores.put(2, "Thirty");
        scores.put(3, "Forty");

        return scores.get(numericalScore);
    }
}
