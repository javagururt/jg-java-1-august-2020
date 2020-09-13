package com.javaguru.student_ivan_shulga.lesson_4.level_1_intern;

// хотел немного поэкспеременитровать с Task_1, в итоге сделал и Task_2 тут же, уберать лишнее не стал

import com.javaguru.teacher.codereview.CodeReview;

import java.util.Scanner;
@CodeReview(approved = true)
class Task_1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter number (integer):");

        if (scanner.hasNextInt()) {     // hasNextInt() — метод проверяет, является ли следующая порция введенных данных числом, или нет (возвращает, соответственно, true или false)

            int number = scanner.nextInt();

                if (number > 0) {
                    System.out.println("Your number is POSITIVE!");
                } else if (number == 0) {
                    System.out.println("Your enter \"0\"!");
                } else {
                    System.out.println("Your number is NEGATIVE!");
                }

        } else {
            System.out.println("Извините, но это не число. Перезапустите программу и попробуйте снова!");       // выводится, если в консоль введено не число
        }

    }

}
