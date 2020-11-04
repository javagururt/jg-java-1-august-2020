package com.javaguru.student_igors_jurkovs.lesson_7.level_7_senior.file_system;

import com.javaguru.student_igors_jurkovs.lesson_7.level_7_senior.file_system.miscs.FileType;
import com.javaguru.student_igors_jurkovs.lesson_7.level_7_senior.file_system.miscs.PrintInformationUtils;
import com.javaguru.student_igors_jurkovs.lesson_7.level_7_senior.file_system.models.VirtualDisk;
import com.javaguru.student_igors_jurkovs.lesson_7.level_7_senior.file_system.services.DiskMemoryService;
import com.javaguru.student_igors_jurkovs.lesson_7.level_7_senior.file_system.services.FileManager;
import com.javaguru.student_igors_jurkovs.lesson_7.level_7_senior.file_system.services.VirtualDiskService;
import com.javaguru.teacher.codereview.CodeReview;
import com.javaguru.teacher.codereview.CodeReviewComment;

@CodeReview(approved = true)
class FileSystemDemo {

    public static void main(String[] args) {

        VirtualDisk virtualDisk = new VirtualDisk(40);
        DiskMemoryService diskMemoryService = new DiskMemoryService(virtualDisk);
        FileManager fileManager = new FileManager(virtualDisk);
        VirtualDiskService virtualDiskService = new VirtualDiskService(diskMemoryService, fileManager);

        PrintInformationUtils.printDiskName(virtualDisk);
        PrintInformationUtils.printDiskCurrentMemoryUsed(virtualDisk);
        PrintInformationUtils.printDiskMemoryArray(virtualDisk);
        PrintInformationUtils.printDiskObjects(virtualDisk);

        System.out.println("Creating two folders, 1 subfolder and 1 file");
        virtualDiskService.createFolder("Test1");
        virtualDiskService.createFolder("Test2");
        virtualDiskService.createSubFolder("Test2", "Test2 sub folder");
        virtualDiskService.createFile("Game", 10, FileType.EXE);

        PrintInformationUtils.printDiskCurrentMemoryUsed(virtualDisk);
        PrintInformationUtils.printDiskMemoryArray(virtualDisk);
        PrintInformationUtils.printDiskObjects(virtualDisk);

        System.out.println("Creating sub folder with too long name");
        virtualDiskService.createSubFolder("Test1", "Too long name to create folder");

        PrintInformationUtils.printDiskCurrentMemoryUsed(virtualDisk);
        PrintInformationUtils.printDiskMemoryArray(virtualDisk);
        PrintInformationUtils.printDiskObjects(virtualDisk);

        System.out.println("Deleting folder 'Test2'");
        virtualDiskService.deleteDiskObject("Test2");

        PrintInformationUtils.printDiskCurrentMemoryUsed(virtualDisk);
        PrintInformationUtils.printDiskMemoryArray(virtualDisk);
        PrintInformationUtils.printDiskObjects(virtualDisk);

        System.out.println("Creating txt file 'Test3'");
        virtualDiskService.createFile("Test3", 5, FileType.TXT);

        PrintInformationUtils.printDiskCurrentMemoryUsed(virtualDisk);
        PrintInformationUtils.printDiskMemoryArray(virtualDisk);
        PrintInformationUtils.printDiskObjects(virtualDisk);

        System.out.println("Using defragmentation");
        diskMemoryService.diskDefragmentation();

        PrintInformationUtils.printDiskMemoryArray(virtualDisk);

        VirtualDisk virtualDisk1 = new VirtualDisk(70);
        DiskMemoryService diskMemoryService1 = new DiskMemoryService(virtualDisk1);
        FileManager fileManager1 = new FileManager(virtualDisk1);
        VirtualDiskService virtualDiskService1 = new VirtualDiskService(diskMemoryService1, fileManager1);

        PrintInformationUtils.printDiskName(virtualDisk1);
        PrintInformationUtils.printDiskCurrentMemoryUsed(virtualDisk1);
        PrintInformationUtils.printDiskMemoryArray(virtualDisk1);
        PrintInformationUtils.printDiskObjects(virtualDisk1);

        System.out.println("Creating folder 'Test4'");
        virtualDiskService1.createFolder("Test4");

        PrintInformationUtils.printDiskCurrentMemoryUsed(virtualDisk1);
        PrintInformationUtils.printDiskMemoryArray(virtualDisk1);
        PrintInformationUtils.printDiskObjects(virtualDisk1);


        System.out.println("Creating text file");
        virtualDiskService1.createFile("Random text", 30, FileType.TXT);

        PrintInformationUtils.printDiskCurrentMemoryUsed(virtualDisk1);
        PrintInformationUtils.printDiskMemoryArray(virtualDisk1);
        PrintInformationUtils.printDiskObjects(virtualDisk1);

        System.out.println("Creating folder and subfolder");
        virtualDiskService1.createFolder("Test5");
        virtualDiskService1.createSubFolder("Test5", "Test5 in");

        PrintInformationUtils.printDiskCurrentMemoryUsed(virtualDisk1);
        PrintInformationUtils.printDiskMemoryArray(virtualDisk1);
        PrintInformationUtils.printDiskObjects(virtualDisk1);

        System.out.println("Trying to create file bigger than disk remaining memory");
        virtualDiskService1.createFile("Big File", 80, FileType.JAVA);

        PrintInformationUtils.printDiskCurrentMemoryUsed(virtualDisk1);

        System.out.println("Deleting text file and folder 'Test5'");
        virtualDiskService1.deleteDiskObject("Random text");
        virtualDiskService1.deleteDiskObject("Test5");

        PrintInformationUtils.printDiskCurrentMemoryUsed(virtualDisk1);
        PrintInformationUtils.printDiskMemoryArray(virtualDisk1);
        PrintInformationUtils.printDiskObjects(virtualDisk1);

        System.out.println("Creating exe file");
        virtualDiskService1.createFile("Random text", 30, FileType.EXE);

        PrintInformationUtils.printDiskCurrentMemoryUsed(virtualDisk1);
        PrintInformationUtils.printDiskMemoryArray(virtualDisk1);
        PrintInformationUtils.printDiskObjects(virtualDisk1);

        System.out.println("Creating txt file in Test4 folder");
        virtualDiskService1.createFileInFolder("Test4", "Text test", 10, FileType.TXT);

        PrintInformationUtils.printDiskCurrentMemoryUsed(virtualDisk1);
        PrintInformationUtils.printDiskMemoryArray(virtualDisk1);
        PrintInformationUtils.printDiskObjects(virtualDisk1);

        diskMemoryService1.diskDefragmentation();
        PrintInformationUtils.printDiskMemoryArray(virtualDisk1);
    }
}
