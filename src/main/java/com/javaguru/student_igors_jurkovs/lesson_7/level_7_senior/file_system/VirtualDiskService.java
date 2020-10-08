package com.javaguru.student_igors_jurkovs.lesson_7.level_7_senior.file_system;


import com.javaguru.student_igors_jurkovs.lesson_7.level_7_senior.file_system.models.DiskObject;
import com.javaguru.student_igors_jurkovs.lesson_7.level_7_senior.file_system.models.File;
import com.javaguru.student_igors_jurkovs.lesson_7.level_7_senior.file_system.models.Folder;

import java.util.ArrayList;
import java.util.List;

class VirtualDiskService {

    private final VirtualDisk virtualDisk;

    VirtualDiskService(VirtualDisk virtualDisk) {
        this.virtualDisk = virtualDisk;
        UniqueNumber.resetUniqueNumber();
    }

    void createFolder(String name) {
        DiskObject folder = new Folder(name);
        addingDiskObjectToDisk(folder);
        folder.setDirectory(folder.getDirectory());
    }

    void createFile(String name, int size, FileType fileType) {
        DiskObject file = new File(name, size, fileType);
        addingDiskObjectToDisk(file);
        file.setDirectory(file.getDirectory());
    }

    void createDiskObjectInFolder(String folderName, String subDiskObjectName) throws NoSuchNameException {
        DiskObject folder = findDiskObject(folderName);
        if (folder instanceof Folder) {
            DiskObject subFolder = new Folder(subDiskObjectName);
            addingDiskObjectToDisk(subFolder);
            subFolder.setDirectory(getDirectory(folderName));

        } else throw new NoSuchNameException();
    }


    String getDirectory(String name) throws NoSuchNameException {
        DiskObject diskObject = findDiskObject(name);
        return diskObject.getDirectory();
    }

    private DiskObject findDiskObject(String name) throws NoSuchNameException {
        for (DiskObject diskObject : virtualDisk.getDiskObjects()) {
            if (diskObject.getName().equals(name)) {
                return diskObject;
            }
        }
        throw new NoSuchNameException();
    }

    private void addingDiskObjectToDisk(DiskObject diskObject) {
        if (nameIsLessThan20Char(diskObject) && isEnoughMemory(diskObject)) {
            List<DiskObject> diskObjects = virtualDisk.getDiskObjects();
            diskObjects.add(diskObject);
            diskObject.setUniqueNumber(UniqueNumber.uniqueNumberGeneration());
            writingToMemoryArray(diskObject);
            virtualDisk.setDiskMemoryUsed(increaseUsedMemory(diskObject));
            virtualDisk.setDiskObjects(diskObjects);
        }
    }

    void virtualDiskObjectDeletion(String name) throws NoSuchNameException {
        List<DiskObject> diskObjectsToDelete = new ArrayList<>();
        List<DiskObject> diskObjects = virtualDisk.getDiskObjects();
        DiskObject diskObject = findDiskObject(name);
        for (DiskObject diskObj : diskObjects) {
            if (diskObj.getDirectory().contains(diskObject.getDirectory())) {
                virtualDisk.setDiskMemoryUsed(decreaseUsedMemory(diskObject));
                erasingFromMemoryArray(diskObject);
                diskObjectsToDelete.add(diskObj);
            }
        }
        diskObjects.removeAll(diskObjectsToDelete);
        virtualDisk.setDiskObjects(diskObjects);
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

    void diskDefragmentation() {
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

    private boolean nameIsLessThan20Char(DiskObject diskObject) {
        return diskObject.getName().length() <= DiskObject.MAX_CHAR;
    }

    private boolean isEnoughMemory(DiskObject diskObject) {
        return virtualDisk.getDiskMaxMemory() >= (virtualDisk.getDiskMemoryUsed() + diskObject.getSize());
    }

    private int increaseUsedMemory(DiskObject diskObject) {
        return virtualDisk.getDiskMemoryUsed() + diskObject.getSize();
    }

    private int decreaseUsedMemory(DiskObject diskObject) {
        return virtualDisk.getDiskMemoryUsed() - diskObject.getSize();
    }
}
