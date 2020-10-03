package com.javaguru.student_igors_jurkovs.lesson_7.level_7_senior.FileSystem;

import java.util.ArrayList;
import java.util.List;

class VirtualDisk {

    private static char diskChar = 'C';

    private final char diskName;
    private final int diskMaxiSize;
    private int diskCurrentSize;
    private final List<VirtualDiskObject> virtualDiskObjects;
    private final int[] diskArray;

    VirtualDisk(int diskMaxiSize) {
        this.diskName = diskName();
        this.diskMaxiSize = diskMaxiSize;
        this.diskCurrentSize = 0;
        this.virtualDiskObjects = new ArrayList<>();
        this.diskArray = new int[diskMaxiSize];
    }

    int getDiskCurrentSize() {
        return diskCurrentSize;
    }

    char getDiskName() {
        return diskName;
    }

    int[] getDiskArray() {
        return diskArray;
    }

    List<VirtualDiskObject> getVirtualDiskObjects() {
        return virtualDiskObjects;
    }

    void createFolder(String name) {
        VirtualDiskObject folder = new Folder(name);
        addingVirtualDiskObjectToDisk(folder);
    }

    void createFile(String name, int size, FileType fileType) {
        VirtualDiskObject file = new File(name, size, fileType);
        addingVirtualDiskObjectToDisk(file);
    }

    void createSubfolder(String subFolderName, String folderName) {
        SubFolder subFolder = new SubFolder(subFolderName);
        VirtualDiskObject folder = findVirtualDiskObject(folderName);
        if (isFolderNameContainsLessThan20Characters(subFolder) && isEnoughMemory(subFolder)) {
            folder.addSubFolderToFolderList(subFolder);
            virtualDiskObjectWritingToDiskArray(subFolder);
            diskCurrentSize += subFolder.size;
        }
    }

    void addingVirtualDiskObjectToDisk(VirtualDiskObject virtualDiskObject) {
        if (isFolderNameContainsLessThan20Characters(virtualDiskObject) && isEnoughMemory(virtualDiskObject)) {
            virtualDiskObjects.add(virtualDiskObject);
            virtualDiskObjectWritingToDiskArray(virtualDiskObject);
            diskCurrentSize += virtualDiskObject.getSize();
        }
    }

    void folderDeletion(String name) {
        VirtualDiskObject virtualDiskObject = findVirtualDiskObject(name);
        virtualDiskObjects.remove(virtualDiskObject);
        diskCurrentSize -= virtualDiskObject.getSize();
        virtualDiskObjectErasingFromDiskArray(virtualDiskObject);
    }

    private VirtualDiskObject findVirtualDiskObject(String name) {
        VirtualDiskObject virtualDiskObject = null;
        for (VirtualDiskObject vdo : virtualDiskObjects) {
            if (vdo.getName().equals(name)) {
                virtualDiskObject = vdo;
                break;
            }
        }

        return virtualDiskObject;
    }

    void virtualDiskObjectWritingToDiskArray(VirtualDiskObject virtualDiskObject) {
        for (int i = getDiskCurrentSize(); i <= getDiskCurrentSize() + virtualDiskObject.size; i++) {
            diskArray[i] = virtualDiskObject.uniqueNumber;
        }
    }

    void virtualDiskObjectErasingFromDiskArray(VirtualDiskObject virtualDiskObject) {
        for (int i = findingUniqueNumberInDiskArray(virtualDiskObject);
             i < findingUniqueNumberInDiskArray(virtualDiskObject) + virtualDiskObject.size; i++) {
            diskArray[i] = 0;
        }
    }

    private int findingUniqueNumberInDiskArray(VirtualDiskObject virtualDiskObject) {
        int uniqueNumber = 0;
        for (int i = 0; i < diskArray.length; i++) {
            if (virtualDiskObject.uniqueNumber == diskArray[i]) {
                uniqueNumber = i;
                break;
            }
        }

        return uniqueNumber;
    }

    void diskDefragmentation() {
        boolean isSorted = false;
        while(!isSorted) {
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
    }

    private boolean isFolderNameContainsLessThan20Characters(VirtualDiskObject virtualDiskObject) {
        return virtualDiskObject.getName().length() <= Folder.MAX_CHAR;
    }

    private boolean isEnoughMemory(VirtualDiskObject virtualDiskObject) {
        return diskMaxiSize >= (diskCurrentSize + virtualDiskObject.size);
    }

    private char diskName() {
        return diskChar++;
    }
}
