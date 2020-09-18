package com.javaguru.student_nikolajs_sersnovs.lesson_5.level_7_senior.super_task_1;

import com.javaguru.teacher.lesson_5.homework.level_7_senior.super_task_1.ArrayUtil;

public class Task28 {

	public static void main(String[] args) {
		ArrayUtil arrayUtil = new ArrayUtil();
		int[] array = arrayUtil.newArrayWithRandomLength();
		arrayUtil.fillArrayWithRandomNumbers(array);
		arrayUtil.printArray(array);
		int minNumber = arrayUtil.findMinInArray(array);
		System.out.println("Min number = " + minNumber);
	}

}
