package com.javaguru.student_igors_jurkovs.lesson_10.level_3_junior.task_8;

import com.javaguru.teacher.codereview.CodeReview;

import java.util.ArrayList;
import java.util.List;
@CodeReview(approved = true)
class InMemoryDatabase implements Database {

    private final List<Product> database = new ArrayList<>();

    public List<Product> getDatabase() {
        return database;
    }

    @Override
    public void save(Product product) {
        database.add(product);
    }

    @Override
    public Product findByTitle(String productTitle) {
        for (Product product: database) {
            if (product.getTitle().contains(productTitle)) {
                return product;
            }
        }
        return null;
    }
}
