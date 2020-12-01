package main.java.com.javaguru.student_anastasija_meiksane.lesson_4.level_1_intern;

import com.javaguru.teacher.codereview.CodeReview;
import com.javaguru.teacher.codereview.CodeReviewComment;

import java.util.Scanner;
@CodeReview(approved = true)
@CodeReviewComment(teacher = "необходимо поменять package. На данный момент указан некорректно." +
        "В остальных классах тоже самое")
public class Task_1 {
    /*
    Написать программу, которая запрашивает у
пользователя
целое число и выводит на консоль
положительное оно или отрицательное.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in) ;

        System.out.print("Please enter  number");
        int number = scanner.nextInt();

        if (number >= 0 ) { System.out.println ( "Positive number") ;  }
        else if (number<0) {  System.out.println ( "Negative number"); }



    }
}
