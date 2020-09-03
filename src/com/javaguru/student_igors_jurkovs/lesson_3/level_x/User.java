package com.javaguru.student_igors_jurkovs.lesson_3.level_x;

class User {
    private final int maxLoginAttempts = 3;
    private String login;
    private String password;
    boolean blocked;
    int loginAttempts;

    User(String login, String password) {
        this.login = login;
        this.password = password;
        this.blocked = false;
        this.loginAttempts = maxLoginAttempts;
    }

    void block() {
        this.blocked = true;
    }

    void unblock() {
        this.blocked = false;
        this.loginAttempts = maxLoginAttempts;

    }

    boolean checkPassword(String password) {
        return this.password.equals(password);
    }

    void reduceLoginAttempts() {
        this.loginAttempts -= 1;
        if (loginAttempts == 0) {
            block();
        }
    }

}

class UserLoginService {


    boolean login(User user, String password) {
        if (user.blocked) {
            return true;
        }
        if (user.checkPassword(password)) {
            user.unblock();
            return true;
        } else {
            user.reduceLoginAttempts();
            return false;
        }

    }

}

class UserLoginServiceTest {
    public static void main(String[] args) {

        UserLoginService service = new UserLoginService();
        User userOne = new User("user-login", "user-password");
        System.out.println(service.login(userOne, "user-password-12345")); //Should return false
        System.out.println(service.login(userOne, "user-password")); //Should return true

    }
}
