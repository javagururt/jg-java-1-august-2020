package com.javaguru.student_igors_jurkovs.lesson_15.level_6_middle.videostore;

import java.util.Objects;

class Movie {

    public static final String REGULAR = "REGULAR";
    public static final String NEW_RELEASE = "NEW_RELEASE";
    public static final String CHILDREN = "CHILDREN";

    private final String title;
    private final String priceCode;

    public Movie(String title, String priceCode) {
        this.title = title;
        this.priceCode = priceCode;
    }

    public String getTitle() {
        return title;
    }

    public String getPriceCode() {
        return priceCode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Movie movie = (Movie) o;
        return Objects.equals(title, movie.title) && Objects.equals(priceCode, movie.priceCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, priceCode);
    }

    @Override
    public String toString() {
        return "Movie{" +
                "title='" + title + '\'' +
                ", priceCode='" + priceCode + '\'' +
                '}';
    }
}