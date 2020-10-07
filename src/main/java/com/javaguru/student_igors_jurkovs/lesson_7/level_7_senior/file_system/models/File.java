package main.java.com.javaguru.student_igors_jurkovs.lesson_7.level_7_senior.file_system.models;

import main.java.com.javaguru.student_igors_jurkovs.lesson_7.level_7_senior.file_system.FileType;
import com.javaguru.teacher.codereview.CodeReviewComment;

public class File extends VirtualDiskObject {

    FileType fileType;

    public File(String name, int size, FileType fileType) {
        this.name = name;
        this.size = MIN_SIZE + size;
        this.fileType = fileType;
        this.uniqueNumber = 0;
    }

    @CodeReviewComment(teacher = "зачем метод, если он пустой?")
    public void addSubFolderToFolderList(SubFolder subFolder) {
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
