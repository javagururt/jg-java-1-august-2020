package com.javaguru.student_vladimirs_filipovs.lesson_13.level_5_6;

import com.javaguru.teacher.codereview.CodeReview;

@CodeReview(approved = true)
class ValidationException extends Exception {
    private String ruleName;
    private String description;
    private String fieldName;

    public ValidationException(String ruleName, String description, String fieldName) {
        this.ruleName = ruleName;
        this.description = description;
        this.fieldName = fieldName;
    }

    public String getRuleName() {
        return ruleName;
    }

    public String getDescription() {
        return description;
    }

    public String getFieldName() {
        return fieldName;
    }
}
