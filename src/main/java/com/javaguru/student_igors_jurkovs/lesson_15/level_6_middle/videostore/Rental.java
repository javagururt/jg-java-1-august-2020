package com.javaguru.student_igors_jurkovs.lesson_15.level_6_middle.videostore;

import java.util.Objects;

class Rental {

    private final Movie movie;
    private final int daysRented;

    public Rental(Movie movie, int daysRented) {
        this.movie = movie;
        this.daysRented = daysRented;
    }

    public Movie getMovie() {
        return movie;
    }

    public int getDaysRented() {
        return daysRented;
    }

    @Override
    public String toString() {
        return "Rental{" +
                "movie=" + movie +
                ", daysRented=" + daysRented +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rental rental = (Rental) o;
        return daysRented == rental.daysRented && Objects.equals(movie, rental.movie);
    }

    @Override
    public int hashCode() {
        return Objects.hash(movie, daysRented);
    }
}