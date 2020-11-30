package com.javaguru.student_vladimirs_filipovs.lesson_13.level_5_6;

import com.javaguru.teacher.codereview.CodeReview;

import java.util.ArrayList;
import java.util.List;
@CodeReview(approved = true)
class ProductValidatorImpl implements ProductValidator {
    private ProductTitleValidationRule titleValidationRule;
    private ProductPriceValidationRule priceValidationRule;
    private ProductDescriptionValidationRule descriptionValidationRule;

    public ProductValidatorImpl(ProductTitleValidationRule titleValidationRule,
                                ProductPriceValidationRule priceValidationRule,
                                ProductDescriptionValidationRule descriptionValidationRule) {
        this.titleValidationRule = titleValidationRule;
        this.priceValidationRule = priceValidationRule;
        this.descriptionValidationRule = descriptionValidationRule;
    }

    @Override
    public List<ValidationException> validate(Product product) {
        List<ValidationException> exceptions = new ArrayList<>();
        try {
            titleValidationRule.validate(product);
        } catch (ValidationException ex1) {
            exceptions.add(ex1);
        }
        try {
            priceValidationRule.validate(product);
        } catch (ValidationException ex2) {
            exceptions.add(ex2);
        }
        try {
            descriptionValidationRule.validate(product);
        } catch (ValidationException ex3) {
            exceptions.add(ex3);
        }
        return exceptions;
    }
}

//    К названию продукта выдвигаются следующие требования:
//        - RULE-1: не должно быть пустым
//        - RULE-2: не должно быть короче 3 символов
//        - RULE-3: не должно быть длиннее 100 символов
//        - RULE-4: должно содержать только английские буквы и цифры, другие символы не допустимы
//
//        К цене продукта выдвигаются следующие требования:
//        - RULE-5: не должна быть пустой
//        - RULE-6: должна быть больше 0
//
//        К описанию продукта выдвигаются следующие требования:
//        - RULE-7: не должно быть длиннее 2000 символов
//        - RULE-8: должно содержать только английские буквы и цифры, другие символы не допустимы

class ProductValidatorImplTest {
    ProductTitleValidationRule titleValidationRule = new ProductTitleValidationRule();
    ProductPriceValidationRule priceValidationRule = new ProductPriceValidationRule();
    ProductDescriptionValidationRule descriptionValidationRule = new ProductDescriptionValidationRule();
    ProductValidatorImpl validator = new ProductValidatorImpl(titleValidationRule,
            priceValidationRule,
            descriptionValidationRule);
    public String bigText101 = "qqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqq";
    public String bigText2001 = "qqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqq";

    public static void main(String[] args) {
        ProductValidatorImplTest test = new ProductValidatorImplTest();
        test.rule1_v1();
        test.rule1_v2();
        test.rule1_v3();
        test.rule2_v1();
        test.rule2_v2();
        test.rule3_v1();
        test.rule4_v1();
        test.rule4_v2();
        test.rule5_v1();
        test.rule6_v1();
        test.rule7_v1();
        test.rule8_v1();
        test.rule8_v2();
    }

    public void rule1_v1() {
        Product product = new Product(null, 1, "description");
        List<ValidationException> exceptions = validator.validate(product);
        chekResult(exceptions.size() == 1, "rule1");
        chekResult(exceptions.get(0).getRuleName().equals("RULE-1"), "rule-1-1");
        chekResult(exceptions.get(0).getFieldName().equals("Title"), "rule-1-1");
        chekResult(exceptions.get(0).getDescription().equals("Title should not be empty"), "rule-1-1");
    }

    public void rule1_v2() {
        Product product = new Product("", 1, "description");
        List<ValidationException> exceptions = validator.validate(product);
        chekResult(exceptions.size() == 1, "rule1");
        chekResult(exceptions.get(0).getRuleName().equals("RULE-1"), "rule-1-2");
        chekResult(exceptions.get(0).getFieldName().equals("Title"), "rule-1-2");
        chekResult(exceptions.get(0).getDescription().equals("Title should not be empty"), "rule-1-2");
    }

    public void rule1_v3() {
        Product product = new Product(" ", 1, "description");
        List<ValidationException> exceptions = validator.validate(product);
        chekResult(exceptions.size() == 1, "rule1");
        chekResult(exceptions.get(0).getRuleName().equals("RULE-1"), "rule-1-3");
        chekResult(exceptions.get(0).getFieldName().equals("Title"), "rule-1-3");
        chekResult(exceptions.get(0).getDescription().equals("Title should not be empty"), "rule-1-3");
    }

    public void rule2_v1() {
        Product product = new Product("q", 1, "description");
        List<ValidationException> exceptions = validator.validate(product);
        chekResult(exceptions.size() == 1, "rule2");
        chekResult(exceptions.get(0).getRuleName().equals("RULE-2"), "rule-2-1");
        chekResult(exceptions.get(0).getFieldName().equals("Title"), "rule-2-1");
        chekResult(exceptions.get(0).getDescription().equals("Title length should not be less then 3 symbols"), "rule-2-1");
    }

    public void rule2_v2() {
        Product product = new Product("qq", 1, "description");
        List<ValidationException> exceptions = validator.validate(product);
        chekResult(exceptions.size() == 1, "rule2");
        chekResult(exceptions.get(0).getRuleName().equals("RULE-2"), "rule-2-2");
        chekResult(exceptions.get(0).getFieldName().equals("Title"), "rule-2-2");
        chekResult(exceptions.get(0).getDescription().equals("Title length should not be less then 3 symbols"), "rule-2-2");
    }

    public void rule3_v1() {
        Product product = new Product(bigText101, 1, "description");
        List<ValidationException> exceptions = validator.validate(product);
        chekResult(exceptions.size() == 1, "rule3");
        chekResult(exceptions.get(0).getRuleName().equals("RULE-3"), "rule-3-1");
        chekResult(exceptions.get(0).getFieldName().equals("Title"), "rule-3-1");
        chekResult(exceptions.get(0).getDescription().equals("Title length should not be mor then 100 symbols"), "rule-3-1");
    }

    public void rule4_v1() {
        Product product = new Product("お金 お金", 1, "description");
        List<ValidationException> exceptions = validator.validate(product);
        chekResult(exceptions.size() == 1, "rule4");
        chekResult(exceptions.get(0).getRuleName().equals("RULE-4"), "rule-4-1");
        chekResult(exceptions.get(0).getFieldName().equals("Title"), "rule-4-1");
        chekResult(exceptions.get(0).getDescription().equals("Title must be on English language"), "rule-4-1");
    }

    public void rule4_v2() {
        Product product = new Product("лололо", 1, "description");
        List<ValidationException> exceptions = validator.validate(product);
        chekResult(exceptions.size() == 1, "rule4");
        chekResult(exceptions.get(0).getRuleName().equals("RULE-4"), "rule-4-2");
        chekResult(exceptions.get(0).getFieldName().equals("Title"), "rule-4-2");
        chekResult(exceptions.get(0).getDescription().equals("Title must be on English language"), "rule-4-2");
    }

    public void rule5_v1() {
        Product product = new Product("money", null, "description");
        List<ValidationException> exceptions = validator.validate(product);
        chekResult(exceptions.size() == 1, "rule5");
        chekResult(exceptions.get(0).getRuleName().equals("RULE-5"), "rule-5-1");
        chekResult(exceptions.get(0).getFieldName().equals("Price"), "rule-5-1");
        chekResult(exceptions.get(0).getDescription().equals("Price should not be empty"), "rule-5-1");
    }

    public void rule6_v1() {
        Product product = new Product("money", 0, "description");
        List<ValidationException> exceptions = validator.validate(product);
        chekResult(exceptions.size() == 1, "rule6");
        chekResult(exceptions.get(0).getRuleName().equals("RULE-6"), "rule-6-1");
        chekResult(exceptions.get(0).getFieldName().equals("Price"), "rule-6-1");
        chekResult(exceptions.get(0).getDescription().equals("Price should not equals 0 or less"), "rule-6-1");
    }

    public void rule6_v2() {
        Product product = new Product("money", -5, "description");
        List<ValidationException> exceptions = validator.validate(product);
        chekResult(exceptions.size() == 1, "rule6");
        chekResult(exceptions.get(0).getRuleName().equals("RULE-6"), "rule-6-2");
        chekResult(exceptions.get(0).getFieldName().equals("Price"), "rule-6-2");
        chekResult(exceptions.get(0).getDescription().equals("Price should not equals 0 or less"), "rule-6-2");
    }

    public void rule7_v1() {
        Product product = new Product("money", 1, bigText2001);
        List<ValidationException> exceptions = validator.validate(product);
        chekResult(exceptions.size() == 1, "rule7");
        chekResult(exceptions.get(0).getRuleName().equals("RULE-7"), "rule-7-1");
        chekResult(exceptions.get(0).getFieldName().equals("Description"), "rule-7-1");
        chekResult(exceptions.get(0).getDescription().equals("Description must be less 2001 symbols"), "rule-7-1");
    }

    public void rule8_v1() {
        Product product = new Product("money", 1, "お金 お金");
        List<ValidationException> exceptions = validator.validate(product);
        chekResult(exceptions.size() == 1, "rule8");
        chekResult(exceptions.get(0).getRuleName().equals("RULE-8"), "rule-8-1");
        chekResult(exceptions.get(0).getFieldName().equals("Description"), "rule-8-1");
        chekResult(exceptions.get(0).getDescription().equals("Description must be only on English language"), "rule-8-1");
    }

    public void rule8_v2() {
        Product product = new Product("money", 1, "лололо");
        List<ValidationException> exceptions = validator.validate(product);
        chekResult(exceptions.size() == 1, "rule8");
        chekResult(exceptions.get(0).getRuleName().equals("RULE-8"), "rule-8-2");
        chekResult(exceptions.get(0).getFieldName().equals("Description"), "rule-8-2");
        chekResult(exceptions.get(0).getDescription().equals("Description must be only on English language"), "rule-8-2");
    }

    private void chekResult(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " Ok");
        } else {
            System.out.println(testName + " FAIL");
        }
    }

}

