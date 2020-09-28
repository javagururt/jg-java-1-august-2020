package com.javaguru.student_igors_jurkovs.lesson_7.level_7_senior.FileSystem;

class File extends Folder {

    FileType fileType;

    File(String name, int size, FileType fileType) {
        super(name);
        this.size = FOLDER_SIZE + size;
        this.fileType = fileType;
    }
}
