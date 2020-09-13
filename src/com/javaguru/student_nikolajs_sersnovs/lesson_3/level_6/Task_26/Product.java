package com.javaguru.student_nikolajs_sersnovs.lesson_3.level_6.Task_26;

import com.javaguru.teacher.codereview.CodeReview;
import com.javaguru.teacher.codereview.CodeReviewComment;

/*
Разработать класс - продукт,
у которого должны быть следующие характеристики:

Свойства:
- Наименование (String name)
- Стандартная цена (double regularPrice)
- Скидка в процентах (double discount)

Методы:
1. Расчет актуальной стоимости с учетом скидки (double actualPrice())
Вывод информации о продукте в консоль (void printInformation())1P
2. Название продукта нужно задавать через конструктор, а стоимость и скидку через оператор ".".
 */
@CodeReview(approved = true)
class Product {

    private String name;
    private double regularPrice;
    private double discount;
    @CodeReviewComment(teacher = "нет необходимости в данном поле")
    private double actualPrice;


    public Product (String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setRegularPrice(double regularPrice) {
        this.regularPrice = regularPrice;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public void actualPrice (){
        actualPrice = regularPrice - (regularPrice * discount);
    }

    public void printInformation() {
        System.out.println("Product name: " + name);
        System.out.println("Product price: " + regularPrice);
        System.out.println("Discount percent : " + discount);
        System.out.println("Total price with discount: " + actualPrice);


    }


}



