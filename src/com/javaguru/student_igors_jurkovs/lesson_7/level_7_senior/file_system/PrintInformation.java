package com.javaguru.student_igors_jurkovs.lesson_7.level_7_senior.file_system;

import com.javaguru.teacher.codereview.CodeReviewComment;

import java.util.Arrays;

@CodeReviewComment(teacher = "если внутри только статик методы, то можно в название добавить Utils," +
        " а так же сделал приватный конструктор")
class PrintInformation {

    static void printVirtualDiskName(VirtualDisk virtualDisk) {
        System.out.println("Virtual disk name: " + virtualDisk.getDiskName());
        System.out.println();
    }

    static void printVirtualDiskMemoryArray(VirtualDisk virtualDisk) {
        System.out.println("Virtual disk memory array:");
        System.out.println(Arrays.toString(virtualDisk.getDiskArray()));
        System.out.println();
    }

    static void printVirtualDiskCurrentMemoryUsed(VirtualDisk virtualDisk) {
        System.out.println("Virtual disk memory used: " + "["
                + virtualDisk.getDiskMemoryUsed() + "/"
                + virtualDisk.getDiskMaxMemory() + "]");
        System.out.println();
    }

    static void printVirtualDiskObjects(VirtualDisk virtualDisk) {
        System.out.println(virtualDisk.getVirtualDiskObjects());
        System.out.println();
    }
}
