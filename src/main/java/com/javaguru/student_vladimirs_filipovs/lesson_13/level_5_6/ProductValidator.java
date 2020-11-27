package com.javaguru.student_vladimirs_filipovs.lesson_13.level_5_6;

import java.util.List;

interface ProductValidator {
    List<ValidationException> validate(Product product);
}
