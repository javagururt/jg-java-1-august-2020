package com.javaguru.student_igors_jurkovs.lesson_10.level_3_junior.task_8;

public interface Database {

    void save(Product product);

    Product findByTitle(String productTitle);

}
