package com.javaguru.student_igors_gergeleziu.lesson_3.level_6.task_26;

import com.javaguru.teacher.codereview.CodeReview;

@CodeReview(approved = true)
 class Product {
    private String name;
    private double regularPrice;
    private double discount;

    public Product(String name){
    this.name=name;
    }

    public void setRegularPrice(double regularPrice) {
        this.regularPrice = regularPrice;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public double actualPrice(){
    return regularPrice-(regularPrice*discount/100);
    }
    public void printInformation(){
        System.out.println("Product \""+name+"\"");
        System.out.println("Regular price: "+regularPrice+"$");
        System.out.println("Discount: "+discount+"%");
        System.out.println("Actual price: "+actualPrice()+"$");
    }
}
