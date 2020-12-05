package com.javaguru.student_igors_jurkovs.lesson_15.level_5_middle.gildedrose;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class GildedRoseTest {

    private final GildedRose victim = new GildedRose();
    private final List<Item> items = new ArrayList<>(Arrays.asList(
            new Item("+5 Dexterity Vest", 10, 20),
            new Item("Aged Brie", 2, 0),
            new Item("Elixir of the Mongoose", 5, 7),
            new Item("Sulfuras, Hand of Ragnaros", 0, 80),
            new Item("Backstage passes to a TAFKAL80ETC concert", 15, 20),
            new Item("Conjured Mana Cake", 3, 6)
    ));

    @Test
    public void updateQuality() {
        List<Item> expected = new ArrayList<>(Arrays.asList(
                new Item("+5 Dexterity Vest", 9, 19),
                new Item("Aged Brie", 1, 1),
                new Item("Elixir of the Mongoose", 4, 6),
                new Item("Sulfuras, Hand of Ragnaros", 0, 80),
                new Item("Backstage passes to a TAFKAL80ETC concert", 14, 21),
                new Item("Conjured Mana Cake", 2, 4)
        ));
        victim.updateQuality(items);
        assertEquals(expected, items);
    }
}