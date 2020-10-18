package com.javaguru.student_igors_jurkovs.lesson_7.level_7_senior.file_system.services;

import com.javaguru.student_igors_jurkovs.lesson_7.level_7_senior.file_system.exceptions.InvalidDiskObjectException;
import com.javaguru.student_igors_jurkovs.lesson_7.level_7_senior.file_system.exceptions.NoSuchNameException;
import com.javaguru.student_igors_jurkovs.lesson_7.level_7_senior.file_system.exceptions.TooLongNameException;
import com.javaguru.student_igors_jurkovs.lesson_7.level_7_senior.file_system.miscs.UniqueNumber;
import com.javaguru.student_igors_jurkovs.lesson_7.level_7_senior.file_system.models.VirtualDisk;
import com.javaguru.student_igors_jurkovs.lesson_7.level_7_senior.file_system.models.DiskObject;
import com.javaguru.student_igors_jurkovs.lesson_7.level_7_senior.file_system.models.Folder;

import java.util.ArrayList;
import java.util.List;

public class FileManager {

    private final VirtualDisk virtualDisk;

    public FileManager(VirtualDisk virtualDisk) {
        this.virtualDisk = virtualDisk;
    }

    void addingFolderToFileSystem(DiskObject folder) {
        addingDiskObjectToDisk(folder);
        folder.setDirectory(folder.getDirectory());
    }

    void addingFileToFileSystem(DiskObject file) {
        addingDiskObjectToDisk(file);
        file.setDirectory(file.getDirectory());
    }

    void addingSubObjectToFileSystem(String folderName, DiskObject subObject) {
        DiskObject folder = findDiskObject(folderName);
        if (folder instanceof Folder) {
            addingDiskObjectToDisk(subObject);
            subObject.setDirectory(getDirectory(folderName));

        } else throw new InvalidDiskObjectException();
    }

    void addingFileToSubFolder(String folderName, DiskObject file) {
        DiskObject folder = findDiskObject(folderName);
        if (folder instanceof Folder) {
            addingDiskObjectToDisk(file);
            file.setDirectory(getDirectory(folderName));

        } else throw new InvalidDiskObjectException();
    }

    private String getDirectory(String name) {
        DiskObject diskObject = findDiskObject(name);
        return diskObject.getDirectory();
    }

    private DiskObject findDiskObject(String name) {
        for (DiskObject diskObject : virtualDisk.getDiskObjects()) {
            if (diskObject.getName().equals(name)) {
                return diskObject;
            }
        }
        throw new NoSuchNameException();
    }

    private void addingDiskObjectToDisk(DiskObject diskObject) {
        List<DiskObject> diskObjects = virtualDisk.getDiskObjects();
        diskObjects.add(diskObject);
        diskObject.setUniqueNumber(UniqueNumber.uniqueNumberGeneration());
        virtualDisk.setDiskObjects(diskObjects);
    }

    void diskObjectDeletion(String name) {
        List<DiskObject> diskObjectsToDelete = new ArrayList<>();
        List<DiskObject> diskObjects = virtualDisk.getDiskObjects();
        DiskObject diskObject = findDiskObject(name);
        for (DiskObject diskObj : diskObjects) {
            if (diskObj.getDirectory().contains(diskObject.getDirectory())) {
                diskObjectsToDelete.add(diskObj);
            }
        }
        diskObjects.removeAll(diskObjectsToDelete);
        virtualDisk.setDiskObjects(diskObjects);
    }

    void checkNameLength(DiskObject diskObject) {
        if (diskObject.getName().length() >= DiskObject.MAX_CHAR) {
            throw new TooLongNameException("Name longer than 20 char");
        }
    }

}
