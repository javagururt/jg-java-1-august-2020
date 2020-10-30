package com.javaguru.student_vladimirs_filipovs.lesson_10.level_3.Task_8;

public interface Database {

    void save(Product product);

    Product findByTitle(String productTitle);

}
