package com.javaguru.student_igors_jurkovs.lesson_7.level_7_senior.file_system;

class SubFolder extends Folder {

    SubFolder(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "SubFolder{" +
                "name='" + name + '\'' +
                ", size=" + size +
                ", uniqueNumber=" + uniqueNumber +
                '}';
    }
}
