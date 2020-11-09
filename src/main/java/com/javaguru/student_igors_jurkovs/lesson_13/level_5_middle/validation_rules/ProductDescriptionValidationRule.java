package com.javaguru.student_igors_jurkovs.lesson_13.level_5_middle.validation_rules;

import com.javaguru.student_igors_jurkovs.lesson_13.level_5_middle.utils.CheckForForbiddenCharsUtil;
import com.javaguru.student_igors_jurkovs.lesson_13.level_5_middle.exceptions.ValidationException;
import com.javaguru.student_igors_jurkovs.lesson_13.level_5_middle.domain.Product;

public class ProductDescriptionValidationRule implements FieldValidationRule {

    @Override
    public void validate(Product product) throws ValidationException {
        String ruleName = String.valueOf(RuleList.INCORRECT_DESCRIPTION);
        String productField = "Product description";
        if (product.getDescription().length() >= 2000) {
            throw new ValidationException(
                    ruleName,
                    String.valueOf(RuleDescription.DESCRIPTION_CANT_BE_LONGER_THAN_2000_SYMBOLS),
                    productField);
        }
        if (CheckForForbiddenCharsUtil.check(product.getDescription())) {
            throw new ValidationException(
                    ruleName,
                    String.valueOf(RuleDescription.DESCRIPTION_CAN_CONTAIN_ONLY_EN_CHARS_AND_NUMBERS),
                    productField);
        }
    }
}
