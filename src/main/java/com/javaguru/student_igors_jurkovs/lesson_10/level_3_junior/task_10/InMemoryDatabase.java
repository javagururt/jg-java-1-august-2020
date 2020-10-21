package com.javaguru.student_igors_jurkovs.lesson_10.level_3_junior.task_10;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

class InMemoryDatabase implements DatabaseV2 {

    private final List<Product> database = new ArrayList<>();

    public List<Product> getDatabase() {
        return database;
    }

    @Override
    public void save(Product product) {
        database.add(product);
    }

    @Override
    public Optional<Product> findByTitle(String productTitle) {
        return Optional.ofNullable(findProductByTitle(productTitle));
    }

    private Product findProductByTitle(String productTitle) {
        for (Product product: database) {
            if (product.getTitle().contains(productTitle)) {
                return product;
            }
        }
        return null;
    }
}
