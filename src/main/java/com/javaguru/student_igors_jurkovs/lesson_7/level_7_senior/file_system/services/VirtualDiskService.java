package com.javaguru.student_igors_jurkovs.lesson_7.level_7_senior.file_system.services;


import com.javaguru.student_igors_jurkovs.lesson_7.level_7_senior.file_system.exceptions.InvalidDiskObjectException;
import com.javaguru.student_igors_jurkovs.lesson_7.level_7_senior.file_system.exceptions.NoSuchNameException;
import com.javaguru.student_igors_jurkovs.lesson_7.level_7_senior.file_system.miscs.FileType;
import com.javaguru.student_igors_jurkovs.lesson_7.level_7_senior.file_system.miscs.UniqueNumber;
import com.javaguru.student_igors_jurkovs.lesson_7.level_7_senior.file_system.models.DiskObject;
import com.javaguru.student_igors_jurkovs.lesson_7.level_7_senior.file_system.models.File;
import com.javaguru.student_igors_jurkovs.lesson_7.level_7_senior.file_system.models.Folder;
import com.javaguru.student_igors_jurkovs.lesson_7.level_7_senior.file_system.models.VirtualDisk;

public class VirtualDiskService {

    private final VirtualDisk virtualDisk;
    private final FileManager fileManager;

    public VirtualDiskService(VirtualDisk virtualDisk) {
        this.virtualDisk = virtualDisk;
        fileManager = new FileManager(virtualDisk);
        UniqueNumber.resetUniqueNumber();
    }

    public void createFolder(String name) {
        DiskObject folder = new Folder(name);
        fileManager.addingFolderToFileSystem(folder);
    }

    public void createFile(String name, int size, FileType fileType) {
        DiskObject file = new File(name, size, fileType);
        fileManager.addingFileToFileSystem(file);
    }

    public void createFileInFolder(String folderName, String name, int size, FileType fileType)
            throws NoSuchNameException, InvalidDiskObjectException {
        DiskObject file = new File(name, size, fileType);
        fileManager.addingFileToSubFolder(folderName, file);
    }

    public void createSubFolder(String folderName, String subObjectName)
            throws NoSuchNameException, InvalidDiskObjectException {
        DiskObject subFolder = new Folder(subObjectName);
        fileManager.addingSubObjectToFileSystem(folderName, subFolder);
    }

    public void deleteDiskObject(String name) throws NoSuchNameException {
        fileManager.diskObjectDeletion(name);
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
}
