package main.java.com.javaguru.student_igors_jurkovs.lesson_7.level_7_senior.file_system.models;

public class SubFolder extends Folder {

    public SubFolder(String name) {
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
