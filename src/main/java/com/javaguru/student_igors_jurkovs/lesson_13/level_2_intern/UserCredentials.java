package com.javaguru.student_igors_jurkovs.lesson_13.level_2_intern;

import java.util.List;

class UserCredentials {

    private final List<Role> roles;

    public UserCredentials(List<Role> roles) {
        this.roles = roles;
    }

    public List<Role> getRoles() {
        return roles;
    }

    boolean hasRole(Role role) {
        return roles.contains(role);
    }
}
