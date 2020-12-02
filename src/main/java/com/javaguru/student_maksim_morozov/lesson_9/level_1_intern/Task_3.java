package com.javaguru.student_maksim_morozov.lesson_9.level_1_intern;


class Task_3 {

    private String fullName;
    private int age;
    private String address;

    @Override
    public String toString() {
        return "Task_3(" +
                "fullName='" + fullName + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                ')';
    }
}
class Task_3_Demo{
    public static void main(String[]args){
        Task_3 testTask_3 = new Task_3();
        System.out.println(testTask_3);
    }

    }