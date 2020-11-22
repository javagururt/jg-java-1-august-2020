package com.javaguru.student_igors_jurkovs.lesson_14.level_3_junior;

import com.javaguru.student_igors_jurkovs.lesson_14.level_3_junior.domain.Trader;
import com.javaguru.student_igors_jurkovs.lesson_14.level_3_junior.domain.Transaction;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class TransactionAnalysisService {

    public List<Transaction> findTransactionsByYear(List<Transaction> transactions, int year) {
        return transactions.stream()
                .filter(transaction -> transaction.getYear() == year)
                .collect(Collectors.toList());
    }

    public List<Transaction> sortTransactionsByValue(List<Transaction> transactions) {
        return transactions.stream()
                .sorted(Comparator.comparingInt(Transaction::getValue))
                .collect(Collectors.toList());
    }

    public List<Transaction> sortTransactionsByValueReverseOrder(List<Transaction> transactions) {
        return transactions.stream()
                .sorted(Comparator.comparingInt(Transaction::getValue).reversed())
                .collect(Collectors.toList());
    }

    public List<Transaction> findTransactionsByYearAndSortByValue(List<Transaction> transactions, int year) {
        return transactions.stream()
                .filter(transaction -> transaction.getYear() == year)
                .sorted(Comparator.comparingInt(Transaction::getValue))
                .collect(Collectors.toList());
    }

    public List<Integer> findTransactionsAllYears(List<Transaction> transactions) {
        return transactions.stream()
                .map(Transaction::getYear)
                .collect(Collectors.toList());
    }

    public Set<Integer> findTransactionsAllUniqueYears(List<Transaction> transactions) {
        return transactions.stream()
                .map(Transaction::getYear)
                .collect(Collectors.toSet());
    }

    public Set<Trader> findTransactionsAllUniqueTraders(List<Transaction> transactions) {
        return transactions.stream()
                .map(Transaction::getTrader)
                .collect(Collectors.toSet());
    }

    public Set<String> findTradersAllUniqueCities(List<Transaction> transactions) {
        return transactions.stream()
                .map(Transaction::getTrader)
                .map(Trader::getCity)
                .collect(Collectors.toSet());
    }

    public Set<Trader> findTradersByCity(List<Transaction> transactions, String city) {
        return transactions.stream()
                .map(Transaction::getTrader)
                .filter(trader -> trader.getCity().equalsIgnoreCase(city))
                .collect(Collectors.toSet());
    }

    public boolean checkCityForTraders(List<Transaction> transactions, String city) {
        return transactions.stream()
                .map(Transaction::getTrader)
                .anyMatch(trader -> trader.getCity().equalsIgnoreCase(city));
    }

    public Optional<Integer> findMaxValue(List<Transaction> transactions) {
        return transactions.stream()
                .map(Transaction::getValue)
                .max(Integer::compare);
    }

    public Optional<Integer> findMinValue(List<Transaction> transactions) {
        return transactions.stream()
                .map(Transaction::getValue)
                .min(Integer::compare);
    }

    public String tradersNames(List<Transaction> transactions) {
        return transactions.stream()
                .map(Transaction::getTrader)
                .sorted(Comparator.comparing(Trader::getName))
                .map(Trader::getName)
                .distinct()
                .collect(Collectors.joining(","));
    }

    public String tradersCities(List<Transaction> transactions) {
        return transactions.stream()
                .map(Transaction::getTrader)
                .sorted(Comparator.comparing(Trader::getCity))
                .map(Trader::getCity)
                .distinct()
                .collect(Collectors.joining(","));
    }
}
