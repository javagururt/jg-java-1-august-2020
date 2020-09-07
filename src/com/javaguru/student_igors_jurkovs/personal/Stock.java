package com.javaguru.student_igors_jurkovs.personal;

import com.javaguru.teacher.codereview.CodeReview;
import com.javaguru.teacher.codereview.CodeReviewComment;

@CodeReview(approved = true)
class Stock {

    // Свойства (Property) fields
    @CodeReviewComment(teacher = "Нет необходимости явно говорить, что это property")
    private final String companyName;
    private double currentPrice;
    private double minimalPrice;
    private double maximalPrice;

    // Конструктор (Constructor)
    Stock(String companyName, double currentPrice) {

        this.companyName = companyName;
        this.currentPrice = currentPrice;
        minimalPrice = currentPrice;
        maximalPrice = currentPrice;

    }

    // Method
    void updatePrice(double newPrice) {

        currentPrice = newPrice;

        if (newPrice < minimalPrice) {
            minimalPrice = newPrice;
        }
        if (newPrice > maximalPrice) {
            maximalPrice = newPrice;
        }
    }

    // Method
    void printInformation() {
        System.out.println(companyName + ", Current Price = " + currentPrice + ", Min Price = " + minimalPrice + ", Max Price " + maximalPrice);
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
