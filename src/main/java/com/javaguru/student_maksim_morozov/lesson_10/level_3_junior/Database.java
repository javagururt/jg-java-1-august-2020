package com.javaguru.student_maksim_morozov.lesson_10.level_3_junior;

interface Database {
    void save(Product product);
    Product findNyTitle(String productTitle);
}
