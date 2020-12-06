package com.javaguru.student_ivan_shulga.lesson_14.level_3_4_junior_and_5_6_middle;

import org.junit.Test;

import java.util.*;

import static org.junit.Assert.*;

public class TransactionAnalysisServiceTest {

    TransactionAnalysisService victim = new TransactionAnalysisService();
    TransactionTestData testData = new TransactionTestData();
    List<Transaction> fullTestDataList = testData.getTransactions();

    Trader raoul = new Trader("Raoul", "Cambridge");
    Trader mario = new Trader("Mario","Milan");
    Trader alan = new Trader("Alan","Cambridge");
    Trader brian = new Trader("Brian","Cambridge");

    List<Transaction> emptyTestDataList = new ArrayList<>();

    @Test
    public void shouldGetAll2011YearTransactions() {
        List<Transaction> expected = new ArrayList<>();
        expected.add(new Transaction(brian, 2011, 300));
        expected.add(new Transaction(raoul, 2011, 400));

        List<Transaction> actual = victim.findTransactionsByYear(fullTestDataList, 2011);

        assertEquals(expected, actual);
    }

    @Test
    public void shouldGetAll2012YearTransactions() {
        List<Transaction> expected = new ArrayList<>();
        expected.add(new Transaction(raoul, 2012, 1000));
        expected.add(new Transaction(mario, 2012, 710));
        expected.add(new Transaction(mario, 2012, 700));
        expected.add(new Transaction(alan, 2012, 950));

        List<Transaction> actual = victim.findTransactionsByYear(fullTestDataList, 2012);

        assertEquals(expected, actual);
    }

    @Test
    public void shouldSortingValuesFromSmallestToLargest() {
        List<Transaction> expected = new ArrayList<>();
        expected.add(new Transaction(brian, 2011, 300));
        expected.add(new Transaction(raoul, 2011, 400));
        expected.add(new Transaction(mario, 2012, 700));
        expected.add(new Transaction(mario, 2012, 710));
        expected.add(new Transaction(alan, 2012, 950));
        expected.add(new Transaction(raoul, 2012, 1000));

        List<Transaction> actual = victim.sortingValuesFromSmallestToLargest(fullTestDataList);

        assertEquals(expected, actual);
    }

    @Test
    public void shouldSortingValuesFromLargestToSmallest() {
        List<Transaction> expected = new ArrayList<>();
        expected.add(new Transaction(raoul, 2012, 1000));
        expected.add(new Transaction(alan, 2012, 950));
        expected.add(new Transaction(mario, 2012, 710));
        expected.add(new Transaction(mario, 2012, 700));
        expected.add(new Transaction(raoul, 2011, 400));
        expected.add(new Transaction(brian, 2011, 300));

        List<Transaction> actual = victim.sortingValuesFromLargestToSmallest(fullTestDataList);

        assertEquals(expected, actual);
    }

    @Test
    public void shouldFindTransactionsByYear2011AndSortingToLargest() {
        List<Transaction> expected = new ArrayList<>();
        expected.add(new Transaction(brian, 2011, 300));
        expected.add(new Transaction(raoul, 2011, 400));

        List<Transaction> actual = victim.findTransactionsByYearAndSortingToLargest(fullTestDataList, 2011);

        assertEquals(expected, actual);
    }

    @Test
    public void shouldFindYearsWithTransactions() {
        List<Integer> expected = Arrays.asList(2011, 2012, 2011, 2012, 2012, 2012);

        List<Integer> actual = victim.findYearsWithTransactions(fullTestDataList);

        assertEquals(expected, actual);
    }

    @Test
    public void shouldFindUniqueYearsWithTransactions() {
        List<Integer> expected = Arrays.asList(2011, 2012);

        List<Integer> actual = victim.findUniqueYearsWithTransactions(fullTestDataList);

        assertEquals(expected, actual);
    }

    @Test
    public void shouldFindUniqueTraderNames() {
        List<Trader> expected = new ArrayList<>();
        expected.add(new Trader("Brian","Cambridge"));
        expected.add(new Trader("Raoul", "Cambridge"));
        expected.add(new Trader("Mario","Milan"));
        expected.add(new Trader("Alan","Cambridge"));

        List<Trader> actual = victim.findUniqueTraderNames(fullTestDataList);

        assertEquals(expected, actual);
    }

    @Test
    public void shouldFindUniqueTraderCities() {
        List<String> expected = Arrays.asList("Cambridge", "Milan");

        List<String> actual = victim.findUniqueTraderCities(fullTestDataList);

        assertEquals(expected, actual);
    }

    @Test
    public void shouldFindTradersFromSelectedCities() {
        List<Trader> expected = new ArrayList<>();
        expected.add(new Trader("Mario","Milan"));

        List<Trader> actual = victim.findTradersFromSelectedCities(fullTestDataList, "Milan");

        assertEquals(expected, actual);
    }

    @Test
    public void shouldCheckIfTradersWorkInTheCityTrue() {
        boolean actual = victim.checkIfTradersWorkInTheCity(fullTestDataList, "Milan");
        assertTrue(actual);
    }

    @Test
    public void shouldCheckIfTradersWorkInTheCityFalse() {
        boolean actual = victim.checkIfTradersWorkInTheCity(fullTestDataList, "SomeCity");
        assertFalse(actual);
    }

    @Test
    public void shouldFindMinValue300() {
        Optional<Integer> expected = Optional.of(300);
        Optional<Integer> actual = victim.findMinValue(fullTestDataList);

        assertEquals(expected, actual);
    }

    @Test
    public void shouldFindMinValueEmptyList() {
        Optional<Integer> expected = Optional.empty();
        Optional<Integer> actual = victim.findMinValue(emptyTestDataList);
        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnTraderInAlphabeticalOrderSeparatedByCommas() {
        String expected = "Alan, Brian, Mario, Raoul";
        String actual = victim.returnTraderInAlphabeticalOrderSeparatedByCommas(fullTestDataList);
        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnCitiesInAlphabeticalOrderSeparatedByCommas() {
        String expected = "Cambridge, Milan";
        String actual = victim.returnCitiesInAlphabeticalOrderSeparatedByCommas(fullTestDataList);
        assertEquals(expected, actual);
    }

}

/*
public class TransactionTestData {

    public List<Transaction> getTransactions() {
        Trader raoul = new Trader("Raoul", "Cambridge");
        Trader mario = new Trader("Mario","Milan");
        Trader alan = new Trader("Alan","Cambridge");
        Trader brian = new Trader("Brian","Cambridge");

        List<Transaction> transactions = Arrays.asList(
                new Transaction(brian, 2011, 300),
                new Transaction(raoul, 2012, 1000),
                new Transaction(raoul, 2011, 400),
                new Transaction(mario, 2012, 710),
                new Transaction(mario, 2012, 700),
                new Transaction(alan, 2012, 950)
        );

        return transactions;
    }

}
 */