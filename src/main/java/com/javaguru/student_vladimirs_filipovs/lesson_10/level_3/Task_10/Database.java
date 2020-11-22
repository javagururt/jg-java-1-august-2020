package com.javaguru.student_vladimirs_filipovs.lesson_10.level_3.Task_10;

import java.util.Optional;

public interface Database {

    void save(Product product);

    Optional<Product> findByTitle(String productTitle);

}
