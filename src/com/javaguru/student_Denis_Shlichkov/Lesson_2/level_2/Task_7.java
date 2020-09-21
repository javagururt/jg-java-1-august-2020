package com.javaguru.student_Denis_Shlichkov.Lesson_2.level_2;

import com.javaguru.teacher.codereview.CodeReview;
import com.javaguru.teacher.codereview.CodeReviewComment;

@CodeReview(approved = false)
@CodeReviewComment(teacher = "результат не выводится на консоль при запуске программы.")
public class Task_7 {
    public static void main(String[] args) {

        new LoginService();


    }

}
class LoginService {

    public void main(String[] args) {
        System.out.println("You can login!");
    }


}

