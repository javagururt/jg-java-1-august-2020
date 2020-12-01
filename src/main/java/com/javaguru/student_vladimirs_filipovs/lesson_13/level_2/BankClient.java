package com.javaguru.student_vladimirs_filipovs.lesson_13.level_2;

import com.javaguru.teacher.codereview.CodeReview;

@CodeReview(approved = true)
class BankClient {
    private String uid;
    private String fullName;

    public BankClient(String uid, String fullName) {
        this.uid = uid;
        this.fullName = fullName;
    }

    public String getUid() {
        return uid;
    }

    public String getFullName() {
        return fullName;
    }
}
