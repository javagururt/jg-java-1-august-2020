package com.javaguru.student_igors_jurkovs.lesson_13.level_5_middle.validator;

import com.javaguru.student_igors_jurkovs.lesson_13.level_5_middle.domain.Product;
import com.javaguru.student_igors_jurkovs.lesson_13.level_5_middle.exceptions.ValidationException;

import java.util.List;

public interface ProductValidator {

    List<ValidationException> validate(Product product);

}
