package com.javaguru.teacher.lesson_14.lessoncode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

class DefaultListService implements ListService {

    @Override
    public Set<String> convertToSet(List<String> strings) {
        return new HashSet<>(strings);
    }

    @Override
    public List<String> filterUniqueByLength(List<String> strings, int maxLength) {
        Set<String> uqStrings = new LinkedHashSet<>(strings);
        List<String> uqFilteredStrings = new ArrayList<>();
        for (String str : uqStrings) {
            if (str.length() <= maxLength) {
                uqFilteredStrings.add(str.toUpperCase());
            }
        }
        return uqFilteredStrings;
    }
}
