package com.javaguru.teacher.lesson_15.lessoncode.userapplication.ui;


import com.javaguru.teacher.lesson_15.lessoncode.userapplication.domain.User;
import com.javaguru.teacher.lesson_15.lessoncode.userapplication.service.UserService;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.Scanner;

@Order(3)
@Component
public class FindUserByIdMenu implements UserMenu {

    private final UserService userService;

    public FindUserByIdMenu(UserService userService) {
        this.userService = userService;
    }

    @Override
    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter user id:");
        String id = scanner.nextLine();

        User user = userService.findById(id);
        System.out.println("Result: " + user);
    }

    @Override
    public String getMenuName() {
        return "Find user by id.";
    }
}
