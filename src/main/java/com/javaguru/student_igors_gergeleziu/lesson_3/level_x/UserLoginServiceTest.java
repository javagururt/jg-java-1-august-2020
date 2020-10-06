package com.javaguru.student_igors_gergeleziu.lesson_3.level_x;

import javax.swing.*;

class UserLoginServiceTest {
    public static void main(String[] args) {
        UserLoginServiceTest test = new UserLoginServiceTest();
        test.shouldSuccessfullyLogin();
        test.shouldLoginFail_attempts_2();
        test.shouldLoginFail_attempts_1();
        test.shouldLoginFail_attempts_0();
        test.shouldSetAttemptsLeftTo3AfterSuccessfulLogin();

    }

    public void shouldSuccessfullyLogin() {
        UserLoginService service = new UserLoginService();
        User user = new User("John", "12345");
        boolean loginSuccessfully = service.login(user, "12345");
        checkResults(loginSuccessfully, "shouldSuccessfullyLogin");
        checkResults(!user.isBlocked(), "shouldSuccessfullyLogin");
    }

    public void shouldLoginFail_attempts_2() {
        UserLoginService service = new UserLoginService();
        User user = new User("John", "12345");
        boolean loginSuccessfully = service.login(user, "incorrect_password");
        checkResults(!loginSuccessfully, "shouldLoginFail_attempts_2");
        checkResults(user.getAttemptsCount() == 2, "shouldLoginFail_attempts_2");
        checkResults(!user.isBlocked(), "shouldLoginFail_attempts_2");
    }

    public void shouldLoginFail_attempts_1() {
        UserLoginService service = new UserLoginService();
        User user = new User("John", "12345");
        service.login(user, "incorect_password");
        boolean loginSuccessfully = service.login(user, "incorrect_password");
        checkResults(!loginSuccessfully, "shouldLoginFail_attempts_1");
        checkResults(user.getAttemptsCount() == 1, "shouldLoginFail_attempts_1");
        checkResults(!user.isBlocked(), "shouldLoginFail_attempts_1");
    }

    public void shouldLoginFail_attempts_0() {
        UserLoginService service = new UserLoginService();
        User user = new User("John", "12345");
        service.login(user, "incorect_password");
        service.login(user, "incorect_password");
        boolean loginSuccessfully = service.login(user, "incorrect_password");
        checkResults(!loginSuccessfully, "shouldLoginFail_attempts_0");
        checkResults(user.getAttemptsCount() == 0, "shouldLoginFail_attempts_0");
        checkResults(user.isBlocked(), "shouldLoginFail_attempts_0");
    }

    public void shouldSetAttemptsLeftTo3AfterSuccessfulLogin() {
        UserLoginService service = new UserLoginService();
        User user = new User("John", "12345");
        service.login(user, "incorect_password");
        service.login(user, "incorect_password");
        checkResults(user.getAttemptsCount() == 1, "shouldSetAttemptsLeftTo3AfterSuccessfulLogin");
        boolean loginSuccessfully = service.login(user, "12345");
        checkResults(loginSuccessfully, "shouldSetAttemptsLeftTo3AfterSuccessfulLogin");
        checkResults(user.getAttemptsCount() == 3, "shouldSetAttemptsLeftTo3AfterSuccessfulLogin");
        checkResults(!user.isBlocked(), "shouldSetAttemptsLeftTo3AfterSuccessfulLogin");
    }

    public void checkResults(boolean condition, String testName) {
        if (condition) System.out.println(testName + " = Success");
        else System.out.println(testName + " = Fail");
    }
}
