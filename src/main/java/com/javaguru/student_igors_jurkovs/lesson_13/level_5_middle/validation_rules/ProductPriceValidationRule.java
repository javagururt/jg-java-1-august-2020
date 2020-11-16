package com.javaguru.student_igors_jurkovs.lesson_13.level_5_middle.validation_rules;

import com.javaguru.student_igors_jurkovs.lesson_13.level_5_middle.exceptions.ValidationException;
import com.javaguru.student_igors_jurkovs.lesson_13.level_5_middle.domain.Product;

public class ProductPriceValidationRule implements FieldValidationRule {

    @Override
    public void validate(Product product) throws ValidationException {
        String ruleName = String.valueOf(RuleList.INCORRECT_PRICE);
        String productField = "Product price";
        if (product.getPrice() == null) {
            throw new ValidationException(
                    ruleName,
                    String.valueOf(RuleDescription.PRICE_CANT_BE_EMPTY),
                    productField);
        }
        if (product.getPrice() == 0) {
            throw new ValidationException(
                    ruleName,
                    String.valueOf(RuleDescription.PRICE_CANT_BE_0),
                    productField);
        }
        if (!product.getPrice().toString().matches("[0-9]+")) {
            throw new ValidationException(
                    ruleName,
                    String.valueOf(RuleDescription.PRICE_CAN_CONTAIN_ONLY_NUMBERS),
                    productField);
        }
    }
}
