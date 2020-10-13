package com.javaguru.student_igors_jurkovs.lesson_7.level_7_senior.file_system.services;

import com.javaguru.student_igors_jurkovs.lesson_7.level_7_senior.file_system.miscs.FileType;
import com.javaguru.student_igors_jurkovs.lesson_7.level_7_senior.file_system.miscs.UniqueNumber;
import com.javaguru.student_igors_jurkovs.lesson_7.level_7_senior.file_system.models.DiskObject;
import com.javaguru.student_igors_jurkovs.lesson_7.level_7_senior.file_system.models.File;
import com.javaguru.student_igors_jurkovs.lesson_7.level_7_senior.file_system.models.Folder;

public class VirtualDiskService {

    private final FileManager fileManager;
    private final DiskMemoryService diskMemoryService;

    public VirtualDiskService(DiskMemoryService diskMemoryService, FileManager fileManager) {
        this.fileManager = fileManager;
        this.diskMemoryService = diskMemoryService;
        UniqueNumber.resetUniqueNumber();
    }

    public void createFolder(String name) {
        DiskObject folder = new Folder(name);
        try {
            checkForNameAndMemory(folder);
            fileManager.addingFolderToFileSystem(folder);
            diskMemoryService.addingDiskObjectToDiskMemory(folder);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void createFile(String name, int size, FileType fileType) {
        DiskObject file = new File(name, size, fileType);
        try {
            checkForNameAndMemory(file);
            fileManager.addingFileToFileSystem(file);
            diskMemoryService.addingDiskObjectToDiskMemory(file);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void createFileInFolder(String folderName, String name, int size, FileType fileType) {
        DiskObject file = new File(name, size, fileType);
        try {
            checkForNameAndMemory(file);
            fileManager.addingFileToSubFolder(folderName, file);
            diskMemoryService.addingDiskObjectToDiskMemory(file);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void createSubFolder(String folderName, String subObjectName) {
        DiskObject subFolder = new Folder(subObjectName);
        try {
            checkForNameAndMemory(subFolder);
            fileManager.addingSubObjectToFileSystem(folderName, subFolder);
            diskMemoryService.addingDiskObjectToDiskMemory(subFolder);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void deleteDiskObject(String name) {
        diskMemoryService.erasingDiskObjectFromDiskMemory(name);
        fileManager.diskObjectDeletion(name);
    }

    private void checkForNameAndMemory(DiskObject diskObject) {
        diskMemoryService.checkIfEnoughMemory(diskObject);
        fileManager.checkNameLength(diskObject);
    }
}
