package com.javaguru.student_igors_jurkovs.lesson_7.level_7_senior.file_system;

import com.javaguru.student_igors_jurkovs.lesson_7.level_7_senior.file_system.models.DiskObject;

import java.util.ArrayList;
import java.util.List;

public class VirtualDisk {

    public static char diskChar = 'C';

    private char diskName;
    private final int diskMaxMemory;
    private int diskMemoryUsed;
    private List<DiskObject> diskObjects;
    private int[] diskMemoryArray;

    VirtualDisk(int diskMaxMemory) {
        this.diskName = setDiskName();
        this.diskMaxMemory = diskMaxMemory;
        this.diskMemoryUsed = 0;
        this.diskObjects = new ArrayList<>();
        this.diskMemoryArray = new int[diskMaxMemory + 1];
    }

    int getDiskMemoryUsed() {
        return diskMemoryUsed;
    }

    public char getDiskName() {
        return diskName;
    }

    int[] getDiskMemoryArray() {
        return diskMemoryArray;
    }

    int getDiskMaxMemory() {
        return diskMaxMemory;
    }

    List<DiskObject> getDiskObjects() {
        return diskObjects;
    }

    void setDiskMemoryUsed(int diskMemoryUsed) {
        this.diskMemoryUsed = diskMemoryUsed;
    }

    void setDiskObjects(List<DiskObject> diskObjects) {
        this.diskObjects = diskObjects;
    }

    void setDiskMemoryArray(int[] diskMemoryArray) {
        this.diskMemoryArray = diskMemoryArray;
    }

    private char setDiskName() {
        return diskChar++;
    }
}
