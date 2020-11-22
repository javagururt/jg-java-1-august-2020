package com.javaguru.student_vladimirs_filipovs.lesson_10.level_3.Task_10;

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
        return "Product{" +
                "title='" + title + '\'' +
                '}';
    }
}
