package com.javaguru.student_ivan_shulga.lesson_14.level_3_4_junior_and_5_6_middle;

import java.util.List;

public class DemoForMe {

    public static void main(String[] args) {

        TransactionTestData testData = new TransactionTestData();
        List<Transaction> testList = testData.getTransactions();
        TransactionAnalysisService analysisService = new TransactionAnalysisService();

        System.out.println(analysisService.findTransactionsByYear(testList, 2011)); // 2011 only
        System.out.println(analysisService.findTransactionsByYear(testList, 2012)); // 2012 only

        System.out.println(analysisService.sortingValuesFromSmallestToLargest(testList)); // sorting by values to largest
        System.out.println(analysisService.sortingValuesFromLargestToSmallest(testList)); // sorting by values to smallest
        System.out.println(analysisService.findTransactionsByYearAndSortingToLargest(testList, 2011)); // 2011 only and sorting by values to largest

        System.out.println(analysisService.findYearsWithTransactions(testList)); // выводим список лет с когда были транзакции
        System.out.println(analysisService.findUniqueYearsWithTransactions(testList)); // выводим список уникальных лет с когда были транзакции
        System.out.println(analysisService.findUniqueTraderNames(testList)); // выводим список уникальных имён трейдеров
        System.out.println(analysisService.findUniqueTraderCities(testList)); // выводим список уникальных городов
        System.out.println(analysisService.findTradersFromSelectedCities(testList,"Milan")); // выводим список трейдеров из определённого города

        System.out.println(analysisService.checkIfTradersWorkInTheCity(testList, "Cambridge")); // true если хоть один работает в указанном городе

        System.out.println(analysisService.returnTraderInAlphabeticalOrderSeparatedByCommas(testList)); // сортированные через запятую трейдеры
        System.out.println(analysisService.returnCitiesInAlphabeticalOrderSeparatedByCommas(testList)); // сортированные через запятую города
    }

}
