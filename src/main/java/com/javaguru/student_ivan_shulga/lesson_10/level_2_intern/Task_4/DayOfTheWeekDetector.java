package com.javaguru.student_ivan_shulga.lesson_10.level_2_intern.Task_4;

public interface DayOfTheWeekDetector {

    String detectDayName(int number);

}

class DayOfTheWeekDetectorIfVersion implements DayOfTheWeekDetector {

    @Override
    public String detectDayName(int number) {
        if (number == 1) {
            return "Monday";
        } else if (number == 2) {
            return "Tuesday";
        } else if (number == 3) {
            return "Wednesday";
        } else if (number == 4) {
            return "Thursday";
        } else if (number == 5) {
            return "Friday";
        } else if (number == 6) {
            return "Saturday";
        } else if (number == 7) {
            return "Sunday";
        } else {
            return "Please input a valid number between 1 and 7";
        }
    }
}

class DayOfTheWeekDetectorSwitchVersion implements DayOfTheWeekDetector {

    @Override
    public String detectDayName(int number) {
        switch (number) {
            case 1: {
                return "Monday";
            }
            case 2: {
                return "Tuesday";
            }
            case 3: {
                return "Wednesday";
            }
            case 4: {
                return "Thursday";
            }
            case 5: {
                return "Friday";
            }
            case 6: {
                return "Saturday";
            }
            case 7: {
                return "Sunday";
            }
            default: {
                return "Please input a valid number between 1 and 7";
            }
        }
    }
}

class DayOfTheWeekDetectorArrayVersion implements DayOfTheWeekDetector {

    @Override // насчёт массива не уверен в правильности и красивости, по сути тот же if в итоге вышел
    public String detectDayName(int number) {
        String[] dayArray = new String[7];
        dayArray[0] = "Monday";
        dayArray[1] = "Tuesday";
        dayArray[2] = "Wednesday";
        dayArray[3] = "Thursday";
        dayArray[4] = "Friday";
        dayArray[5] = "Saturday";
        dayArray[6] = "Sunday";

        if (number == 1) {
            return dayArray[0];
        } else if (number == 2) {
            return dayArray[1];
        } else if (number == 3) {
            return dayArray[2];
        } else if (number == 4) {
            return dayArray[3];
        } else if (number == 5) {
            return dayArray[4];
        } else if (number == 6) {
            return dayArray[5];
        } else if (number == 7) {
            return dayArray[6];
        }
        return "Please input a valid number between 1 and 7";
    }
}

/*
Несколько имплементаций одного интерфейса.
Одну и ту же задачу можно решить разными способами.
Дан класс:
class DayOfTheWeekDetectorIfVersion {
	// Try to use switch here!!
	public String detectDayName(int number) {
        if (number == 1) {
            return "Monday";
        } else if (number == 2) {
            return "Tuesday";
        } else if (number == 3) {
            return "Wednesday";
        } else if (number == 4) {
            return "Thursday";
        } else if (number == 5) {
            return "Friday";
        } else if (number == 6) {
            return "Saturday";
        } else if (number == 7) {
            return "Sunday";
        } else {
            return "Please input a valid number between 1 and 7";
        }
    }
}
Создайте для этого класса интерфейс DayOfTheWeekDetector.
Сделайте так, чтобы класс DayOfTheWeekDetectorIfVersion реализовывал
интерфейс DayOfTheWeekDetector.
Создайте вторую имплементацию данного интерфейса основанную на switch операторе.
Если сможете, то создайте третью имплементацию основанную на массиве строк.
Индекс массива = номеру дня недели, а значение в ячейке массива это название соответствующего
дня недели.
Протестируйте все имплементации.
 */