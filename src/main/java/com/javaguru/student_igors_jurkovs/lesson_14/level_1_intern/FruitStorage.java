package com.javaguru.student_igors_jurkovs.lesson_14.level_1_intern;

import java.util.List;
import java.util.stream.Collectors;

class FruitStorage {

    public List<Apple> findApples(List<Apple> inventory, ApplePredicate p) {
        return inventory
                .stream()
                .filter(p::test)
                .collect(Collectors.toList());
    }

}
