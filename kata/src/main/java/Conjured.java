/**
 * @(#)Conjured.java, 8月 07, 2023.
 * <p>
 * Copyright 2023 fenbi.com. All rights reserved.
 * FENBI.COM PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */

/**
 * @author fanfan
 */
public class Conjured extends Item {
    public Conjured(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    @Override
    public void update() {
        int temp = quality - 2;
        quality = temp >= 0 ? temp : 0;
        sellIn = sellIn - 1;
        if (sellIn < 0) {
            temp = quality - 2;
            quality = temp >= 0 ? temp : 0;
        }
    }
}