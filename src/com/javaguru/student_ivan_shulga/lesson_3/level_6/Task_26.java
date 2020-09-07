package com.javaguru.student_ivan_shulga.lesson_3.level_6;

class Product {

    String name;            // наименование
    double regularPrice;    // стандартная цена
    double discount;        // скидка в процентах
    // ^^^ объявляем переменные

    public Product(String name) { this.name = name; }
    // ^^^ Присвоение наименования продукта переменной name

    public double actualPrice() { return regularPrice - (regularPrice / 100 * discount); }
    // ^^^ Метод расчёта цены со скидкой

    public void printInformation() {
        System.out.println("Product: " + name);
        System.out.println("Regular price: " + regularPrice);
        System.out.println("Discount: " + discount + "%");
        System.out.println("Price with discount: " + actualPrice());
        // ^^^ Вывод информации
    }

}

class ProductDemo {

    public static void main(String[] args) {

        Product product = new Product("Milk");
        // ^^^ Создание нового товара с помощью конструктора и присвоение ему имени

        product.regularPrice = 100;
        product.discount = 25;
        // ^^^ Задаём стоимость и скидку через оператор

        product.actualPrice();
        // ^^^ Вызов метода расчёта цены со скидкой для новосозданного товара

        product.printInformation();
        // ^^^ Вызов метода вывода информации на экран для новара

    }

}
