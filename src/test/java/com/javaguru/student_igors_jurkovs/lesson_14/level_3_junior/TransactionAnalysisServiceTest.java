package com.javaguru.student_igors_jurkovs.lesson_14.level_3_junior;

import com.javaguru.student_igors_jurkovs.lesson_14.level_3_junior.domain.Trader;
import com.javaguru.student_igors_jurkovs.lesson_14.level_3_junior.domain.Transaction;
import org.junit.Test;

import java.util.*;

import static org.junit.Assert.*;

public class TransactionAnalysisServiceTest {

    private final TransactionAnalysisService victim = new TransactionAnalysisService();
    private final TransactionTestData transactionTestData = new TransactionTestData();
    private final String cambridgeCity = "Cambridge";
    private final Trader raoul = new Trader("Raoul", cambridgeCity);
    private final Trader mario = new Trader("Mario","Milan");
    private final Trader alan = new Trader("Alan", cambridgeCity);
    private final Trader brian = new Trader("Brian", cambridgeCity);
    private final List<Transaction> emptyList = new ArrayList<>();

    @Test
    public void findTransactionsByYear() {
        List<Transaction> expected = Arrays.asList(
                new Transaction(brian, 2011, 300),
                new Transaction(raoul, 2011, 400)
        );
        List<Transaction> result = victim.findTransactionsByYear(transactionTestData.getTransactions(), 2011);
        assertEquals(expected, result);
    }

    @Test
    public void sortTransactionsByValue() {
        List<Transaction> expected = Arrays.asList(
                new Transaction(brian, 2011, 300),
                new Transaction(raoul, 2011, 400),
                new Transaction(mario, 2012, 700),
                new Transaction(mario, 2012, 710),
                new Transaction(alan, 2012, 950),
                new Transaction(raoul, 2012, 1000)
        );
        List<Transaction> result = victim.sortTransactionsByValue(transactionTestData.getTransactions());
        assertEquals(expected, result);
    }

    @Test
    public void sortTransactionsByValueReverseOrder() {
        List<Transaction> expected = Arrays.asList(
                new Transaction(raoul, 2012, 1000),
                new Transaction(alan, 2012, 950),
                new Transaction(mario, 2012, 710),
                new Transaction(mario, 2012, 700),
                new Transaction(raoul, 2011, 400),
                new Transaction(brian, 2011, 300)
        );
        List<Transaction> result = victim.sortTransactionsByValueReverseOrder(transactionTestData.getTransactions());
        assertEquals(expected, result);
    }

    @Test
    public void findTransactionsByYearAndSortByValue() {
        List<Transaction> expected = Arrays.asList(
                new Transaction(mario, 2012, 700),
                new Transaction(mario, 2012, 710),
                new Transaction(alan, 2012, 950),
                new Transaction(raoul, 2012, 1000)
        );
        List<Transaction> result = victim.findTransactionsByYearAndSortByValue
                (transactionTestData.getTransactions(), 2012);
        assertEquals(expected, result);
    }

    @Test
    public void findTransactionsAllYears() {
        List<Integer> expected = Arrays.asList( 2011, 2012, 2011, 2012, 2012, 2012);
        List<Integer> result = victim.findTransactionsAllYears(transactionTestData.getTransactions());
        assertEquals(expected, result);
    }

    @Test
    public void findTransactionsAllUniqueYears() {
        Set<Integer> expected = new HashSet<>();
        expected.add(2011);
        expected.add(2012);
        Set<Integer> result = victim.findTransactionsAllUniqueYears(transactionTestData.getTransactions());
        assertEquals(expected, result);
    }

    @Test
    public void findTransactionsAllUniqueTraders() {
        Set<Trader> expected = new HashSet<>();
        expected.add(raoul);
        expected.add(mario);
        expected.add(alan);
        expected.add(brian);
        Set<Trader> result = victim.findTransactionsAllUniqueTraders(transactionTestData.getTransactions());
        assertEquals(expected, result);
    }

    @Test
    public void findTradersAllUniqueCities() {
        Set<String> expected = new HashSet<>();
        expected.add(raoul.getCity());
        expected.add(mario.getCity());
        Set<String> result = victim.findTradersAllUniqueCities(transactionTestData.getTransactions());
        assertEquals(expected, result);
    }

    @Test
    public void findTradersByCity() {
        Set<Trader> expected = new HashSet<>();
        expected.add(raoul);
        expected.add(alan);
        expected.add(brian);
        Set<Trader> result = victim.findTradersByCity(transactionTestData.getTransactions(), cambridgeCity);
        assertEquals(expected, result);
    }

    @Test
    public void checkCityForTraders() {
        boolean result = victim.checkCityForTraders(transactionTestData.getTransactions(), cambridgeCity);
        assertTrue(result);
    }

    @Test
    public void checkCityForTraders2() {
        boolean result = victim.checkCityForTraders(transactionTestData.getTransactions(), "Riga");
        assertFalse(result);
    }

    @Test
    public void findMaxValue() {
        Integer expected = 1000;
        Integer result = victim.findMaxValue(transactionTestData.getTransactions()).get();
        assertEquals(expected, result);
    }

    @Test
    public void findMaxValue2() {
        boolean result = victim.findMaxValue(emptyList).isEmpty();
        assertTrue(result);
    }

    @Test
    public void findMinValue() {
        Integer expected = 300;
        Integer result = victim.findMinValue(transactionTestData.getTransactions()).get();
        assertEquals(expected, result);
    }

    @Test
    public void tradersNames() {
        String expected = "Alan,Brian,Mario,Raoul";
        String result = victim.tradersNames(transactionTestData.getTransactions());
        assertEquals(expected, result);
    }

    @Test
    public void tradersCities() {
        String expected = "Cambridge,Milan";
        String result = victim.tradersCities(transactionTestData.getTransactions());
        assertEquals(expected, result);
    }
}