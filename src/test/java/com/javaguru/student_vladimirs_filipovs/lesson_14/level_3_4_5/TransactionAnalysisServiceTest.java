package com.javaguru.student_vladimirs_filipovs.lesson_14.level_3_4_5;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class TransactionAnalysisServiceTest {
    private TransactionAnalysisService victim;
    private TransactionTestData data = new TransactionTestData();

    @Before
    public void setUp() {
        victim = new TransactionAnalysisService();
    }

    Trader raoul = new Trader("Raoul", "Cambridge");
    Trader mario = new Trader("Mario", "Milan");
    Trader alan = new Trader("Alan", "Cambridge");
    Trader brian = new Trader("Brian", "Cambridge");

    @Test
    public void shouldFindTransactionsBy2012Year() {
        List<Transaction> expected = new ArrayList<>();
                expected.add(new Transaction(raoul, 2012, 1000));
                expected.add(new Transaction(mario, 2012, 710));
                expected.add(new Transaction(mario, 2012, 700));
                expected.add(new Transaction(alan, 2012, 950));
        List<Transaction> actual = victim.findTransactionsByYear(data.getTransactions(), 2012);
        assertEquals(expected, actual);

    }
}