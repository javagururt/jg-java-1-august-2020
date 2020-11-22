package com.javaguru.student_vladimirs_filipovs.lesson_3.level_x;

import com.javaguru.teacher.codereview.CodeReview;
import com.javaguru.teacher.codereview.CodeReviewComment;

import java.util.Scanner;

@CodeReview(approved = true)
@CodeReviewComment(teacher = "можно упростить некоторые условия в решениях. " +
        "К примеру 'false' это точно лишнее.")
class UserLoginService {
    private String login;
    private String password;
    boolean isUserBlocked;
    int loginNumberOfTries = 0;

    public UserLoginService(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public int resetLoginNumberOfTries() {
        return loginNumberOfTries = 0;
    }

    public boolean checkLoginAndPassword(String userName, String userPassword) {
        if (login.equals(userName) && password.equals(userPassword)) {
            resetLoginNumberOfTries();
            return true;
        } else {
            return false;
        }
    }

    public boolean signIn(boolean checkLoginAndPassword) {
        loginNumberOfTries++;
        if (loginNumberOfTries < 4 && checkLoginAndPassword == true) {
            return true;
        } else if (loginNumberOfTries == 3 && checkLoginAndPassword == false) {
            isUserBlocked = true;
            return false;
        } else {
            return false;
        }
    }

    /*
        public boolean signIn(String userName, String userPassword) {
            loginNumberOfTries++;
            if (loginNumberOfTries < 4) {
                if (login.equals(userName) && password.equals(userPassword)) {
                    resetLoginNumberOfTries();
                    return true;
                } else {
                    return false;
                }
            } else {
                return false;
            }
        }
    */
    public void signInSystem() {
        Scanner scan = new Scanner(System.in);
        while (false || loginNumberOfTries < 3) {
            System.out.println("Please enter user name:");
            String userName = scan.next();
            System.out.println("Please enter password:");
            String userPassword = scan.next();
            boolean checkLoginAndPasswordResult = checkLoginAndPassword(userName, userPassword);
            boolean signInResult = signIn(checkLoginAndPasswordResult);
            if (signInResult == true) {
                System.out.println("You are welcome!");
                break;
            } else if (signInResult == false && loginNumberOfTries < 3) {
                System.out.println("Login or password is incorrect, please try one more time. You have " + (3 - loginNumberOfTries) + " attempts");
            } else {
                System.out.println("You are blocked!");
            }
        }
    }
}

class UserLoginDemo {
    public static void main(String[] args) {
        UserLoginService userLoginService = new UserLoginService("vova", "welcome");
        userLoginService.signInSystem();
    }
}