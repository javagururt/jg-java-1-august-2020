package com.javaguru.student_vladimirs_filipovs.lesson_13.level_5_6;

class ProductTitleValidationRule implements FieldValidationRule {
//            - RULE-1: не должно быть пустым
//            - RULE-2: не должно быть короче 3 символов
//            - RULE-3: не должно быть длиннее 100 символов
//            - RULE-4: должно содержать только английские буквы и цифры, другие символы не допустимы

    @Override
    public void validate(Product product) throws ValidationException {
        notEmpty(product);
        less3Symbols(product);
        more100Symbols(product);
        onlyEnglish(product);
    }

    private void notEmpty(Product product) throws ValidationException {
        if (product.getName() == null || product.getName().isBlank()) {
            throw new ValidationException("RULE-1", "Title should not be empty", "Title");
        }
    }

    private void less3Symbols(Product product) throws ValidationException {
        if (product.getName().length() < 3) {
            throw new ValidationException("RULE-2", "Title length should not be less then 3 symbols", "Title");
        }
    }

    private void more100Symbols(Product product) throws ValidationException {
        if (product.getName().length() > 100) {
            throw new ValidationException("RULE-3", "Title length should not be mor then 100 symbols", "Title");
        }
    }

    private void onlyEnglish(Product product) throws ValidationException {
        if (!product.getName().matches("^[a-zA-Z]*$")) {
            throw new ValidationException("RULE-4", "Title must be on English language", "Title");
        }
    }
}
