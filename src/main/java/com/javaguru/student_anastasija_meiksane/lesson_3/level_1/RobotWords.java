package com.javaguru.student_anastasija_meiksane.lesson_3.level_1;

import com.javaguru.teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class RobotWords {


    public void sayHello() { System.out.println("Hello!"); }
    public void sayName() { System.out.println("My name is " + this.name + "!" ) ;

    }
    private String name;
 public RobotWords(String robotName) {this.name=robotName;}


}


