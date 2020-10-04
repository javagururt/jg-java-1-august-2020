package com.javaguru.student_igors_jurkovs.lesson_7.level_7_senior.file_system;

import com.javaguru.teacher.codereview.CodeReviewComment;

class File extends VirtualDiskObject {

    FileType fileType;

    File(String name, int size, FileType fileType) {
        this.name = name;
        this.size = MIN_SIZE + size;
        this.fileType = fileType;
        this.uniqueNumber = setUniqueNumber();
    }

    @CodeReviewComment(teacher = "зачем метод, если он пустой?")
    void addSubFolderToFolderList(SubFolder subFolder) {
    }

    @Override
    public String toString() {
        return "File{" +
                "fileType=" + fileType +
                ", name='" + name + '\'' +
                ", size=" + size +
                ", uniqueNumber=" + uniqueNumber +
                '}';
    }
}
