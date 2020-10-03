package com.javaguru.student_igors_jurkovs.lesson_7.level_7_senior.FileSystem;

import java.util.Arrays;

class FileSystemDemo {

    public static void main(String[] args) {

        VirtualDisk virtualDisk = new VirtualDisk(100);

        System.out.println(virtualDisk.getDiskName());
        System.out.println(Arrays.toString(virtualDisk.getDiskArray()));
        virtualDisk.createFolder("Test1");
        virtualDisk.createFolder("Test2");
        virtualDisk.createFile("Game", 50, FileType.EXE);
        virtualDisk.createSubfolder("Test2 sub folder", "Test2");
        virtualDisk.folderDeletion("Test2");

        System.out.println(virtualDisk.getDiskCurrentSize());
        System.out.println(virtualDisk.getVirtualDiskObjects());

        System.out.println(Arrays.toString(virtualDisk.getDiskArray()));

        virtualDisk.diskDefragmentation();

        System.out.println(Arrays.toString(virtualDisk.getDiskArray()));

        VirtualDisk virtualDisk1 = new VirtualDisk(70);

        virtualDisk1.createFolder("Test3");
        virtualDisk1.createSubfolder("Test3 in", "Test3");
        System.out.println();

        System.out.println(virtualDisk1.getDiskName());
        System.out.println(virtualDisk1.getDiskCurrentSize());

        virtualDisk1.createFile("Big File", 1700, FileType.JAVA);

        System.out.println(virtualDisk1.getDiskCurrentSize());

        virtualDisk1.createFile("Random text", 30, FileType.TXT);
        System.out.println(virtualDisk1.getDiskCurrentSize());

        virtualDisk1.folderDeletion("Random text");

        System.out.println(virtualDisk1.getDiskCurrentSize());

        System.out.println(Arrays.toString(virtualDisk1.getDiskArray()));
    }
}
