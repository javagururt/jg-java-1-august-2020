package main.java.com.javaguru.student_igors_jurkovs.lesson_7.level_7_senior.file_system.models;

import com.javaguru.teacher.codereview.CodeReviewComment;

@CodeReviewComment(teacher = "стоит по максимуму инкапсулировать класс")
public abstract class VirtualDiskObject {

    public static final int MAX_CHAR = 20;
    public static final int MIN_SIZE = 5;

    protected String name;
    protected int size;
    protected int uniqueNumber;

    public String getName() {
        return name;
    }

    public int getSize() {
        return size;
    }

    public int getUniqueNumber() {
        return uniqueNumber;
    }

    public void setUniqueNumber(int uniqueNumber) {
        this.uniqueNumber = uniqueNumber;
    }

    public abstract void addSubFolderToFolderList(SubFolder subFolder);
}
