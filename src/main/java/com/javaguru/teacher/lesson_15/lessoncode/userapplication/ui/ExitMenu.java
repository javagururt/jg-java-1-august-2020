package com.javaguru.teacher.lesson_15.lessoncode.userapplication.ui;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Order
@Component
public class ExitMenu implements UserMenu {
    @Override
    public void execute() {
        System.out.println("Bye-bye!");
        System.exit(0);
    }

    @Override
    public String getMenuName() {
        return "Exit.";
    }
}
