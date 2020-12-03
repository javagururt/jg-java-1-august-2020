package com.javaguru.student_ivan_shulga.lesson_13.level_2_intern;

import java.util.List;
import java.util.Objects;

class UserCredentials {

    private List<Role> roles;

    public UserCredentials(List<Role> roles) {
        this.roles = roles;
    }

    public List<Role> getRoles() {
        return roles;
    }

    public boolean hasRole(Role role) {
        return roles.contains(role);
    }

}

/*
В теории и на практике у клиентов могут быть разные права
и у одного клиента может быть много разных ролей.

Для описания прав доступа, которые есть у того кто делает
запрос к банковской системе создайте класс UserCredentials:

class UserCredentials {

    private List<Role> roles;

    // созжайте конструктор класса, в котором вы получаете список ролей

}
 */