package com.javaguru.student_ivan_shulga.lesson_4.level_6_middle;

// при случае самому ещё раз рассмотреть код с нуля

    class Stock {

        String companyName;
        int currentValue;
        int minimumCost;
        int maximumCost;


        Stock (String companyName, int currentValue) {
        this.companyName = companyName;
        this.currentValue = currentValue;
        minimumCost = currentValue;
        maximumCost = currentValue;
    }

    void updatePrice(int currentValue) {
        this.currentValue = currentValue;

        if (currentValue < minimumCost) {
            minimumCost = currentValue;
            } else if (currentValue > maximumCost) {
                maximumCost = currentValue;
        }


    }

    String getPriceInformation() {
        return "Company = " + companyName + ", Current Price = " + currentValue + ", Min Price = " + minimumCost + ", Max Price = " + maximumCost;
}


    public static void main(String[] args) {

        Stock google = new Stock("Google", 10);
        String priceInformation = google.getPriceInformation();
        System.out.println(priceInformation);

        google.updatePrice(15);
        google.updatePrice(7);
        google.updatePrice(14);

        priceInformation = google.getPriceInformation();
        System.out.println(priceInformation);

        google.updatePrice(10);
        google.updatePrice(12);
        google.updatePrice(5);
        google.updatePrice(7);
        google.updatePrice(99);
        google.updatePrice(17);

        priceInformation = google.getPriceInformation();
        System.out.println(priceInformation);
    }

}
