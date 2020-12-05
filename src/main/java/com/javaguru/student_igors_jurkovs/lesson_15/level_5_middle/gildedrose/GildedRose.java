package com.javaguru.student_igors_jurkovs.lesson_15.level_5_middle.gildedrose;

import java.util.List;

class GildedRose {

    private static final String SULFURAS_HAND_OF_RAGNAROS = "Sulfuras, Hand of Ragnaros";
    private static final String BACKSTAGE_PASSES = "Backstage passes to a TAFKAL80ETC concert";
    private static final String AGED_BRIE = "Aged Brie";

    public void updateQuality(List<Item> items) {

        for (Item item : items) {
            if (isAgedBrie(item)) {
                updateAgedBrie(item);
            } else if (isBackstagePasses(item)) {
                updateBackstagePasses(item);
            } else if (isSulfuras(item)) {
                updateSulfuras(item);
            } else if (isConjuredItem(item)) {
                updateConjuredItem(item);
            } else {
                updateCommonItem(item);
            }
        }

    }

    private void updateAgedBrie(Item item) {
        if (item.getQuality() < 50) {
            item.setQuality(item.getQuality() + 1);
        }
        item.setSellIn(item.getSellIn() - 1);
    }

    private void updateBackstagePasses(Item item) {
        if (item.getSellIn() <= 10) {
            item.setQuality(item.getQuality() + 2);
        } else if (item.getSellIn() <= 5) {
            item.setQuality(item.getQuality() + 3);
        } else if (item.getSellIn() == 0){
            item.setQuality(0);
        } else {
            item.setQuality(item.getQuality() + 1);
        }
        item.setSellIn(item.getSellIn() - 1);
    }

    private void updateSulfuras(Item item) {
        item.setSellIn(0);
    }

    private void updateCommonItem(Item item) {
        if (item.getSellIn() > 0) {
            item.setQuality(item.getQuality() - 1);
        } else {
            item.setQuality(item.getQuality() - 2);
        }
        item.setSellIn(item.getSellIn() - 1);
    }

    private void updateConjuredItem(Item item) {
        if (item.getSellIn() > 0) {
            item.setQuality(item.getQuality() - 2);
        } else {
            item.setQuality(item.getQuality() - 4);
        }
        item.setSellIn(item.getSellIn() - 1);
    }

    private boolean isAgedBrie(Item item) {
        return AGED_BRIE.equals(item.getName());
    }

    private boolean isBackstagePasses(Item item) {
        return BACKSTAGE_PASSES.equals(item.getName());
    }

    private boolean isSulfuras(Item item) {
        return SULFURAS_HAND_OF_RAGNAROS.equals(item.getName());
    }

    private boolean isConjuredItem(Item item) {
        return item.getName().contains("Conjured")
                || item.getName().contains("conjured");
    }

}