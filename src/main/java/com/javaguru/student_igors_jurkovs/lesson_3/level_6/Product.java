package com.javaguru.student_igors_jurkovs.lesson_3.level_6;

import com.javaguru.teacher.codereview.CodeReview;
import com.javaguru.teacher.codereview.CodeReviewComment;

/*
Task_26
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

Класс с объявлением продукта должен называться "Product".
Класс с демонстрацией работы должен называться "ProductDemo".
 */
@CodeReview(approved = true)
@CodeReviewComment(teacher = "Нет необходимости в поле finalPrice, в данном случае будет достаточно метода actualPrice()")
class Product {
    String name;
    double regularPrice;
    double discount;
    double finalPrice;

    Product (String name) {
        this.name = name;
    }

    void printInformation () {
        System.out.println("Product name: " + name);
        System.out.println("Product regular price: " + regularPrice);
        System.out.println("Product discount: "+ discount);
        System.out.println("Product finalPrice: "+ finalPrice);
    }
    void setRegularPrice (double regularPrice) {
        this.regularPrice = regularPrice;
    }
    void setDiscount (double discount) {
        this.discount = discount;
    }
    void finalPrice () {
        this.finalPrice = regularPrice * (1 - discount);
    }
}

class ProductDemo {

    public static void main(String[] args) {

        Product bread = new Product("bread");

        bread.setRegularPrice(0.89);
        bread.setDiscount(0.15);
        bread.finalPrice();
        bread.printInformation();

        bread.setRegularPrice(1.15);
        bread.setDiscount(0.10);
        bread.finalPrice();
        bread.printInformation();

    }
}
