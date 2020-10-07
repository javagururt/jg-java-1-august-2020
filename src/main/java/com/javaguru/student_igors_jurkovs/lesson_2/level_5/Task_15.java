package main.java.com.javaguru.student_igors_jurkovs.lesson_2.level_5;

import com.javaguru.teacher.codereview.CodeReview;

import java.util.Scanner;
@CodeReview(approved = true)
public class Task_15 {
    public static void main(String[] args) {
        int rightAnswer = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Let's solve some exercises!");
        System.out.print("2+2x2=");
        int userAnswer = sc.nextInt();
        if (userAnswer == 6) {
            System.out.println("Correct answer");
            rightAnswer++;
        }
        else {
            System.out.println("Incorrect answer");
        }
        System.out.print("4+28/7=");
        int userAnswer2 = sc.nextInt();
        if (userAnswer2 == 8) {
            System.out.println("Correct answer");
            rightAnswer++;
        }
        else {
            System.out.println("Incorrect answer");
        }
        Scanner scString = new Scanner(System.in);
        System.out.println("Complete the title of a tale:");
        System.out.print("Red riding ");
        String userAnswer3 = scString.nextLine();
        boolean correctAnswer = userAnswer3.contains("hood");
        if (correctAnswer) {
            System.out.println("Correct answer");
            rightAnswer++;
        }
        else {
            System.out.println("Incorrect answer");
        }
        System.out.println("You have answered right on " + rightAnswer + " out of 3 exercises!");
        if (rightAnswer == 3) {
            System.out.println("You are awesome!");
        }
        if (rightAnswer == 2) {
            System.out.println("You are good!");
        }
        if (rightAnswer <= 1) {
            System.out.println("Next time you will do better!");
        }
    }
}
