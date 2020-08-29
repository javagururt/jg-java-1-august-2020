package com.javaguru.student_igors_jurkovs.personal;

import com.javaguru.teacher.codereview.CodeReview;
import com.javaguru.teacher.codereview.CodeReviewComment;

@CodeReview(approved = true)
class Stock {

    // Свойства (Property) fields
    @CodeReviewComment(teacher = "Нет необходимости явно говорить, что это property")
    private final String propertyCompanyName;
    private double propertyCurrentPrice;
    private double propertyMinimalPrice;
    private double propertyMaximalPrice;

    // Конструктор (Constructor)
    public Stock(String companyName, double currentPrice) {

        propertyCompanyName = companyName;
        propertyCurrentPrice = currentPrice;
        propertyMinimalPrice = currentPrice;
        propertyMaximalPrice = currentPrice;

    }

    // Method
    public void updatePrice(double newPrice) {

        propertyCurrentPrice = newPrice;

        if (newPrice < propertyMinimalPrice) {
            propertyMinimalPrice = newPrice;
        }
        if (newPrice > propertyMaximalPrice) {
            propertyMaximalPrice = newPrice;
        }
    }

    // Method
    public void printInformation() {
        System.out.println(propertyCompanyName + ", Current Price = " + propertyCurrentPrice + ", Min Price = " + propertyMinimalPrice + ", Max Price " + propertyMaximalPrice);
    }
}


class StockTest {

    public static void main(String[] args) {

        Stock google = new Stock("GOOG", 10);
        google.printInformation();

        google.updatePrice(15);
        google.updatePrice(7);
        google.updatePrice(14);

        google.printInformation();
    }
}
