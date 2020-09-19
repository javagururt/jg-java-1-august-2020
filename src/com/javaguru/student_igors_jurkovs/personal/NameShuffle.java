package com.javaguru.student_igors_jurkovs.personal;

class NameShuffle {
    public String nameShuffle(String s) {
        String firstName = s.substring(0, s.indexOf(" "));
        String lastName = s.substring(s.indexOf(" ") + 1);
        return lastName + " " + firstName;
    }
}

class NameShuffleTest {
    public static void main(String[] args) {
        NameShuffle nameShuffle = new NameShuffle();
        String name = nameShuffle.nameShuffle("Igor Jurkov");
        System.out.println(name);
    }
}

