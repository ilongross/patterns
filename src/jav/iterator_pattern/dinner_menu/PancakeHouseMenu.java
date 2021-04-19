package jav.iterator_pattern.dinner_menu;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class PancakeHouseMenu implements Menu{
    private static final int MAX_ITEMS = 6;
    private int numberOfItems = 0;
    List<MenuItem> menuItems;

    public PancakeHouseMenu(MenuItem ... items) {
        this.menuItems = Arrays.asList(items);
    }

    public Iterator createIterator() {
        return menuItems.iterator();
    }

}
