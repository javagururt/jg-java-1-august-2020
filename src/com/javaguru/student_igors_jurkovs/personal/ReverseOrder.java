package com.javaguru.student_igors_jurkovs.personal;

class ReverseOrder {
    public static String reverse(final String str) {
        char[] array = new char[str.length()];
        str.getChars(0, str.length(), array, 0);
        for (int i = 0; i < str.length() / 2; i++) {
            char temp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = temp;
        }
        return new String(array);
    }
}
