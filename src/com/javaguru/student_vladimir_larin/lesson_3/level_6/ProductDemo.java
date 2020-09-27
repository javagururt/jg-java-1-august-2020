package com.javaguru.student_vladimir_larin.lesson_3.level_6;

import com.javaguru.teacher.codereview.CodeReview;

@CodeReview(approved = true)
class ProductDemo {
    public static void main(String[] args) {
        Product soap = new Product("soap");
        soap.setRegularPrice(68);
        soap.setDiscount(15);
        soap.printInformation();
    }
}

