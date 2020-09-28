package com.javaguru.student_igors_jurkovs.lesson_7.level_7_senior.FileSystem;

class FileSystemDemo {

    public static void main(String[] args) {

        VirtualDisk virtualDisk = new VirtualDisk('C', 1000);

        virtualDisk.folderCreation("Test");
        virtualDisk.folderCreation("Test2");

        System.out.println(virtualDisk.getDiskCurrentSize());
    }
}
