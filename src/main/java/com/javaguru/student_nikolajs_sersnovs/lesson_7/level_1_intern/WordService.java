package com.javaguru.student_nikolajs_sersnovs.lesson_7.level_1_intern;


import java.util.Arrays;

class WordService {


    public String text(WordService text) {
        String myText = "JUNIOR FORMAT GLANCE JUNIOR JUNIOR GRASS DOCUMENT HOPE HISTORY KEEP " +
                "BIKE HOPE FORUM GALLERY PLANET HOPE VILLAGE BANANA";
        System.out.println(myText);
        return myText;
    }

    public String textSplit(String text) {
        String[] textSplit = text.split(" ");
        System.out.println(Arrays.toString(textSplit));
        return text;
    }

    public String textToLowerCase(String text) {
        System.out.println(text.toLowerCase());
        return text;
    }

    public String textIgnoreCase(String text, String text2) {
        boolean textIgnore = text.equalsIgnoreCase(text2);
        System.out.println(text2);
        System.out.println(textIgnore);

        return text;
    }

    public String textContains(String text, String word) {
        System.out.println("Searching words: " + word);
        if (text.contains(word)) {
            System.out.println("Word found");
        } else {
            System.out.println("Word not found");
        }
        return text;
    }

    public String textIndexOf(String text, String word) {
        System.out.println("Searching words: " + word);
        int index = text.indexOf(word);
        while (index >= 0) {
            System.out.println("Word index: " + index);
            index = text.indexOf(word, index + 1);
        }
        return text;
    }


 /*   public String findMostFrequentWord(String [] text) {

  */


}








