package com.javaguru.student_igors_jurkovs.lesson_7.level_6_middle;

class PalindromeCheck {

    private String text;

    PalindromeCheck(String text) {
        this.text = text;
    }

    boolean isPalindrome() {
        for (int i = 0; i < splitTextToChar().length / 2; i++) {
            if (!(splitTextToChar()[i] == splitTextToChar()[splitTextToChar().length - i - 1])) {

                return false;
            }
        }

        return true;
    }

    String formattedText() {
        return text.toLowerCase().replaceAll(",", "")
                .replaceAll("\\.", "")
                .replaceAll(" ", "");
    }

    char[] splitTextToChar() {
        return formattedText().toCharArray();
    }

    void test(boolean condition, String action) {
        if (condition) {
            System.out.println(action + " : OK");
        } else {
            System.out.println(action + " : FAILED");
        }
    }
}
