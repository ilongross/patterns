package jav.adapter_and_facade_patterns.adapter.iterator_enum;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;

public class IteratorEnumeration implements Enumeration {

    Iterator iterator;

    public IteratorEnumeration(Iterator iterator) {
        this.iterator = iterator;
    }

    @Override
    public boolean hasMoreElements() {
        return iterator.hasNext();
    }

    @Override
    public Object nextElement() {
        return iterator.next();
    }
}

class TestIterEnum {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        list.add("3");

        Iterator iterList = list.listIterator();
        Enumeration enumAdapter = new IteratorEnumeration(iterList);
        for (int i = 0; i < 5; i++) {
            if(!enumAdapter.hasMoreElements()) {
                System.out.println("End!");
                break;
            }
            String line = (String)enumAdapter.nextElement();
            System.out.println(line);
        }
    }
}
