package com.javaguru.teacher.lesson_14.lessoncode;

import java.util.HashMap;
import java.util.Map;

class UniqueWordVocabulary {

    private Map<String, Integer> uqWordVocabulary = new HashMap<>();

    void addWord(String word) {
        if (uqWordVocabulary.containsKey(word)) {
            Integer counter = uqWordVocabulary.get(word);
            counter++;
            uqWordVocabulary.put(word, counter);
        } else {
            uqWordVocabulary.put(word, 1);
        }
    }

    String getMostFrequentWord() {
        return uqWordVocabulary.entrySet()
                .stream()
                .max(Map.Entry.comparingByValue())
                .orElseThrow(() -> new IllegalArgumentException("Empty vocabulary"))
                .getKey();
    }
}
