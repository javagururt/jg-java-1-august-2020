package com.javaguru.student_vladimirs_filipovs.lesson_13.level_5_6;

class ProductDescriptionValidationRule implements FieldValidationRule {
//            - RULE-7: не должно быть длиннее 2000 символов
//            - RULE-8: должно содержать только английские буквы и цифры, другие символы не допустимы

    @Override
    public void validate(Product product) throws ValidationException {
        more2000Symbols(product);
        onlyEnglish(product);
    }

    public void more2000Symbols(Product product) throws ValidationException {
        if (product.getDescription().length() > 2000) {
            throw new ValidationException("RULE-7", "Description must be less 2001 symbols", "Description");
        }
    }

    public void onlyEnglish(Product product) throws ValidationException {
        if (!product.getDescription().matches("^[a-zA-Z]*$")) {
            throw new ValidationException("RULE-8", "Description must be only on English language", "Description");
        }
    }
}
