package com.javaguru.student_nikolajs_sersnovs.lesson_3.homework.level_x.solutions.super_task_1;

import com.javaguru.teacher.lesson_3.homework.level_x.solutions.super_task_1.User;

public class UserLoginService {

	public boolean login(User user, String password){
		if (user.isBlocked()) {
			return false;
		}
		if (user.isPasswordEquals(password)) {
			user.unblock();
			return true;
		} else {
			user.reduceLoginAttempts();
			return false;
		}
	}

}