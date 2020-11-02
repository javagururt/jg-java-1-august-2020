package com.javaguru.student_ivan_shulga.lesson_10.level_3_junior.Task_9;

/*
Optional - это класс оболочка, которая внутри себя содержит некоторое значение которое может быть NULL и если
это значение является NULL'ом, может предпринять какие-то действия, например бросить исключение или подставить значение по-умолчанию.
 */
// на основе предыдущего задания попытки воспользоваться Optional где-то, задание Task_10
// https://habr.com/ru/post/346782/

import com.javaguru.teacher.codereview.CodeReview;
import com.javaguru.teacher.codereview.CodeReviewComment;

import java.util.ArrayList;
import java.util.Optional;
@CodeReview(approved = false)
@CodeReviewComment(teacher = "по идее любой find* метод может возвращать Optional")
class Task_9 implements Database9 {

    ArrayList<Product9> newProductList = new ArrayList<>();

    @Override
    public void save(Product9 product) {
        newProductList.add(product);
    }

    @Override
    public Optional<Product9> findByTitle(String productTitle) {
        return Optional.ofNullable(findProductByTitle(productTitle));
    }

    Product9 findProductByTitle(String productTitle) {
        for (Product9 someProduct: newProductList) {
            if (someProduct.getTitle().contains(productTitle)) {
                return someProduct;
            }
        }
        return null;
    }

}

interface Database9 {

    void save(Product9 product);

    Optional<Product9> findByTitle(String productTitle);

}


class Product9 {

    private String title;

    public Product9(String title) {
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

class TestingTask9 {

    public static void main(String[] args) {

        Task_9 test1 = new Task_9();
        Product9 firstProduct = new Product9("product1");
        Product9 secondProduct = new Product9("product2");
        Product9 thirdProduct = new Product9("product3");

        test1.save(firstProduct);
        test1.save(secondProduct);
        test1.save(thirdProduct);

        System.out.println(test1.findByTitle("product1"));
        System.out.println(test1.findByTitle("notAProduct"));

    }

}

/*
Найдите в интернете информацию про класс java.util.Optional.
Для чего применяются объекты этого класса?
Какие два состояния могут быть у объектов этого класса?
Как создаются экземпляры данного класса?
Как можно проверить в каком состоянии находится экземпляр данного класса?
Как можно получить объект, который находится внутри Optional?
 */