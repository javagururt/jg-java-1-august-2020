package com.javaguru.student_ivan_shulga.lesson_3.level_2;

import com.javaguru.teacher.codereview.CodeReview;

@CodeReview(approved = true)
class Task_10 {

    public static void main(String[] args) {

        // Для сравнения строк можно воспользоваться методом equals():
            String x = "Test String";
            System.out.println("Test String".equals(x)); // true

            String s1 = "Java";
            String s2 = "Java";
            String s3 = new String("Java");
            String s4 = new String(s1);
            System.out.println("s1==s2 : " + (s1 == s2));
            System.out.println("s3==s4 : " + (s3 == s4));
            System.out.println("s1==s3 : " + (s1 == s3));
            System.out.println("s1 equals s2 : " + s1.equals(s2));
            System.out.println("s1 equals s3 : " + s1.equals(s3));

        // Когда при сравнении строк нам не важен регистр, нужно использовать метод equalsIgnoreCase():
            String x2 = "Test String";
            System.out.println("test string".equalsIgnoreCase(x2)); // true

        // String Length
        // A String in Java is actually an object, which contain methods that can perform certain operations on strings.
        // For example, the length of a string can be found with the length() method:

        // Example
            String txt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
            System.out.println("The length of the txt string is: " + txt.length());

        /*
        В Java существует так называемый String Pool, в котором хранятся созданные строки.
        При создании очередной строки, JVM сначала ищет такую строку в String Pool. Если такая строка уже есть,
        то она возвращается вместо создания новой.
        String Pool не используется, если строка создается с помощью конструктора.
        В этом случае гарантированно создается новый объект.
        https://www.examclouds.com/ru/java/java-core-russian/stroki
         */
        /*
        Java String pool — это пул или набор объектов (строк), который расположен в специальном месте — куче (Heap).
        String в Java — один из самых распространённых типов данных. Это не примитивный тип, а объект,
        поскольку весьма ресурсозатратен. Так, для хранения строки из четырёх символов необходимо выделить 56 байт памяти.
        Вот почему строки, как и другие объекты, хранятся в куче.
        https://javarush.ru/groups/posts/426-vopros-otvet-pochemu-paroljh-v-java-luchshe-khranitjh-v-massive-simvolov-a-ne-v-string-
         */
        /*
        Руководство по Java String Pool
        https://www.codeflow.site/ru/article/java-string-pool
         */


    }

}
