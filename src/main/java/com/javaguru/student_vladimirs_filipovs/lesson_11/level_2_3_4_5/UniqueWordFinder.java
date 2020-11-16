package com.javaguru.student_vladimirs_filipovs.lesson_11.level_2_3_4_5;

import java.util.HashSet;
import java.util.Set;

class UniqueWordFinder {

    public Set<String> find(String text) {
        Set<String> findWordList = new HashSet<>();
        text = text.replaceAll("[!@,.<>:;()?/|'+=_*#$%^&-]", "");
        String words[] = text.split("\\s+");
        for (String str : words) {
            findWordList.add(str);
        }
        return findWordList;
    }
}

class FindWordDemo {
    public static void main(String[] args) {
        UniqueWordFinder finder = new UniqueWordFinder();
        System.out.println(finder.find("А нам всё равно, а нам всё равно. Пусть боимся мы волка и сову!"));
    }
}
