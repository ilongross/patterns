package jav.iterator_pattern.dinner_menu;

import java.util.Iterator;
import java.util.List;

public class DinnerMenuIterator implements Iterator {

    List<MenuItem> items;
    int position = 0;

    public DinnerMenuIterator(List<MenuItem> items) {
        this.items = items;
    }

    @Override
    public boolean hasNext() {
        if(position >= items.size() || items.get(position) == null) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public Object next() {
        MenuItem menuItem = items.get(position);
        position = position + 1;
        return menuItem;
    }

    @Override
    public void remove() {
        if(position <= 0) {
            throw new IllegalStateException("You can't remove this item");
        }
    }
}
