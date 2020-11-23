package com.javaguru.teacher.lesson_14.lessoncode;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

class StreamApiListService implements ListService {

    @Override
    public Set<String> convertToSet(List<String> strings) {
        return strings
                .stream()
                .collect(Collectors.toSet());
    }

    @Override
    public List<String> filterUniqueByLength(List<String> strings, int maxLength) {
        return strings
                .stream()
                .distinct()
                .filter(str -> str.length() <= maxLength)
                .collect(Collectors.toList());
    }


    public List<Person> sortByComparator(List<Person> people) {
        return people.stream()
                .sorted(this::compare)
                .collect(Collectors.toList());
    }

    private int compare(Person person1, Person person2) {
        if (person1.getAge().equals(person2.getAge())) {
            return 0;
        } else if (person1.getAge() > person2.getAge()) {
            return 1;
        } else {
            return -1;
        }
    }
}
