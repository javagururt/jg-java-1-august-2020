package com.javaguru.student_igors_jurkovs.lesson_7.level_7_senior.file_system;

class TestDirectory {

    public static void main(String[] args) throws NoSuchNameException {
        VirtualDisk virtualDisk = new VirtualDisk(123);
        VirtualDiskService virtualDiskService = new VirtualDiskService(virtualDisk);

        virtualDiskService.createFolder("Test1");
//        String test1 = virtualDiskService.getDirectory("Test1");
//        System.out.println(test1);

        virtualDiskService.createFile("Game", 20, FileType.EXE);
//        String test2 = virtualDiskService.getDirectory("Game");
//        System.out.println(test2);

        virtualDiskService.createDiskObjectInFolder("Test1","Test in folder");
        String test3 = virtualDiskService.getDirectory("Test in folder");
        System.out.println(test3);

        virtualDiskService.createDiskObjectInFolder("Test in folder","Test in folder2");
        String test4 = virtualDiskService.getDirectory("Test in folder2");
        System.out.println(test4);

        virtualDiskService.createFolder("Test5");
        String test5 = virtualDiskService.getDirectory("Test5");
        System.out.println(test5);
        PrintInformationUtils.printDiskObjects(virtualDisk);

        virtualDiskService.virtualDiskObjectDeletion("Test in folder");

        PrintInformationUtils.printDiskObjects(virtualDisk);
    }
}
