package com.javaguru.student_igors_jurkovs.lesson_15.level_6_middle.videostore;

import java.util.ArrayList;

class Customer {

    private final String name;
    private final ArrayList<Rental> rentals = new ArrayList<>();

    public Customer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean addRental(Rental rental) {
        return rentals.add(rental);
    }

    public String statement() {
        double totalAmount = 0;
        int frequentRenterPoints = 0;
        StringBuilder result = new StringBuilder("Rental Record for " + getName() + "\n");

        for (Rental rent : rentals) {
            double thisAmount = 0;

            if (moviePriceCodeIsRegular(rent)) {
                thisAmount += regularMoviePrice(rent);
            } else if (moviePriceCodeIsNewRelease(rent)) {
                thisAmount += rent.getDaysRented() * 3;
            } else if (moviePriceCodeIsChildren(rent)) {
                thisAmount += (rent.getDaysRented() - 3) * 1.5;
            }

            frequentRenterPoints++;

            if (moviePriceCodeIsNewRelease(rent) && rent.getDaysRented() > 1)
                frequentRenterPoints++;

            result.append(rent.getMovie().getTitle()).append(" ").append(thisAmount).append("\n");
            totalAmount += thisAmount;

        }

        result.append("You owed ").append(totalAmount).append("\n");
        result.append("You earned ").append(frequentRenterPoints).append(" frequent renter points");


        return result.toString();
    }

    private boolean moviePriceCodeIsRegular(Rental rental) {
        return rental.getMovie().getPriceCode().equals(Movie.REGULAR);
    }

    private boolean moviePriceCodeIsNewRelease(Rental rental) {
        return rental.getMovie().getPriceCode().equals(Movie.NEW_RELEASE);
    }

    private boolean moviePriceCodeIsChildren(Rental rental) {
        return rental.getMovie().getPriceCode().equals(Movie.CHILDREN);
    }

    private double regularMoviePrice(Rental rental) {
        double totalAmount = 2;
        if (rental.getDaysRented() > 2) {
            totalAmount += (rental.getDaysRented() - 2) * 1.5;
        }
        return totalAmount;
    }

}