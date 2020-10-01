package com.javaguru.student_igors_jurkovs.lesson_7.level_7_senior.FileSystem;

import java.util.ArrayList;
import java.util.List;

class Folder {

    static final int FOLDER_SIZE = 5;
    static final int MAX_CHAR = 20;

    private final String name;
    int size;
    List<SubFolder> subFolders;

    Folder(String name) {
        this.name = name;
        this.size = FOLDER_SIZE;
        this.subFolders = new ArrayList<>();
    }

    void addSubFolderToFolderList(SubFolder subFolderName) {
        subFolders.add(subFolderName);
    }

    int getSize() {
        return size;
    }

    String getName() {
        return name;
    }


    @Override
    public String toString() {
        return "Folder{" +
                "name='" + name + '\'' +
                ", size=" + size +
                ", subFolders=" + subFolders +
                '}';
    }
}

