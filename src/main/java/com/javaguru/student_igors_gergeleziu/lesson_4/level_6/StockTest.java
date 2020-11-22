package com.javaguru.student_igors_gergeleziu.lesson_4.level_6;

class StockTest {

    public static void main(String[] args) {
        Stock google = new Stock("Google", 10);
        google.printInformation();
        google.updatePrice(15);
        google.updatePrice(7);
        google.updatePrice(14);
        google.printInformation();
        Stock apple = new Stock("Apple", 15);
        apple.printInformation();
        apple.updatePrice(20);
        apple.updatePrice(18);
        apple.updatePrice(24);
        apple.printInformation();
        Stock microsoft = new Stock("Microsoft", 12);
        microsoft.printInformation();
        microsoft.updatePrice(8);
        microsoft.updatePrice(16);
        microsoft.updatePrice(14);
        microsoft.printInformation();
    }
}
