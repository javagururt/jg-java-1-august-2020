package com.javaguru.student_igors_gergeleziu.lesson_7;

import java.util.Scanner;

class WordService {
    private String inputText;
    private String mostFrequentWord = "No frequent words";
    private int mostFrequentWordCount = 0;
    private int wordsCounter;

    public void setInputTextFromUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Text: ");
        this.inputText = scanner.nextLine();
    }

    public void setInputText(String inputText) {
        this.inputText = inputText;
    }

    public String getInputText() {
        return this.inputText;
    }

    public String replaceSymbolsInText(String inputText) {
        inputText = inputText.replaceAll("[!@,.<>:;()?/|'+=_*#$%^&-]", "");
        return inputText;
    }

    public String[] divideTextOnWordsInArray(String inputText) {
        String wordsArray[] = inputText.split("\\s+");
        return wordsArray;
    }

    public String findMostFrequentWord(String[] wordsArray) {
        for (int i = 0; i < wordsArray.length; i++) {
            wordsCounter = 1;
            for (int j = i + 1; j < wordsArray.length; j++) {
                if (wordsArray[i].equalsIgnoreCase(wordsArray[j])) {
                    wordsCounter++;
                }
                if (wordsCounter > 1 && wordsArray[i] != "0") {
                    if (mostFrequentWordCount < wordsCounter) {
                        mostFrequentWordCount = wordsCounter;
                        mostFrequentWord = wordsArray[i];
                    }
                }
            }
        }
        return mostFrequentWord;
    }

    public void printMostFrequentWord(String mostFrequentWord) {
        System.out.println("Most frequent word: " + mostFrequentWord);
    }
}
