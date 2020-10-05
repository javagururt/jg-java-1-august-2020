package com.javaguru.student_igors_jurkovs.personal;

class NameShuffle {
    public String nameShuffle(String s) {
        String firstName = s.substring(0, s.indexOf(" "));
        String lastName = s.substring(s.indexOf(" ") + 1);
        return lastName + " " + firstName;
    }
}

