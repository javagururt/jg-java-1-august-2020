package com.javaguru.student_igors_gergeleziu.lesson_4.level_7.super_task_2;

class LeapYearTest {
    public static void main(String[] args) {
        LeapYearTest leapYearTest = new LeapYearTest();
        leapYearTest.shouldBeRegularYearIfNotDevidedBy4();
        leapYearTest.shouldBeLeapYearIfDevidedBy4AndNotDevidedBy100();
        leapYearTest.shouldBeRegularYearIfDevidedBy4And100AndNotDevidedBy400();
        leapYearTest.shouldBeLeapYearIfDevideBy4And100AndDevidedBy400();
    }

    private void shouldBeRegularYearIfNotDevidedBy4() {
        LeapYear leapYear = new LeapYear();
        checkResults(!leapYear.isLeapYear(3), "shouldBeRegularYearIfNotDevidedBy4Test");
    }

    private void shouldBeLeapYearIfDevidedBy4AndNotDevidedBy100() {
        LeapYear leapYear = new LeapYear();
        checkResults(leapYear.isLeapYear(20), "shouldBeLeapYearIfNotDevidedBy4AndNotDevidedBy100Test");
    }

    private void shouldBeRegularYearIfDevidedBy4And100AndNotDevidedBy400() {
        LeapYear leapYear = new LeapYear();
        checkResults(!leapYear.isLeapYear(600), "shouldBeRegularYearIfDevidedBy4And100AndNotDevidedBy400Test");
    }

    private void shouldBeLeapYearIfDevideBy4And100AndDevidedBy400() {
        LeapYear leapYear = new LeapYear();
        checkResults(leapYear.isLeapYear(2020), "shouldBeLeapYearIfDevideBy4And100AndDevidedBy400Test");
    }

    private void checkResults(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " = OK");
        } else {
            System.out.println(testName + " = Fail");
        }
    }
}
