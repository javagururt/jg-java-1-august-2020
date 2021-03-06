package com.javaguru.student_maksim_morozov.lesson_7.level_4_junior;

import com.javaguru.teacher.codereview.CodeReviewComment;

class WordService {

    String text;
    @CodeReviewComment(teacher = "в Java не принятно объявлять все переменные в 1 строку")
    private int mostFrequentWord = 0, mostFrequentWordIndex = 0;

    WordService(String text){this.text = text;}

    @CodeReviewComment(teacher = "можно в первый раз использовать replace")
    String formattedText(){return text.replace(",","").replaceAll("\\.","");}

    String findMostFrequentWord(){return splitFormattedTextOnWords()[mostFrequentWordIndex];}

    String[] splitFormattedTextOnWords(){return formattedText().split(" ");}

    int[] howManyTimesEachWordRepeated(){
        int[] wordCount = new int[splitFormattedTextOnWords().length];
        for (int i = 0; i < splitFormattedTextOnWords().length; i++){
            for (String str: splitFormattedTextOnWords()){
                if (str.equalsIgnoreCase(splitFormattedTextOnWords()[i])){
                    wordCount[i]++;
                }
            }
        }
        return wordCount;
    }
    int mostFrequentWordIndex(){
        for (int i = 0; i < howManyTimesEachWordRepeated().length; i++){
            if (mostFrequentWord < howManyTimesEachWordRepeated()[i]){
                mostFrequentWord = howManyTimesEachWordRepeated()[i];
                mostFrequentWordIndex = i;
            }
        }
        return mostFrequentWordIndex;
    }
    void test(boolean condition, String action){
        if (condition) {
            System.out.println(action + "Test: OK!");
        } else {
            System.out.println(action + "Test: FAILED!");
        }
    }
}
