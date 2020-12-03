package com.javaguru.teacher.lesson_15.lessoncode.userapplication.ui;

import com.javaguru.teacher.lesson_15.lessoncode.userapplication.domain.User;
import com.javaguru.teacher.lesson_15.lessoncode.userapplication.service.UserService;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.List;

@Order(2)
@Component
public class FindAllUsersMenu implements UserMenu {

    private final UserService service;

    public FindAllUsersMenu(UserService service) {
        this.service = service;
    }

    @Override
    public void execute() {
        List<User> users = service.findAllUsers();

        System.out.println("Users:");
        users.forEach(System.out::println);
    }

    @Override
    public String getMenuName() {
        return "Find all users.";
    }
}
