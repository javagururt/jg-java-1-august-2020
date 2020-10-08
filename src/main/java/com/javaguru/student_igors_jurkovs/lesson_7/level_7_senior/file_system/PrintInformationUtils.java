package com.javaguru.student_igors_jurkovs.lesson_7.level_7_senior.file_system;

import java.util.Arrays;

class PrintInformationUtils {

    private PrintInformationUtils() {
    }

    static void printDiskName(VirtualDisk virtualDisk) {
        System.out.println("Virtual disk name: " + virtualDisk.getDiskName());
        System.out.println();
    }

    static void printDiskMemoryArray(VirtualDisk virtualDisk) {
        System.out.println("Virtual disk memory array:");
        System.out.println(Arrays.toString(virtualDisk.getDiskMemoryArray()));
        System.out.println();
    }

    static void printDiskCurrentMemoryUsed(VirtualDisk virtualDisk) {
        System.out.println("Virtual disk memory used: " + "["
                + virtualDisk.getDiskMemoryUsed() + "/"
                + virtualDisk.getDiskMaxMemory() + "]");
        System.out.println();
    }

    static void printDiskObjects(VirtualDisk virtualDisk) {
        System.out.println(virtualDisk.getDiskObjects());
        System.out.println();
    }
}
