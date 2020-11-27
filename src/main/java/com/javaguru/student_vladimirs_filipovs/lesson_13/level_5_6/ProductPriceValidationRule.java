package com.javaguru.student_vladimirs_filipovs.lesson_13.level_5_6;

class ProductPriceValidationRule implements FieldValidationRule {
//            - RULE-5: не должна быть пустой
//            - RULE-6: должна быть больше 0

    @Override
    public void validate(Product product) throws ValidationException {
        notEmpty(product);
        notZERO(product);
    }

    private void notEmpty(Product product) throws ValidationException {
        if (product.getPrice() == null) {
            throw new ValidationException("RULE-5", "Price should not be empty", "Price");
        }
    }

    private void notZERO(Product product) throws ValidationException {
        if (product.getPrice() <= 0) {
            throw new ValidationException("RULE-6", "Price should not equals 0 or less", "Price");
        }
    }
}
