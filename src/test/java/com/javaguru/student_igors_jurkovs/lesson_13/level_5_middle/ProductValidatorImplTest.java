package com.javaguru.student_igors_jurkovs.lesson_13.level_5_middle;

import com.javaguru.student_igors_jurkovs.lesson_13.level_5_middle.domain.Product;
import com.javaguru.student_igors_jurkovs.lesson_13.level_5_middle.exceptions.ValidationException;
import com.javaguru.student_igors_jurkovs.lesson_13.level_5_middle.validation_rules.ProductDescriptionValidationRule;
import com.javaguru.student_igors_jurkovs.lesson_13.level_5_middle.validation_rules.ProductPriceValidationRule;
import com.javaguru.student_igors_jurkovs.lesson_13.level_5_middle.validation_rules.ProductTitleValidationRule;
import com.javaguru.student_igors_jurkovs.lesson_13.level_5_middle.validator.ProductValidatorImpl;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class ProductValidatorImplTest {

    private final String over2000CharDescription = "ghkldfkjagkjdfhklbvdfskjbkjdfsmklbmsdmfmkgsdmfkbmklgfsmklbmklgfsmlbmkls" +
            "kjbgfsbmgfklsbmklgfsmklbgfsbmfklsgbmkfsbmkgfsmkbmksmfkbsfmgdfgdfgdfgfdgdfgdfgdfgdfgdfgdfgdfkbmkskbmklsfb" +
            "bgbmkfsgbgfsbsmgkfbgfsbgsfbmkgfsbgfsbmkgfsbmksfgbmkgfsbmkdfgdfgdfgdfgdfgfdgdfgfdgfmksfbsmkbmkgfsmkbfsbmk" +
            "bgfmklbmklsfbmkmgfklsbmklgfsmklbmksgfbmksgfbmkmksgddddddddddddddddfbmklmklsbmklsmkbmksfmklbmksmkbmksmkls" +
            "mklbgsmklbmgfksbmksmfklbmklgfsmklbmklsbmdddddddddkmklgfsbfsgbmsmklgbmksmfkbmklsbmfklsbmksmfkbmklsmkbmksl" +
            "mnklbgfsmklbgsmklbmklsmklbsmfklbmklsmklbddddddmfklsbmklsbgfsbgfsbgfbmklgfbmklmgfklbmklgfsbsmgklbmklgfsmk" +
            "fsbmksmfkgbmksgfmklbgfsbmklfsbmklgfsmkbgdddddfsbmklsmfklbmklgfsklmfklsgbmklsmklbmklsfbmklsmfklbmklsfmklb" +
            "dfsssssssssssssssssssssssddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddd" +
            "dddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddd" +
            "dddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddd" +
            "dddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddd" +
            "dddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddd" +
            "dddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddd" +
            "dddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddd" +
            "fsbmksmfkgbmksgfmklbgfsbmklfsbmklgfsmkbgdddddfsbmklsmfklbmklgfsklmfklsgbmklsmklbmklsfbmklsmfklbmklsfmklb" +
            "dfsssssssssssssssssssssssddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddd" +
            "dddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddd" +
            "dddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddd" +
            "dddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddd" +
            "dddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddd" +
            "dddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddd" +
            "dddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddd";

    private final String over100CharName = "ggnjgfsbnjnjgsnbjgnjsbnjgfslkbnjgfklsbgngfskjbngfsbkljgnfsbkljfsbngfkljsb" +
            "bbnjsgfbnjsbnjklsfgbngflskbngfkljsbnsfklbjnsfkljbnsfklbnsgfblknsfbklsnbslfkgbnsfklbfgdfggdfgnsfgbfkjslbfs";

    private final Product productNameTest1 = new Product("",23, "");
    private final Product productNameTest2 = new Product(over100CharName,20, "");
    private final Product productNameTest3 = new Product("T",20, "");
    private final Product productNameTest4 = new Product("āāāā",20, "");

    private final Product productPriceTest1 = new Product("Test", null, "");
    private final Product productPriceTest2 = new Product("Test", 0, "");

    private final Product productDescriptionTest1 = new Product("Test", 20, over2000CharDescription);
    private final Product productDescriptionTest2 = new Product("Test", 20, "āāāā");

    private final Product productWithThreeFieldsExceptions = new Product("One", 0, "āā");

    private final ProductTitleValidationRule productTitleValidationRule = new ProductTitleValidationRule();
    private final ProductPriceValidationRule productPriceValidationRule  = new ProductPriceValidationRule();
    private final ProductDescriptionValidationRule productDescriptionValidationRule = new ProductDescriptionValidationRule();
    private final ProductValidatorImpl victim = new ProductValidatorImpl(
            productTitleValidationRule,
            productPriceValidationRule,
            productDescriptionValidationRule);

    @Test
    public void blankName() {
        String expected = "[ValidationException{ruleName='INCORRECT_NAME', " +
                "description='PRODUCT_NAME_CANT_BE_BLANK', " +
                "fieldName='Product name'}]";
        List<ValidationException> exceptionList = victim.validate(productNameTest1);
        String result = exceptionList.toString();
        assertEquals(expected, result);
    }

    @Test
    public void over10CharName() {
        String expected = "[ValidationException{ruleName='INCORRECT_NAME', " +
                "description='PRODUCT_NAME_CANT_BE_MORE_THAN_100_SYMBOLS', " +
                "fieldName='Product name'}]";
        List<ValidationException> exceptionList = victim.validate(productNameTest2);
        String result = exceptionList.toString();
        assertEquals(expected, result);
    }

    @Test
    public void lessThan3CharName() {
        String expected = "[ValidationException{ruleName='INCORRECT_NAME', " +
                "description='PRODUCT_NAME_CANT_BE_LESS_THAN_3_SYMBOLS', " +
                "fieldName='Product name'}]";
        List<ValidationException> exceptionList = victim.validate(productNameTest3);
        String result = exceptionList.toString();
        assertEquals(expected, result);
    }

    @Test
    public void onlyEnSymbolsAndNumbersInName() {
        String expected = "[ValidationException{ruleName='INCORRECT_NAME', " +
                "description='PRODUCT_NAME_CAN_CONTAIN_ONLY_EN_CHARS_AND_NUMBERS', " +
                "fieldName='Product name'}]";
        List<ValidationException> exceptionList = victim.validate(productNameTest4);
        String result = exceptionList.toString();
        assertEquals(expected, result);
    }

    @Test
    public void priceIsNull() {
        String expected = "[ValidationException{ruleName='INCORRECT_PRICE', " +
                "description='PRICE_CANT_BE_EMPTY', " +
                "fieldName='Product price'}]";
        List<ValidationException> exceptionList = victim.validate(productPriceTest1);
        String result = exceptionList.toString();
        assertEquals(expected, result);
    }

    @Test
    public void priceIsZero() {
        String expected = "[ValidationException{ruleName='INCORRECT_PRICE', " +
                "description='PRICE_CANT_BE_0', " +
                "fieldName='Product price'}]";
        List<ValidationException> exceptionList = victim.validate(productPriceTest2);
        String result = exceptionList.toString();
        assertEquals(expected, result);
    }

    @Test
    public void descriptionOver2000Chars() {
        String expected = "[ValidationException{ruleName='INCORRECT_DESCRIPTION', " +
                "description='DESCRIPTION_CANT_BE_LONGER_THAN_2000_SYMBOLS', " +
                "fieldName='Product description'}]";
        List<ValidationException> exceptionList = victim.validate(productDescriptionTest1);
        String result = exceptionList.toString();
        assertEquals(expected, result);
    }

    @Test
    public void onlyEnSymbolsAndNumbersInDescription() {
        String expected = "[ValidationException{ruleName='INCORRECT_DESCRIPTION', " +
                "description='DESCRIPTION_CAN_CONTAIN_ONLY_EN_CHARS_AND_NUMBERS', " +
                "fieldName='Product description'}]";
        List<ValidationException> exceptionList = victim.validate(productDescriptionTest2);
        String result = exceptionList.toString();
        assertEquals(expected, result);
    }

    @Test
    public void severalExceptionsAtOnce() {
        String expected = "[ValidationException{ruleName='INCORRECT_NAME', " +
                "description='PRODUCT_NAME_CANT_BE_LESS_THAN_3_SYMBOLS', " +
                "fieldName='Product name'}, " +
                "ValidationException{ruleName='INCORRECT_PRICE', " +
                "description='PRICE_CANT_BE_0', " +
                "fieldName='Product price'}, " +
                "ValidationException{ruleName='INCORRECT_DESCRIPTION', " +
                "description='DESCRIPTION_CAN_CONTAIN_ONLY_EN_CHARS_AND_NUMBERS', " +
                "fieldName='Product description'}]";
        List<ValidationException> exceptionList = victim.validate(productWithThreeFieldsExceptions);
        String result = exceptionList.toString();
        assertEquals(expected, result);
    }
}