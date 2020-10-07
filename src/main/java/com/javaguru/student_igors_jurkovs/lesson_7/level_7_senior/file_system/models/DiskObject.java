package com.javaguru.student_igors_jurkovs.lesson_7.level_7_senior.file_system.models;

import com.javaguru.student_igors_jurkovs.lesson_7.level_7_senior.file_system.VirtualDisk;

import java.util.Objects;

public abstract class DiskObject {

    public static final int MAX_CHAR = 20;
    public static final int MIN_SIZE = 5;

    protected String directory = (char) (VirtualDisk.diskChar - 1) + ":";
    protected String name;
    protected int size;
    protected int uniqueNumber = 0;

    public String getName() {
        return name;
    }

    public int getSize() {
        return size;
    }

    public int getUniqueNumber() {
        return uniqueNumber;
    }

    public String getDirectory() {
        return directory;
    }

    public void setDirectory(String directory) {
        this.directory = directory + "\\" + name;
    }

    public void setUniqueNumber(int uniqueNumber) {
        this.uniqueNumber = uniqueNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DiskObject that = (DiskObject) o;
        return Objects.equals(name, that.name);
    }

    @Override
    public String toString() {
        return "Folder{" +
                "directory='" + directory + '\'' +
                ", name='" + name + '\'' +
                ", size=" + size +
                ", uniqueNumber=" + uniqueNumber +
                '}';
    }
}
