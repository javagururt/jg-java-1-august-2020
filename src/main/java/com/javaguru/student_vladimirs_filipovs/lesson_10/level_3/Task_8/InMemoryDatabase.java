package com.javaguru.student_vladimirs_filipovs.lesson_10.level_3.Task_8;

import java.util.ArrayList;
import java.util.List;

class InMemoryDatabase implements Database {

    final List<Product> productsList = new ArrayList<>();

    @Override
    public void save(Product product) {
        productsList.add(product);
    }

    @Override
    public Product findByTitle(String productTitle) {
        for (Product product : productsList) {
            if (product.getTitle().equals(productTitle)) {
                return product;
            }
        }
        return null;
    }
}

class ProductDemo {
    public static void main(String[] args) {
        InMemoryDatabase inMemory = new InMemoryDatabase();
        Product newProduct1 = new Product("Banana");
        Product newProduct2 = new Product("Orange");
        Product newProduct3 = new Product("Milk");
        Product newProduct4 = new Product("Vodka");
        inMemory.save(newProduct1);
        inMemory.save(newProduct2);
        inMemory.save(newProduct3);
        inMemory.save(newProduct4);

        System.out.println(inMemory.findByTitle("Orange"));
        System.out.println(inMemory.findByTitle("esfgdsfs"));

    }
}