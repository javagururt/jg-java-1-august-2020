package com.javaguru.student_igors_jurkovs.lesson_7.level_7_senior.FileSystem;

import java.util.ArrayList;
import java.util.List;

class VirtualDisk {

    private final char diskName;
    private final int diskMaxiSize;
    private int diskCurrentSize;
    private List<Folder> foldersAndFiles;

    VirtualDisk(char diskName, int diskMaxiSize) {
        this.diskName = diskName;
        this.diskMaxiSize = diskMaxiSize;
        this.diskCurrentSize = 0;
        this.foldersAndFiles = new ArrayList<>();
    }

    int getDiskCurrentSize() {
        return diskCurrentSize;
    }

    void folderCreation(String name) {
        Folder folder = new Folder(name);
        if (isFolderNameContainsLessThan20Characters(folder)) {
            foldersAndFiles.add(folder);
            diskCurrentSize += folder.getSize();
        }
    }

    void folderDeletion(String name) {
        Folder folder = new Folder(name);
        foldersAndFiles.remove(folder);
        diskCurrentSize -= folder.getSize();
    }

    private boolean isFolderNameContainsLessThan20Characters(Folder folder) {
        int charactersCount = folder.getName().length();
        return charactersCount <= Folder.MAX_CHAR;
    }


//    private int findFolderIndex(String folderName) {
//        int index = 0;
//        for (Folder fol: folders) {
//            if (fol.folderName.equals(folderName)) {
//                index = folders.indexOf(fol);
//            }
//        }
//
//        return index;
//    }


}
