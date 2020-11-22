package com.javaguru.student_ivan_shulga.lesson_10.level_1_intern.Task_1;

public interface JavaStarLoginService {

    boolean canLogin(String login, String password);

}

class JavaStarLoginServiceImpl implements JavaStarLoginService {

    @Override
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

/*
Дан класс:
class JavaStarLoginServiceImpl {
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
Создать интерфейс для данного класса под названием JavaStarLoginService.
Сделать так, чтобы класс JavaStarLoginServiceImpl имплементировал созданный вами интерфейс.
 */