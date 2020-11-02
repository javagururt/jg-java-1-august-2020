package com.javaguru.student_vladimir_petranovski.lesson_10.level_1.task_1;

import com.javaguru.teacher.codereview.CodeReview;
import com.javaguru.teacher.codereview.CodeReviewComment;

@CodeReview(approved = true)
@CodeReviewComment(teacher = "public в сигнатуре метода - лишнее")
public interface JavaStarLoginService {
    public boolean canLogin(String login, String password);
}
