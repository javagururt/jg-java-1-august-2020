package com.javaguru.student_igors_jurkovs.lesson_7.level_7_senior.file_system.services;

import com.javaguru.student_igors_jurkovs.lesson_7.level_7_senior.file_system.exceptions.InvalidDiskObjectException;
import com.javaguru.student_igors_jurkovs.lesson_7.level_7_senior.file_system.exceptions.NoSuchNameException;
import com.javaguru.student_igors_jurkovs.lesson_7.level_7_senior.file_system.miscs.UniqueNumber;
import com.javaguru.student_igors_jurkovs.lesson_7.level_7_senior.file_system.models.VirtualDisk;
import com.javaguru.student_igors_jurkovs.lesson_7.level_7_senior.file_system.models.DiskObject;
import com.javaguru.student_igors_jurkovs.lesson_7.level_7_senior.file_system.models.Folder;

import java.util.ArrayList;
import java.util.List;

class FileManager {

    private final VirtualDisk virtualDisk;
    private final DiskMemoryService diskMemoryService;

    FileManager(VirtualDisk virtualDisk) {
        this.virtualDisk = virtualDisk;
        diskMemoryService = new DiskMemoryService(virtualDisk);
    }

    void addingFolderToFileSystem(DiskObject folder) {
        addingDiskObjectToDisk(folder);
        folder.setDirectory(folder.getDirectory());
    }

    void addingFileToFileSystem(DiskObject file) {
        addingDiskObjectToDisk(file);
        file.setDirectory(file.getDirectory());
    }

    void addingSubObjectToFileSystem(String folderName, String subDiskObjectName) throws NoSuchNameException, InvalidDiskObjectException {
        DiskObject folder = findDiskObject(folderName);
        if (folder instanceof Folder) {
            DiskObject subFolder = new Folder(subDiskObjectName);
            addingDiskObjectToDisk(subFolder);
            subFolder.setDirectory(getDirectory(folderName));

        } else throw new InvalidDiskObjectException();
    }

    private String getDirectory(String name) throws NoSuchNameException {
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
            diskMemoryService.addingDiskObjectToDiskMemory(diskObject);
            virtualDisk.setDiskObjects(diskObjects);
        }
    }

    void diskObjectDeletion(String name) throws NoSuchNameException {
        List<DiskObject> diskObjectsToDelete = new ArrayList<>();
        List<DiskObject> diskObjects = virtualDisk.getDiskObjects();
        DiskObject diskObject = findDiskObject(name);
        for (DiskObject diskObj : diskObjects) {
            if (diskObj.getDirectory().contains(diskObject.getDirectory())) {
                diskMemoryService.erasingDiskObjectFromDiskMemory(diskObject);
                diskObjectsToDelete.add(diskObj);
            }
        }
        diskObjects.removeAll(diskObjectsToDelete);
        virtualDisk.setDiskObjects(diskObjects);
    }

    private boolean nameIsLessThan20Char(DiskObject diskObject) {
        return diskObject.getName().length() <= DiskObject.MAX_CHAR;
    }

    private boolean isEnoughMemory(DiskObject diskObject) {
        return virtualDisk.getDiskMaxMemory() >= (virtualDisk.getDiskMemoryUsed() + diskObject.getSize());
    }
}
