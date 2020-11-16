package com.javaguru.student_igors_jurkovs.lesson_13.level_5_middle.validation_rules;

import com.javaguru.student_igors_jurkovs.lesson_13.level_5_middle.utils.CheckForForbiddenCharsUtil;
import com.javaguru.student_igors_jurkovs.lesson_13.level_5_middle.exceptions.ValidationException;
import com.javaguru.student_igors_jurkovs.lesson_13.level_5_middle.domain.Product;

public class ProductTitleValidationRule implements FieldValidationRule {

    @Override
    public void validate(Product product) throws ValidationException {
        String ruleName = String.valueOf(RuleList.INCORRECT_NAME);
        String productField = "Product name";
        if (product.getProductName().isBlank()) {
            throw new ValidationException(
                    ruleName,
                    String.valueOf(RuleDescription.PRODUCT_NAME_CANT_BE_BLANK),
                    productField);
        }
        if (product.getProductName().length() <= 3) {
            throw new ValidationException(
                    ruleName,
                    String.valueOf(RuleDescription.PRODUCT_NAME_CANT_BE_LESS_THAN_3_SYMBOLS),
                    productField);
        }
        if (product.getProductName().length() >= 100) {
            throw new ValidationException(
                    ruleName,
                    String.valueOf(RuleDescription.PRODUCT_NAME_CANT_BE_MORE_THAN_100_SYMBOLS),
                    productField);
        }
        if (CheckForForbiddenCharsUtil.check(product.getProductName())) {
            throw new ValidationException(
                    ruleName,
                    String.valueOf(RuleDescription.PRODUCT_NAME_CAN_CONTAIN_ONLY_EN_CHARS_AND_NUMBERS),
                    productField);
        }
    }
}
