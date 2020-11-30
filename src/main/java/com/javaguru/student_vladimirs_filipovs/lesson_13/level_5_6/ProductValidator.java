package com.javaguru.student_vladimirs_filipovs.lesson_13.level_5_6;

import com.javaguru.teacher.codereview.CodeReview;

import java.util.List;
@CodeReview(approved = true)
interface ProductValidator {
    List<ValidationException> validate(Product product);
}
