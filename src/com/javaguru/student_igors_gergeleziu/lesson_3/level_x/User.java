package com.javaguru.student_igors_gergeleziu.lesson_3.level_x;

class User {
    private final static int MAX_ATTEMPTS_COUNT = 3;

    private String login;
    private String password;
    private boolean blocked;
    private int enterAttempts;

    public User(String login, String password) {
        this.login = login;
        this.password = password;
        this.blocked = false;
        this.enterAttempts = MAX_ATTEMPTS_COUNT;
    }

    public boolean isBlocked() {
        return blocked;
    }

    public void blockUser() {
        this.blocked = true;
    }

    public void unblockUser() {
        this.blocked = false;
        this.enterAttempts = MAX_ATTEMPTS_COUNT;
    }

    public int getAttemptsCount() {
        return this.enterAttempts;
    }

    public boolean isPasswordEquals(String password) {
        return this.password.equals(password);
    }

    public void reduceEnterAttempts() {
        this.enterAttempts--;
        if (enterAttempts <= 0) {
            blockUser();
        }
    }
}
