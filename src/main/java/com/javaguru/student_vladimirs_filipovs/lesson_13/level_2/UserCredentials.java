package com.javaguru.student_vladimirs_filipovs.lesson_13.level_2;

import java.util.List;

class UserCredentials {
    private List<Role> roles;

    public List<Role> getRoles() {
        return roles;
    }

    public UserCredentials(List<Role> roles) {
        this.roles = roles;
    }

    public boolean isContains (Role role){
        return roles.contains(role);
    }
}
