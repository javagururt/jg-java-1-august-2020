package com.javaguru.student_igors_jurkovs.lesson_7.level_7_senior.FileSystem;

class File extends VirtualDiskObject {

    FileType fileType;

    File(String name, int size, FileType fileType) {
        this.name = name;
        this.size = MIN_SIZE + size;
        this.fileType = fileType;
        this.uniqueNumber = setUniqueNumber();
    }

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
