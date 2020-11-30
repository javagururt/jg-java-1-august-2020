package com.javaguru.student_vladimirs_filipovs.lesson_13.level_5_6;

import com.javaguru.teacher.codereview.CodeReview;

@CodeReview(approved = true)
interface FieldValidationRule {
    void validate(Product product) throws ValidationException;
}
