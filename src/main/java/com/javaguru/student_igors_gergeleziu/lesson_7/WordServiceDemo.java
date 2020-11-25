package com.javaguru.student_igors_gergeleziu.lesson_7;


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
