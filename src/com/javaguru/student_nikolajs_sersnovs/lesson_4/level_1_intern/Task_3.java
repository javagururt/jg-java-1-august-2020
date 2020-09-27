package com.javaguru.student_nikolajs_sersnovs.lesson_4.level_1_intern;

import com.javaguru.teacher.codereview.CodeReview;
import com.javaguru.teacher.codereview.CodeReviewComment;
import java.time.MonthDay;
import java.util.Scanner;

/*\
Написать программу, которая запрашивает у пользователя
целое число от 1 до 7 и выводит на консоль соотметствующий
этому числу день недели.
 */
@CodeReview(approved = true)
@CodeReviewComment(teacher = "лучше использовать else в том числе. Так как программа проверит каждое условие, а это неэффективно")
class Task_3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please write day of the week (Integer): ");
        int number = scanner.nextInt();

        if (number == 1) {
            System.out.println("Monday");
        }
        else if (number == 2) {
            System.out.println("Tuesday");
        }
        else if (number == 3) {
            System.out.println("Wednesday ");
        }
        else if (number == 4) {
            System.out.println("Thursday ");
        }
        else if (number == 5) {
            System.out.println("Friday ");
        }
        else if (number == 6) {
            System.out.println("Saturday ");
        }
        else if (number == 7) {
            System.out.println("Sunday");
        }
        else {
            System.out.println("Please write correct day of the week! ");
        }
    }
}
