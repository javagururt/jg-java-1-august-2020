package com.javaguru.student_igors_jurkovs.lesson_7.level_7_senior.FileSystem;

class SubFolder extends Folder {

    SubFolder(String name) {
        super(name);
        this.size = MIN_SIZE;
        this.uniqueNumber = setUniqueNumber();
    }
}
