package jav.adapter_and_facade_patterns.adapter.iterator_enum;

import java.util.Enumeration;
import java.util.Iterator;

public class EnumerationIterator implements Iterator{

    Enumeration enumObj;

    public EnumerationIterator(Enumeration enumObj) {
        this.enumObj = enumObj;
    }

    @Override
    public boolean hasNext() {
        return enumObj.hasMoreElements();
    }

    @Override
    public Object next() {
        return enumObj.nextElement();
    }

    public void remove() {
        throw new UnsupportedOperationException();
    }
}
