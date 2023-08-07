/**
 * @(#)Item.java, 8月 07, 2023.
 * <p>
 * Copyright 2023 fenbi.com. All rights reserved.
 * FENBI.COM PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */

/**
 * @author fanfan
 */
public class Item {

    public String name;

    public int sellIn;

    public int quality;

    public Item(String name, int sellIn, int quality) {
        this.name = name;
        this.sellIn = sellIn;
        this.quality = quality;
    }

    @Override
    public String toString() {
        return this.name + ", " + this.sellIn + ", " + this.quality;
    }

    public void update() {
        if (quality > 0) {
            quality = quality - 1;
        }
        sellIn = sellIn - 1;
        if (sellIn < 0) {
            if (quality > 0) {
                quality = quality - 1;
            }
        }
    }
}