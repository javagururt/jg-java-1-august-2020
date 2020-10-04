package com.javaguru.student_igors_jurkovs.personal;

class NameShuffleTest {
    public static void main(String[] args) {
        NameShuffle nameShuffle = new NameShuffle();
        String name = nameShuffle.nameShuffle("Igor Jurkov");
        System.out.println(name);
    }
}
