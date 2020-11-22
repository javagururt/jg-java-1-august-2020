package com.javaguru.student_igors_jurkovs.lesson_14.level_3_junior;

import com.javaguru.student_igors_jurkovs.lesson_14.level_3_junior.domain.Trader;
import com.javaguru.student_igors_jurkovs.lesson_14.level_3_junior.domain.Transaction;

import java.util.Arrays;
import java.util.List;

public class TransactionTestData {

    public List<Transaction> getTransactions() {
        String cambridgeCity = "Cambridge";
        Trader raoul = new Trader("Raoul", cambridgeCity);
        Trader mario = new Trader("Mario","Milan");
        Trader alan = new Trader("Alan", cambridgeCity);
        Trader brian = new Trader("Brian", cambridgeCity);

        return Arrays.asList(
                new Transaction(brian, 2011, 300),
                new Transaction(raoul, 2012, 1000),
                new Transaction(raoul, 2011, 400),
                new Transaction(mario, 2012, 710),
                new Transaction(mario, 2012, 700),
                new Transaction(alan, 2012, 950)
        );
    }

}
