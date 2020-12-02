package com.javaguru.student_maksim_morozov.lesson_9.level_2_intern;

class Task_7 {
    private String name;
    public Task_7(String name) {
        this.name = name;
    }
    class Woman extends Task_7 {
        public Woman(String name) {
            super(name);
        }
    }
    class Man extends  Task_7 {
        public  Man(String name){
            super(name);
        }
    }
}
