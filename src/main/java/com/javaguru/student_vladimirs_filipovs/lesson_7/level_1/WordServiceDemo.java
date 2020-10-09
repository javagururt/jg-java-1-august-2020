package com.javaguru.student_vladimirs_filipovs.lesson_7.level_1;

class WordServiceDemo {
    public static void main(String[] args) {
        WordService wordService = new WordService();

        wordService.setInputText("Quit! quit_ quit cat, cat- exit@ exit= exit. В старые времена считалось наивным " +
                "приклеивать на монитор бумажку с паролями. Сейчас это единственное место, " +
                "откуда их трудно украсть хакерам.");

        String mostPopularWordInTheText = wordService.deleteSymbolsInTheText(wordService.getInputText());
        String[] wordInTheTextInArray = wordService.divideTextInWordsArray(mostPopularWordInTheText);
        mostPopularWordInTheText = wordService.findMostFrequentWord(wordInTheTextInArray);
        wordService.printToConsole(mostPopularWordInTheText);
    }
}
