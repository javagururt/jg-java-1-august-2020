package com.javaguru.student_ivan_shulga.lesson_6.level_4_junior;

class Task_16 {

    public static void main(String[] args) {

        int i = 0;
        for ( ; ; i++) {
            if (i == 1000) {
                break;
            }
            System.out.println(i);
        }

        /*
        int i = 1;
        while (i > 0) {
            System.out.println(i);
            if (i >= 100) {
                break;
            }
            i++;
        }
         */

    }

}

/*
Как выйти из бесконечного цикла?
Найдите в интернете и напишите пример кода
для циклов while и for.
-----------------------------------------------------
Существует три оператора прерывания цикла: break, return и continue. Первые два способны полностью прервать работу цикла,
а continue прерывает лишь работу текущей итерации. Если вы используете в своем коде умышленно бесконечный цикл Java,
данные операторы обязательно должны в нем присутствовать.
 */