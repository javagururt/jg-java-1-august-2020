package com.javaguru.student_igors_jurkovs.lesson_4.level_7_senior;

class LeapYear {

    boolean leapYear(int year) {
        if (year % 4 == 0 && year % 100 != 0) {
            return true;
        } else return year % 100 == 0 && year % 400 == 0;
    }
}

class LeapYearTest {
    public static void main(String[] args) {
        LeapYearTest leapYearTest = new LeapYearTest();
        leapYearTest.leapYearTest(2000);
        leapYearTest.leapYearTest(2020);
        leapYearTest.normalYearTest(2033);
        leapYearTest.leapYearTest(0); // По сути 0 год даже не существовал, отсчет времени начинался с 1 года н.э.
        /*
        Математически удобнее включать год 0 и представлять более ранние годы как отрицательные,
        с конкретной целью облегчения расчета количества лет между отрицательным (BC) годом и положительным (AD) годом.
        Это конвенция, используемая в астрономической нумерации года и в международной стандартной системе дат ISO 8601.
        В этих системах год 0 является високосным годом.

        В связи с этим я не делаю никаких исключений для 0 года.
         */
        leapYearTest.normalYearTest(200);
    }

    void leapYearTest(int year) {
        LeapYear leapYear = new LeapYear();
        if (leapYear.leapYear(year)) {
            System.out.println(year + " is a leap year");
        }else {
            System.out.println("Leap year test: FAILED");
        }
    }

    void normalYearTest(int year) {
        LeapYear leapYear = new LeapYear();
        if (!leapYear.leapYear(year)) {
            System.out.println(year + " is a normal year");
        }else {
            System.out.println("Normal year test: FAILED");
        }
    }

}
