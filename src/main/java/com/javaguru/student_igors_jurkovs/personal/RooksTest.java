package com.javaguru.student_igors_jurkovs.personal;

class RooksTest {
    public static void main(String[] args) {
        Rooks rooks = new Rooks();
        boolean result = rooks.canCapture(new String[]{"A6", "E8"});
        System.out.println(result);

    }
}
