package com.javaguru.student_igors_jurkovs.lesson_7.level_7_senior.FileSystem;

class FileSystemDemo {

    public static void main(String[] args) {

        VirtualDisk virtualDisk = new VirtualDisk(10000);

        virtualDisk.folderCreation("Test");
        virtualDisk.folderCreation("Test2");
        virtualDisk.fileCreation("Game", 2000, FileType.EXE);
        virtualDisk.subFolderCreation("Test2 sub folder", "Test2");
        virtualDisk.folderDeletion("Test2");


        System.out.println(virtualDisk.getDiskName());
        System.out.println(virtualDisk.getDiskCurrentSize());
        System.out.println(virtualDisk.getFoldersAndFiles());

        VirtualDisk virtualDisk1 = new VirtualDisk(1500);

        virtualDisk1.folderCreation("Test3");
        virtualDisk1.subFolderCreation("Test3 in", "Test3");
        System.out.println();

        System.out.println(virtualDisk1.getDiskName());
        System.out.println(virtualDisk1.getDiskCurrentSize());

        virtualDisk1.fileCreation("Big File", 1700, FileType.JAVA);

        System.out.println(virtualDisk1.getDiskCurrentSize());

        virtualDisk1.fileCreation("Random text", 500, FileType.TXT);
        System.out.println(virtualDisk1.getDiskCurrentSize());

        virtualDisk1.folderDeletion("Random text");

        System.out.println(virtualDisk1.getDiskCurrentSize());
    }
}
