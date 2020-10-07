package com.javaguru.student_igors_jurkovs.lesson_7.level_7_senior.file_system.models;

import com.javaguru.student_igors_jurkovs.lesson_7.level_7_senior.file_system.FileType;

public class File extends DiskObject {

    FileType fileType;

    public File(String name, int size, FileType fileType) {
        this.name = name;
        this.size = MIN_SIZE + size;
        this.fileType = fileType;
    }

    public void setDirectory(String directory) {
        this.directory = directory + "\\" + name + "." + fileType;
    }

    @Override
    public String toString() {
        return "File{" +
                "fileType=" + fileType +
                ", directory='" + directory + '\'' +
                ", name='" + name + '\'' +
                ", size=" + size +
                ", uniqueNumber=" + uniqueNumber +
                '}';
    }
}
