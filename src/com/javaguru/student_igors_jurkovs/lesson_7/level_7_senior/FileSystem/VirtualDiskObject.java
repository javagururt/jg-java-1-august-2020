package com.javaguru.student_igors_jurkovs.lesson_7.level_7_senior.FileSystem;

import com.javaguru.teacher.codereview.CodeReviewComment;

@CodeReviewComment(teacher = "стоит по максимуму инкапсулировать класс")
abstract class VirtualDiskObject {

    static final int MIN_SIZE = 5;
    static final int MAX_CHAR = 20;
    static int objectUniqueNumber = 1;

    String name;
    int size;
    int uniqueNumber;

    String getName() {
        return name;
    }

    int getSize() {
        return size;
    }

    @CodeReviewComment(teacher = "лучше вынести в отедльный класс unique number," +
            "сделать так, чтобы вся работа происходила, через методы (не нужно менять состоянии напрямую)")
    int setUniqueNumber() {
        return objectUniqueNumber++;
    }

    static void resetObjectUniqueNumber() {
        objectUniqueNumber = 1;
    }

    abstract void addSubFolderToFolderList(SubFolder subFolder);
}
