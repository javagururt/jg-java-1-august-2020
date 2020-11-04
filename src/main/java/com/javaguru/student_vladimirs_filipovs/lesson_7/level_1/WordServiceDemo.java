package com.javaguru.student_vladimirs_filipovs.lesson_7.level_1;

class WordServiceDemo {
    public static void main(String[] args) {
        WordService wordService = new WordService();

        wordService.setInputText("privet, ja prijehal domoj, u menja krasnij dom. A potom prijehal vova v krasnij dom!!");

        String mostPopularWordInTheText = wordService.deleteSymbolsInTheText(wordService.getInputText());
        String[] wordInTheTextInArray = wordService.divideTextInWordsArray(mostPopularWordInTheText);
        mostPopularWordInTheText = wordService.findMostFrequentWord(wordInTheTextInArray);
        wordService.printToConsole(mostPopularWordInTheText);
    }
}
