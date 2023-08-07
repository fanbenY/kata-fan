/**
 * @(#)AgedBrie.java, 8月 07, 2023.
 * <p>
 * Copyright 2023 fenbi.com. All rights reserved.
 * FENBI.COM PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */

/**
 * @author fanfan
 */

public class AgedBrie extends Item {
    public AgedBrie(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    @Override
    public void update() {
        if (quality < 50) {
            quality = quality + 1;
        }
        sellIn = sellIn - 1;
        if (sellIn < 0) {
            // Aged Brie
            if (quality < 50) {
                quality = quality + 1;
            }
        }
    }
}