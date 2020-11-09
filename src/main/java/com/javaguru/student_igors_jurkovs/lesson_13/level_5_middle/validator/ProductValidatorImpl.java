package com.javaguru.student_igors_jurkovs.lesson_13.level_5_middle.validator;

import com.javaguru.student_igors_jurkovs.lesson_13.level_5_middle.domain.Product;
import com.javaguru.student_igors_jurkovs.lesson_13.level_5_middle.exceptions.ValidationException;
import com.javaguru.student_igors_jurkovs.lesson_13.level_5_middle.validation_rules.FieldValidationRule;
import com.javaguru.student_igors_jurkovs.lesson_13.level_5_middle.validation_rules.ProductDescriptionValidationRule;
import com.javaguru.student_igors_jurkovs.lesson_13.level_5_middle.validation_rules.ProductPriceValidationRule;
import com.javaguru.student_igors_jurkovs.lesson_13.level_5_middle.validation_rules.ProductTitleValidationRule;

import java.util.ArrayList;
import java.util.List;

public class ProductValidatorImpl implements ProductValidator {

    private final List<FieldValidationRule> validationRules = new ArrayList<>();

    public ProductValidatorImpl(ProductTitleValidationRule titleValidationRule,
                                ProductPriceValidationRule priceValidationRule,
                                ProductDescriptionValidationRule descriptionValidationRule) {
        validationRules.add(titleValidationRule);
        validationRules.add(priceValidationRule);
        validationRules.add(descriptionValidationRule);
    }

    @Override
    public List<ValidationException> validate(Product product) {
        List<ValidationException> validationExceptionsList = new ArrayList<>();
        for (FieldValidationRule fieldValidationRule : validationRules) {
            try {
                fieldValidationRule.validate(product);
            } catch (ValidationException e) {
                validationExceptionsList.add(e);
            }
        }

        return validationExceptionsList;
    }

}
