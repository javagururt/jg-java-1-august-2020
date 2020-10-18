package com.javaguru.student_igors_jurkovs.lesson_7.level_7_senior.file_system.exceptions;

import com.javaguru.teacher.codereview.CodeReviewComment;

@CodeReviewComment(teacher = "наследование от checked exception лучше использовать только в случае системных ошибок")
public class NoSuchNameException extends RuntimeException{

    public NoSuchNameException() {
    }
}
