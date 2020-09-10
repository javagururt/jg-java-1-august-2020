package com.javaguru.student_nikolajs_sersnovs.lesson_3.level_6.Task_26;

class ProductDemo {
    public static void main(String[] args){
        Product milk = new Product("Milk");
        milk.setRegularPrice(2);
        milk.setDiscount(0.10);
        milk.actualPrice();
        milk.printInformation();

    }

}
