package com.javaguru.student_nikolajs_sersnovs.leason_2.level_x;
/*
Исправьте ошибки компиляции в данной программе.

public class CorrectDataTypes {

	public static void main(String[] args) {

		int numberOne = 10;
		double numberTwo = 20.0;

		System.out.println("Number 1 = " + numberOne);
		System.out.println("Number 2 = " + numberTwo);

		float sum = numberOne + numberTwo;

		System.out.println("Sum = " + sum);
	}

}


 */
import com.javaguru.teacher.codereview.CodeReview;

@CodeReview(approved = true)
class CorrectDataTypes {

    public static void main(String[] args) {

        double numberOne = 10;
        double numberTwo = 20.0;
        double sum = numberOne + numberTwo;

        System.out.println("Number 1 = " + numberOne);
        System.out.println("Number 2 = " + numberTwo);
        System.out.println("Sum = " + sum);
    }

}
