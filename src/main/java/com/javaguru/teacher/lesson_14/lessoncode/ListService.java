package com.javaguru.teacher.lesson_14.lessoncode;

import java.util.List;
import java.util.Set;

interface ListService {

    Set<String> convertToSet(List<String> strings);

    List<String> filterUniqueByLength(List<String> strings, int maxLength);
}
