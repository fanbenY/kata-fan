/**
 * @(#)TexttestFixture.java, 8月 07, 2023.
 * <p>
 * Copyright 2023 fenbi.com. All rights reserved.
 * FENBI.COM PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */

/**
 * @author fanfan
 */

public class TexttestFixture {
    public static void main(String[] args) {
        System.out.println("OMGHAI!");

        Item[] items = new Item[]{
                new Item("+5 Dexterity Vest", 10, 20), //
                new Item("+5 Dexterity Vest", 10, 0), //
                new Item("+5 Dexterity Vest", 0, 3), //
                new Item("+5 Dexterity Vest", 0, 1), //
                new Item("Elixir of the Mongoose", 5, 7), //
                new AgedBrie("Aged Brie", 2, 0), //
                new AgedBrie("Aged Brie", 2, 50), //
                new Sulfuras("Sulfuras, Hand of Ragnaros", 0, 80), //
                new Sulfuras("Sulfuras, Hand of Ragnaros", -1, 80),
                new BackstagePass("Backstage passes to a TAFKAL80ETC concert", 15, 20),
                new BackstagePass("Backstage passes to a TAFKAL80ETC concert", 15, 50),
                new BackstagePass("Backstage passes to a TAFKAL80ETC concert", 10, 48),
                new BackstagePass("Backstage passes to a TAFKAL80ETC concert", 10, 49),
                new BackstagePass("Backstage passes to a TAFKAL80ETC concert", 5, 47),
                new BackstagePass("Backstage passes to a TAFKAL80ETC concert", 5, 49),
                new BackstagePass("Backstage passes to a TAFKAL80ETC concert", 0, 49),
                // this conjured item does not work properly yet
                new Conjured("Conjured Mana Cake", 3, 6),
                new Conjured("Conjured Mana Cake", 3, 0),
                new Conjured("Conjured Mana Cake", 0, 6),
                new Conjured("Conjured Mana Cake", 0, 3)
        };

        GildedRose app = new GildedRose(items);

        int days = 30;
        if (args.length > 0) {
            days = Integer.parseInt(args[0]) + 1;
        }

        for (int i = 0; i < days; i++) {
            System.out.println("-------- day " + i + " --------");
            System.out.println("name, sellIn, quality");
            for (Item item : items) {
                System.out.println(item);
            }
            System.out.println();
            app.updateQuality();
        }
    }

}