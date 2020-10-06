package com.javaguru.student_vladimir_larin.lesson_3.level_6;

import com.javaguru.teacher.codereview.CodeReview;

@CodeReview(approved = true)
class Product {
    private String name;
    public double regularPrice;
    public double discount;

    Product(String name) {
        this.name = name;
    }

    public double actualPrice() {
        return regularPrice - (regularPrice * discount / 100);
    }

    public void setRegularPrice(double regularPrice) {
        this.regularPrice = regularPrice;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public void printInformation() {
        System.out.println("Product name: " + name);
        System.out.println("Regular price: " + regularPrice);
        System.out.println("Discount %: " + discount);
        System.out.println("Actual price: " + actualPrice());
    }
}
