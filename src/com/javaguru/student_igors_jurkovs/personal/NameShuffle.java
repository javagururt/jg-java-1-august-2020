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

class Challenge {
    public static boolean PrimeNumberInRange(int n1, int n2) {
        boolean check = false;
        for(int i = n1; i <= n2; i++) {
            if(check) {
                break;
            }
            if(i == 2) {
                check = true;
            } else {
                for(int j = 2; j < i; j++) {
                    if(i % j != 0) {
                        check = true;
                        break;
                    }
                }
            }
        }
        return check;
    }
}

class test {
    public static void main(String[] args) {
        Challenge test = new Challenge();
        boolean result = test.PrimeNumberInRange(10,12);
        System.out.println(result);
    }
}