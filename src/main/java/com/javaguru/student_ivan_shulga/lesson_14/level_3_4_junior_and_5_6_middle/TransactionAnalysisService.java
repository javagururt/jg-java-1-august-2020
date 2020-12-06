package com.javaguru.student_ivan_shulga.lesson_14.level_3_4_junior_and_5_6_middle;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class TransactionAnalysisService {

    public List<Transaction> findTransactionsByYear(List<Transaction> transactions, int year) {
        return transactions
                .stream()
                .filter(tr -> tr.getYear() == year)
                .collect(Collectors.toList());
    }

    public List<Transaction> sortingValuesFromSmallestToLargest(List<Transaction> transactions) {
        return transactions
                .stream()
                .sorted(Comparator.comparing(Transaction::getValue))
                .collect(Collectors.toList());
    }

    public List<Transaction> sortingValuesFromLargestToSmallest(List<Transaction> transactions) {
        return transactions
                .stream()
                .sorted(Comparator.comparing(Transaction::getValue).reversed())
                .collect(Collectors.toList());
    }

    public List<Transaction> findTransactionsByYearAndSortingToLargest(List<Transaction> transactions, int year) {
        return transactions
                .stream()
                .filter(tr -> tr.getYear() == year)
                .sorted(Comparator.comparing(Transaction::getValue))
                .collect(Collectors.toList());
    }

    public List<Integer> findYearsWithTransactions(List<Transaction> transactions) {
        return transactions
                .stream()
                .map(Transaction::getYear)
                .collect(Collectors.toList());
    }

    public List<Integer> findUniqueYearsWithTransactions(List<Transaction> transactions) {
        return transactions
                .stream()
                .map(Transaction::getYear)
                .distinct()
                .collect(Collectors.toList());
    }

    public List<Trader> findUniqueTraderNames(List<Transaction> transactions) {
        return transactions
                .stream()
                .map(Transaction::getTrader)
                .distinct()
                .collect(Collectors.toList());
    }

    public List<String> findUniqueTraderCities(List<Transaction> transactions) {
        return transactions
                .stream()
                .map(Transaction::getTrader)
                .map(Trader::getCity)
                .distinct()
                .collect(Collectors.toList());
    }

    public List<Trader> findTradersFromSelectedCities(List<Transaction> transactions, String city) {
        return transactions
                .stream()
                .map(Transaction::getTrader)
                .filter(tr -> tr.getCity().equals(city))
                .distinct()
                .collect(Collectors.toList());
    }

    public boolean checkIfTradersWorkInTheCity(List<Transaction> transactions, String city) {
        return transactions
                .stream()
                .map(Transaction::getTrader)
                .anyMatch(tr -> tr.getCity().equals(city));
    }

    public Optional<Integer> findMinValue(List<Transaction> transactions) {
        return transactions
                .stream()
                .map(Transaction::getValue)
                .min(Integer::compare);
    }

    public String returnTraderInAlphabeticalOrderSeparatedByCommas(List<Transaction> transactions) {
        return transactions
                .stream()
                .map(Transaction::getTrader)
                .map(Trader::getName)
                .distinct()
                .sorted()
                .collect(Collectors.joining(", "));
    }

    public String returnCitiesInAlphabeticalOrderSeparatedByCommas(List<Transaction> transactions) {
        return transactions
                .stream()
                .map(Transaction::getTrader)
                .map(Trader::getCity)
                .distinct()
                .sorted()
                .collect(Collectors.joining(", "));
    }

}
