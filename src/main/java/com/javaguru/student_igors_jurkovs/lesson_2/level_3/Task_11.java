package main.java.com.javaguru.student_igors_jurkovs.lesson_2.level_3;

import com.javaguru.teacher.codereview.CodeReview;

import java.util.Scanner;

@CodeReview(approved = true)
class Task_11 {
    public static void main(String[] args) {
        int counter = 1;
        int sumResult = 0;
        System.out.println("How many numbers you want to enter:");
        Scanner sc = new Scanner(System.in);
        int numbersQuantity = sc.nextInt();
        while(counter <= numbersQuantity) {
            System.out.println("Please enter " + counter + " number:");
            int userNumber = sc.nextInt();
            sumResult = userNumber + sumResult;
            counter = counter + 1;
        }
        double average = sumResult / (double)(counter - 1);
        System.out.println("Your numbers average is: " + average);
    }
}
