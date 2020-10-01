package com.javaguru.student_igors_jurkovs.lesson_7.level_7_senior.FileSystem;

import java.util.ArrayList;
import java.util.List;

class VirtualDisk {

    private static char diskChar = 'C';

    private final char diskName;
    private final int diskMaxiSize;
    private int diskCurrentSize;
    private final List<Folder> foldersAndFiles;

    VirtualDisk(int diskMaxiSize) {
        this.diskName = diskName();
        this.diskMaxiSize = diskMaxiSize;
        this.diskCurrentSize = 0;
        this.foldersAndFiles = new ArrayList<>();
    }

    int getDiskCurrentSize() {
        return diskCurrentSize;
    }

    char getDiskName() {
        return diskName;
    }

    List<Folder> getFoldersAndFiles() {
        return foldersAndFiles;
    }

    void folderCreation(String name) {
        Folder folder = new Folder(name);
        if (isFolderNameContainsLessThan20Characters(folder) && isEnoughMemory(folder)) {
            foldersAndFiles.add(folder);
            diskCurrentSize += folder.getSize();
        }
    }

    void fileCreation(String name, int size, FileType fileType) {
        Folder file = new File(name, size, fileType);
        if (isFolderNameContainsLessThan20Characters(file) && isEnoughMemory(file)) {
            foldersAndFiles.add(file);
            diskCurrentSize += file.size;
        }
    }

    void subFolderCreation(String subFolderName, String folderName) {
        SubFolder subFolder = new SubFolder(subFolderName);
        Folder folder = findFolder(folderName);
        if (isFolderNameContainsLessThan20Characters(subFolder) && isEnoughMemory(subFolder)) {
            folder.addSubFolderToFolderList(subFolder);
            diskCurrentSize += subFolder.size;
        }
    }

    void folderDeletion(String name) {
        Folder folder = findFolder(name);
        foldersAndFiles.remove(folder);
        diskCurrentSize -= folder.getSize();
    }

    private Folder findFolder(String name) {
        Folder folder = null;
        for (Folder fol : foldersAndFiles) {
            if (fol.getName().equals(name)) {
                folder = fol;
                break;
            }
        }

        return folder;
    }

    private boolean isFolderNameContainsLessThan20Characters(Folder folder) {
        int charactersCount = folder.getName().length();
        return charactersCount <= Folder.MAX_CHAR;
    }

    private boolean isEnoughMemory(Folder folder) {
        return diskMaxiSize >= (diskCurrentSize + folder.size);
    }

    private char diskName() {
        return diskChar++;
    }
}
