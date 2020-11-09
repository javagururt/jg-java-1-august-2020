package com.javaguru.student_igors_jurkovs.lesson_13.level_5_middle.validation_rules;

import com.javaguru.student_igors_jurkovs.lesson_13.level_5_middle.exceptions.ValidationException;
import com.javaguru.student_igors_jurkovs.lesson_13.level_5_middle.domain.Product;

public interface FieldValidationRule {

    void validate(Product product) throws ValidationException;

}
