package com.javaguru.student_igors_gergeleziu.lesson_3.level_6.task_26;

 class ProductDemo {
    public static void main(String[] args) {
        Product milk= new Product("Milk");
        milk.setRegularPrice(0.95);
        milk.setDiscount(15);
        milk.printInformation();
        Product cheese= new Product("Cheese");
        cheese.setRegularPrice(1.20);
        cheese.setDiscount(20);
        cheese.printInformation();
    }
}
