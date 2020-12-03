package com.javaguru.teacher.lesson_15.lessoncode;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

class StreamApiExample {

    public static void main(String[] args) {
        List<List<String>> stringLists = Arrays.asList(
                Arrays.asList("A", "B", "E", "C"),
                Arrays.asList("C", "C", "A", "D"),
                Arrays.asList("F", "E", "A", "D"),
                Arrays.asList("D", "C", "G", "D")
        );

        System.out.println(stringLists);

        List<String> strings = stringLists.stream()
                .flatMap(Collection::stream)
                .distinct()
                .sorted()
                .collect(Collectors.toList());

        System.out.println(strings);


        List<Long> longs = Arrays.asList(1L, 2L, 3L, 4L, 66L, 55L, 44L, 123L, 10L);
        Long sumResult = longs.stream()
                .reduce(200L, Long::sum);

//        Long sumResult = longs.stream()
//                .reduce(200L, (firstNumber, secondNumber) -> firstNumber + secondNumber);

        long sum = 200L;

        for (int i = 0; i < longs.size(); i++) {
            sum = sum * longs.get(i);
        }
        System.out.println(sum);

        System.out.println(sumResult);

        System.out.println(Long.MAX_VALUE);
        System.out.println(longs);

        IntStream
                .range(0, longs.size())
                .filter(i -> i % 2 == 0)
                .mapToObj(longs::get)
                .forEach(System.out::println);

        System.out.println();

        IntStream.range(0, 101)
                .forEach(System.out::println);
    }
}
