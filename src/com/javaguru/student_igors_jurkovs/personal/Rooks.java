package com.javaguru.student_igors_jurkovs.personal;

public class Rooks {
    public static boolean canCapture(String[] rooks) {
        return rooks[0].charAt(0) == rooks[1].charAt(0) || rooks[0].charAt(1) == rooks[1].charAt(1);
    }
}

