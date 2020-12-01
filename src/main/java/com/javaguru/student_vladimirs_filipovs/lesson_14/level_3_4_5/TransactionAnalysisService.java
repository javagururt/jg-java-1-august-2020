package com.javaguru.student_vladimirs_filipovs.lesson_14.level_3_4_5;

import java.util.*;
import java.util.stream.Collectors;

class TransactionAnalysisService {
    public List<Transaction> findTransactionsByYear(List<Transaction> transactions, int year) {
        return transactions
                .stream()
                .filter(trans -> trans.getYear() == year)
                .collect(Collectors.toList());
    }

    public List<Transaction> sortTransactionsByValueFromSmallerToGreater(List<Transaction> transactions) {
        return transactions
                .stream()
                .sorted(Comparator.comparing(tran -> tran.getValue()))
                .collect(Collectors.toList());
    }

    public List<Transaction> sortTransactionsByValueFromGreaterToSmaller(List<Transaction> transactions) {
        return transactions
                .stream()
                .sorted(Comparator.comparing(Transaction::getValue).reversed())
                .collect(Collectors.toList());
    }

    public List<Transaction> sortTransactionsByValueFromSmallerToGreaterAndFindByYear
            (List<Transaction> transactions, int year) {
        return transactions
                .stream()
                .filter(tran -> tran.getYear() == year)
                .sorted(Comparator.comparing(tran -> tran.getValue()))
                .collect(Collectors.toList());
    }


    public List<Integer> allYearsWhenWasExecutedTransactions(List<Transaction> transactions) {
        return transactions
                .stream()
                .map(tran -> tran.getYear())
                .collect(Collectors.toList());
    }

    public Set<Integer> allUniqueYearsWhenWasExecutedTransactions1(List<Transaction> transactions) {
        Set<Integer> allYears = new HashSet<>();
        for (Transaction transaction : transactions) {
            allYears.add(transaction.getYear());
        }
        return allYears;
    }

    public List<Integer> allUniqueYearsWhenWasExecutedTransactions(List<Transaction> transactions) {
        return transactions
                .stream()
                .map(tran -> tran.getYear())
                .distinct()
                .collect(Collectors.toList());
    }

    public List<String> findAllTraders(List<Transaction> transactions) {
        return transactions
                .stream()
                .map(tran -> tran.getTrader())
                .map(trader -> trader.getName())
                .collect(Collectors.toList());
    }

    public List<String> findAllUniqueCities(List<Transaction> transactions) {
        return transactions
                .stream()
                .map(tran -> tran.getTrader())
                .map(trader -> trader.getCity())
                .distinct()
                .collect(Collectors.toList());
    }

    public List<String> allNamesTradersFromCity(List<Transaction> transactions, String city) {
        return transactions
                .stream()
                .map(tran -> tran.getTrader())
                .filter(trader -> trader.getCity().equalsIgnoreCase(city))
                .map(trader -> trader.getName())
                .collect(Collectors.toList());
    }

    public boolean isWorkAnyPersonInCurrentCity(List<Transaction> transactions, String city) {
        return transactions
                .stream()
                .map(tran -> tran.getTrader())
                .anyMatch(trader -> trader.getCity().contains(city));
    }
}

class ServiceDemo {
    public static void main(String[] args) {
        TransactionTestData data = new TransactionTestData();
        TransactionAnalysisService victim = new TransactionAnalysisService();
        System.out.println(victim.findTransactionsByYear(data.getTransactions(), 2012));

        System.out.println("sortTransactionsByValueFromSmallerToGreater: "
                + victim.sortTransactionsByValueFromSmallerToGreater(data.getTransactions()));

        System.out.println("sortTransactionsByValueFromGreaterToSmaller: "
                + victim.sortTransactionsByValueFromGreaterToSmaller(data.getTransactions()));

        System.out.println("sortTransactionsByValueFromSmallerToGreaterAndFindByYear: "
                + victim.sortTransactionsByValueFromSmallerToGreaterAndFindByYear(data.getTransactions(), 2011));

        System.out.println("allYearsWhenWasExecutedTransactions: "
                + victim.allYearsWhenWasExecutedTransactions(data.getTransactions()));

        System.out.println("allUniqueYearsWhenWasExecutedTransactions1: "
                + victim.allUniqueYearsWhenWasExecutedTransactions1(data.getTransactions()));

        System.out.println("allUniqueYearsWhenWasExecutedTransactions: "
                + victim.allUniqueYearsWhenWasExecutedTransactions(data.getTransactions()));

        System.out.println("findAllTraders: "
                + victim.findAllTraders(data.getTransactions()));

        System.out.println("findAllUniqueCities: "
                + victim.findAllUniqueCities(data.getTransactions()));

        System.out.println("allNamesTradersFromCity: "
                + victim.allNamesTradersFromCity(data.getTransactions(), "Cambridge"));

        System.out.println("isWorkAnyPersonInCurrentCity: "
                + victim.isWorkAnyPersonInCurrentCity(data.getTransactions(), "Cambridge"));

        System.out.println("isWorkAnyPersonInCurrentCity: "
                + victim.isWorkAnyPersonInCurrentCity(data.getTransactions(), "NewYork"));
    }
}
