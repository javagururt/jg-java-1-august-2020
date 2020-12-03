package com.javaguru.teacher.lesson_15.lessoncode.userapplication;

import com.javaguru.teacher.lesson_15.lessoncode.userapplication.config.UserApplicationConfig;
import com.javaguru.teacher.lesson_15.lessoncode.userapplication.ui.UserMenuExecutor;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

class UserApplication {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(UserApplicationConfig.class);
        UserMenuExecutor executor = context.getBean(UserMenuExecutor.class);
        executor.start();
    }
}
