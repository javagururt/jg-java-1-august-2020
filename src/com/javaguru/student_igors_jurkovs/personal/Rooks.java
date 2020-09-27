package com.javaguru.student_igors_jurkovs.personal;

public class Rooks {
    public static boolean canCapture(String[] rooks) {
        return rooks[0].charAt(0) == rooks[1].charAt(0) || rooks[0].charAt(1) == rooks[1].charAt(1);
    }
}

class RooksTest {
    public static void main(String[] args) {
        Rooks rooks = new Rooks();
        boolean result = rooks.canCapture(new String[] {"A6", "E8"});
        System.out.println(result);

    }
}
