package com.javaguru.student_igors_jurkovs.lesson_7.level_7_senior.file_system.miscs;

import com.javaguru.student_igors_jurkovs.lesson_7.level_7_senior.file_system.models.VirtualDisk;

import java.util.Arrays;

public class PrintInformationUtils {

    private PrintInformationUtils() {
    }

    public static void printDiskName(VirtualDisk virtualDisk) {
        System.out.println("Virtual disk name: " + virtualDisk.getDiskName());
        System.out.println();
    }

    public static void printDiskMemoryArray(VirtualDisk virtualDisk) {
        System.out.println("Virtual disk memory array:");
        System.out.println(Arrays.toString(virtualDisk.getDiskMemoryArray()));
        System.out.println();
    }

    public static void printDiskCurrentMemoryUsed(VirtualDisk virtualDisk) {
        System.out.println("Virtual disk memory used: " + "["
                + virtualDisk.getDiskMemoryUsed() + "/"
                + virtualDisk.getDiskMaxMemory() + "]");
        System.out.println();
    }

    public static void printDiskObjects(VirtualDisk virtualDisk) {
        System.out.println(virtualDisk.getDiskObjects());
        System.out.println();
    }
}
