package com.javaguru.student_igors_jurkovs.lesson_10.level_1_intern;

class JavaStarLoginServiceImpl implements JavaStarLoginService{

    public boolean canLogin(String login, String password) {
        return notNull(login)
                && login.equals("javastar")
                && notNull(password)
                && password.equals("pass");
    }

    private boolean notNull(String text) {
        return text != null;
    }

}
