package com.javaguru.student_igors_gergeleziu.lesson_3.level_x;


class UserLoginService {

    public boolean login(User user, String password) {
        if (user.isBlocked()) {
            return false;
        }
        if (user.isPasswordEquals(password)) {
            user.unblockUser();
            return true;
        } else {
            user.reduceEnterAttempts();
            return false;
        }
    }
}
