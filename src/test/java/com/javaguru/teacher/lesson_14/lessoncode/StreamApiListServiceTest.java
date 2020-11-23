package com.javaguru.teacher.lesson_14.lessoncode;

import org.junit.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class StreamApiListServiceTest {

    private ListService victim = new StreamApiListService();

    @Test
    public void shouldConvertToSet() {
        List<String> strings = Arrays.asList("A", "A", "A", "B", "C");
        Set<String> actual = victim.convertToSet(strings);
        Set<String> expected = new HashSet<>(Arrays.asList("A", "B", "C"));

        assertThat(actual).isNotNull();
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void shouldFilterUniqueByStringLength() {
        List<String> strings = Arrays.asList("a", "c", "dddddddddd", "ccc", "ccc", "bbbbb", "bb");

        List<String> actual = victim.filterUniqueByLength(strings, 3);
        List<String> expected = Arrays.asList("A", "C", "CCC", "BB");

        assertThat(actual).isNotNull();
        assertThat(actual).isEqualTo(expected);
    }
}