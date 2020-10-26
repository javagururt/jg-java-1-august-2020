package com.javaguru.student_nikolajs_sersnovs.lesson_7.level_1_intern;


class WordService {

    String text;

    public WordService(String text) {
        this.text = text;
    }

    public String[] textSplit() {
        return text.toLowerCase().split(" ");
    }

    public String textToLowerCase() {
        return text.toLowerCase();
    }

    public String textIgnoreCase(String text2) {
        return String.valueOf(text.equalsIgnoreCase(text2));
    }

    public boolean textContains(String word) {
        return text.contains(word);
    }

    public String textIndexOf(String word) {
        System.out.println(text);
        System.out.println("Searching words: " + word);
        int index = text.indexOf(word);
        while (index >= 0) {
            System.out.println("Word index: " + index);
            index = text.indexOf(word, index + 1);
        }
        return word;
    }


    /*   public String findMostFrequentWord(String [] text) {

     */


}








