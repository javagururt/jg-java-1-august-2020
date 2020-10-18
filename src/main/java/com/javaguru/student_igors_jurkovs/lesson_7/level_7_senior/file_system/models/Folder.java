package com.javaguru.student_igors_jurkovs.lesson_7.level_7_senior.file_system.models;

public class Folder extends DiskObject {


    public Folder(String name) {
        this.name = name;
        this.size = MIN_SIZE;
    }
}

