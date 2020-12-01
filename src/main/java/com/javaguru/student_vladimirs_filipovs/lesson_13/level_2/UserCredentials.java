package com.javaguru.student_vladimirs_filipovs.lesson_13.level_2;

import com.javaguru.teacher.codereview.CodeReview;

import java.util.List;
@CodeReview(approved = true)
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
