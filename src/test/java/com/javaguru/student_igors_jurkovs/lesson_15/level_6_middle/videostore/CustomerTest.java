package com.javaguru.student_igors_jurkovs.lesson_15.level_6_middle.videostore;

import org.junit.Test;

import static org.junit.Assert.*;

public class CustomerTest {

    private final Customer victim = new Customer("Test");
    private final Movie movie = new Movie("Test movie", Movie.REGULAR);
    private final Rental rental = new Rental(movie, 5);

    @Test
    public void addRental() {
        boolean result = victim.addRental(rental);
        assertTrue(result);
    }

    @Test
    public void statement() {
        victim.addRental(rental);
        String expected = "Rental Record for Test\n" +
                "Test movie 6.5\n" +
                "You owed 6.5\n" +
                "You earned 1 frequent renter points";
        String result = victim.statement();
        assertEquals(expected, result);
    }
}