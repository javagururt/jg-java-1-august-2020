package com.javaguru.student_igors_gergeleziu.lesson_7;

import com.javaguru.teacher.codereview.CodeReview;

@CodeReview(approved = true)
class WordServiceDemo {

    public static void main(String[] args) {
        WordService wordService= new WordService();
        wordService.setInputTextFromUser();
        String mostFrequentWord= wordService.replaceSymbolsInText(wordService.getInputText());
        String[] wordsInArray=wordService.divideTextOnWordsInArray(mostFrequentWord);
        mostFrequentWord=wordService.findMostFrequentWord(wordsInArray);
        wordService.printMostFrequentWord(mostFrequentWord);
    }

}
