package com.javaguru.teacher.lesson_14.lessoncode;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

class StreamExample {

    public static void main(String[] args) {
        ListService service = new StreamApiListService();

        List<String> strings = Arrays.asList("bbb", "cccc", "a", "a", "a", "asdsad", "dasdsa", "ccc", "aaa");

        service.filterUniqueByLength(strings, 3)
                .stream()
                .map(String::toUpperCase)
                .forEach(System.out::println);

        Optional<String> optional = strings
                .stream()
                .filter(word -> word.equals("z"))
                .findFirst();

        optional.ifPresent(System.out::println);

        System.out.println("========");
        strings.stream()
                .sorted()
                .forEach(System.out::println);

        List<Person> people = Arrays.asList(
                new Person("Rus", 20),
                new Person("Ruslan", 31),
                new Person("Viktor", 34),
                new Person("Denis", 23),
                new Person("Anton", 40)
        );

        System.out.println("=========");

        people.stream()
                .sorted()
                .forEach(System.out::println);

        System.out.println("=========");

        people.stream()
                .sorted(StreamExample::compare)
                .forEach(System.out::println);

        System.out.println("=========");
        people.stream()
                .sorted(Comparator.comparingInt(Person::getAge))
                .forEach(System.out::println);
    }

    private static int compare(Person person1, Person person2) {
        if (person1.getAge().equals(person2.getAge())) {
            return 0;
        } else if (person1.getAge() > person2.getAge()) {
            return 1;
        } else {
            return -1;
        }
    }
}
