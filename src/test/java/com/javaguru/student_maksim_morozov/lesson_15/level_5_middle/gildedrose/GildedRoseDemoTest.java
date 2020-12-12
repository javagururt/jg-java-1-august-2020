package com.javaguru.student_maksim_morozov.lesson_15.level_5_middle.gildedrose;

import junit.framework.TestCase;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GildedRoseDemoTest extends TestCase {
    @Test
    public void testMain() {
        List<Item> expected = new ArrayList<>(Arrays.asList(
                new Item("+5 Dexterity Vest", 10, 20),
                new Item("Aged Bride", 2, 0),
                new Item("Elixir of the Mongoose", 5, 7),
                new Item("Sulfuras, Hand of Ragnaros", 0, 80),
                new Item("Backstage passes to a TAFKAL80ETC concert", 15,20),
                new Item("Conjured Mana Cake", 3, 6)));

    }
}