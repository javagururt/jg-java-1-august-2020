package com.javaguru.student_igors_jurkovs.lesson_7.level_7_senior.file_system.services;

import com.javaguru.student_igors_jurkovs.lesson_7.level_7_senior.file_system.exceptions.NoSuchNameException;
import com.javaguru.student_igors_jurkovs.lesson_7.level_7_senior.file_system.exceptions.NotEnoughMemoryException;
import com.javaguru.student_igors_jurkovs.lesson_7.level_7_senior.file_system.models.VirtualDisk;
import com.javaguru.student_igors_jurkovs.lesson_7.level_7_senior.file_system.models.DiskObject;
import com.javaguru.teacher.codereview.CodeReviewComment;

import java.util.List;

@CodeReviewComment(teacher = "в данном случае VirtualDisk это все же класс для хранения информации" +
        ", лучше не делать из этого зависимость, тем более, что FileManager имеет точно такуюже зависимость")
public class DiskMemoryService {

    private final VirtualDisk virtualDisk;

    public DiskMemoryService(VirtualDisk virtualDisk) {
        this.virtualDisk = virtualDisk;
    }

    void addingDiskObjectToDiskMemory(DiskObject diskObject) {
        virtualDisk.setDiskMemoryUsed(increaseUsedMemory(diskObject));
        writingToMemoryArray(diskObject);
    }

    void erasingDiskObjectFromDiskMemory(String name) {
        erasingAllObjectsInDirectory(name);
    }

    private void writingToMemoryArray(DiskObject diskObject) {
        int[] diskArray = virtualDisk.getDiskMemoryArray();
        int counter = 0;
        int memoryCellIndex = 0;
        while (diskObject.getSize() != counter) {
            if (diskArray[memoryCellIndex] == 0) {
                diskArray[memoryCellIndex] = diskObject.getUniqueNumber();
                counter++;
            }
            memoryCellIndex++;
        }
        virtualDisk.setDiskMemoryArray(diskArray);
    }

    private void erasingAllObjectsInDirectory(String name) {
        List<DiskObject> diskObjects = virtualDisk.getDiskObjects();
        DiskObject diskObject = findDiskObject(name);
        for (DiskObject diskObj : diskObjects) {
            if (diskObj.getDirectory().contains(diskObject.getDirectory())) {
                erasingFromMemoryArray(diskObj);
                virtualDisk.setDiskMemoryUsed(decreaseUsedMemory(diskObj));
            }
        }
        virtualDisk.setDiskObjects(diskObjects);
    }

    private DiskObject findDiskObject(String name) {
        for (DiskObject diskObject : virtualDisk.getDiskObjects()) {
            if (diskObject.getName().equals(name)) {
                return diskObject;
            }
        }
        throw new NoSuchNameException();
    }

    private void erasingFromMemoryArray(DiskObject diskObject) {
        int[] diskArray = virtualDisk.getDiskMemoryArray();
        int counter = diskObject.getSize();
        for (int i = 0; i < diskArray.length; i++) {
            if (diskObject.getUniqueNumber() == diskArray[i]) {
                diskArray[i] = 0;
                counter--;
            }
            if (counter == 0) {
                break;
            }
        }
        virtualDisk.setDiskMemoryArray(diskArray);
    }

    public void diskDefragmentation() {
        int[] diskArray = virtualDisk.getDiskMemoryArray();
        boolean isSorted = false;
        while (!isSorted) {
            isSorted = true;
            for (int i = diskArray.length - 1; 1 <= i; i--) {
                if (diskArray[i] > diskArray[i - 1]) {
                    int temp = diskArray[i];
                    diskArray[i] = diskArray[i - 1];
                    diskArray[i - 1] = temp;
                    isSorted = false;
                }
            }
        }
        virtualDisk.setDiskMemoryArray(diskArray);
    }

    private int increaseUsedMemory(DiskObject diskObject) {
        return virtualDisk.getDiskMemoryUsed() + diskObject.getSize();
    }

    private int decreaseUsedMemory(DiskObject diskObject) {
        return virtualDisk.getDiskMemoryUsed() - diskObject.getSize();
    }

    void checkIfEnoughMemory(DiskObject diskObject) {
        if (virtualDisk.getDiskMaxMemory() <= (virtualDisk.getDiskMemoryUsed() + diskObject.getSize())) {
            throw new NotEnoughMemoryException("Not enough memory");
        }
    }
}
