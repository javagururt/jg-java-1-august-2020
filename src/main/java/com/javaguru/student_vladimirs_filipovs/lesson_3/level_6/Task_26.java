package com.javaguru.student_vladimirs_filipovs.lesson_3.level_6;

import com.javaguru.teacher.codereview.CodeReview;

@CodeReview(approved = true)
class Product {
    String name;
    double regularPrice;
    double discount;
    double priceAfterDiscount;

    public void setName(String name) {
        this.name = name;
    }

    public void setRegularPrice(double regularPrice) {
        this.regularPrice = regularPrice;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public void actualPrice() {
        priceAfterDiscount = regularPrice - (regularPrice * discount);
    }

    public void printInformation() {
        System.out.println("Product name is " + name);
        System.out.println("Regular price is " + regularPrice + " EUR");
        System.out.println("Discount is " + discount * 100 + " %");
        System.out.println("Product value is " + priceAfterDiscount + " EUR");
    }
}

class ProductDemo {
    public static void main(String[] args) {
        Product product1 = new Product();
        product1.setName("Banana");
        product1.setRegularPrice(25);
        product1.setDiscount(0.12);
        product1.actualPrice();
        product1.printInformation();
    }
}