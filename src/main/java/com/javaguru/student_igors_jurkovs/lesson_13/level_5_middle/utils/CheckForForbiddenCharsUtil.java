package com.javaguru.student_igors_jurkovs.lesson_13.level_5_middle.utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CheckForForbiddenCharsUtil {

    private CheckForForbiddenCharsUtil() {
    }

    public static boolean check(String text) {
        Pattern pattern = Pattern.compile("[^a-zA-Z0-9]");
        Matcher matcher = pattern.matcher(text);
        return matcher.find();
    }
}
