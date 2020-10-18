package com.javaguru.student_ivan_shulga.lesson_4.level_1_intern;

import com.javaguru.teacher.codereview.CodeReview;

import java.util.Scanner;

// сделано два варианта для практики
// с switch и с if
// if закомментирован ниже

@CodeReview(approved = true)
class Task_3 {

    public static void main(String[] args) {

        System.out.println("Please enter number (integer) from 1 to 7:");

        Scanner scanner = new Scanner(System.in);

        if (scanner.hasNextInt()) {     // проверка что введено именно число

            int number = scanner.nextInt();

                switch (number) {
                    case 1:
                        System.out.println("Monday");
                        break;
                    case 2:
                        System.out.println("Tuesday");
                        break;
                    case 3:
                        System.out.println("Wednesday");
                        break;
                    case 4:
                        System.out.println("Thursday");
                        break;
                    case 5:
                        System.out.println("Friday");
                        break;
                    case 6:
                        System.out.println("Saturday");
                        break;
                    case 7:
                        System.out.println("Sunday");
                        break;

                    default:        // если введено неподходящее число
                        System.out.println("You have entered a number less than 1 or more than 7, please restart the program and enter a number from 1 to 7!");

                }

            }   else {      // если введено не число
                    System.out.println("You have not entered a number, please restart the program and enter a number from 1 to 7!");

        }
    }

}

/*
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter number (integer) from 1 to 7:");

        if (scanner.hasNextInt()) {     // hasNextInt() — метод проверяет, является ли следующая порция введенных данных числом, или нет (возвращает, соответственно, true или false)

            int number = scanner.nextInt();

                if (number == 1) {
                    System.out.println("Monday");
                    } else if (number == 2) {
                        System.out.println("Tuesday");
                        } else if (number == 3) {
                            System.out.println("Wednesday");
                            } else if (number == 4) {
                                System.out.println("Thursday");
                                } else if (number == 5) {
                                    System.out.println("Friday");
                                    } else if (number == 6) {
                                        System.out.println("Saturday");
                                        } else if (number == 7) {
                                            System.out.println("Sunday");
                                            } else if (number < 1 || number > 7) {
                                                System.out.println("You have entered a number less than 1 or more than 7, please restart the program and enter a number from 1 to 7!");
                                                }

        } else {
            System.out.println("You have not entered a number, please restart the program and enter a number from 1 to 7!");      // выводится, если в консоль введено не число
        }

    }

}
*/
