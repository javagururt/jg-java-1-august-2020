package com.javaguru.student_ivan_shulga.lesson_10.level_3_junior.Task_8;

import java.util.ArrayList;

class Task_8 implements Database {

    ArrayList<Product> newProductList = new ArrayList<>();

    @Override
    public void save(Product product) {
        newProductList.add(product);
    }

    @Override
    public Product findByTitle(String productTitle) {
        for (Product someProduct : newProductList) {
            if (someProduct.getTitle().equals(productTitle)) {
                return someProduct;
            }
        }
        return null;
    }

}

interface Database {

    void save(Product product);

    Product findByTitle(String productTitle);

}


class Product {

    private String title;

    public Product(String title) {
        this.title = title;
    }

    public String getTitle() {
        return this.title;
    }

    @Override
    public String toString() {
        return "Product9{" +
                "title='" + title + '\'' +
                '}';
    }
}

class TestingTask {

    public static void main(String[] args) {

        Task_8 test1 = new Task_8();
        Product firstProduct = new Product("product1");
        Product secondProduct = new Product("product2");
        Product thirdProduct = new Product("product3");

        test1.save(firstProduct);
        test1.save(secondProduct);
        test1.save(thirdProduct);

        System.out.println(test1.findByTitle("product1"));
        System.out.println(test1.findByTitle("notAProduct"));

    }

}

/*
Создайте реализацию следующего интерфейса.
Класс должен называться InMemoryDatabase и сохранять продукты в памяти
используя для этого массив или список.

Если продукт не найден при поске то вернуть null.

Обязательно протестируйте созданную вами реализацию интерфейса Database9.

interface Database9 {

    void save(Product9 product);

    Product9 findByTitle(String productTitle);

}


class Product9 {

    private String title;

    public Product9(String title) {
        this.title = title;
    }

    public String getTitle() {
        return this.title;
    }

}
 */