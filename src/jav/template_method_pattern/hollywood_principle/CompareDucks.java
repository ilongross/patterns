package jav.template_method_pattern.hollywood_principle;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class CompareDucks {

    public static void displayList(Iterator iterator) {
        while(iterator.hasNext()) {
            Duck duck = (Duck) iterator.next();
            System.out.printf("%s %d\n", duck.getName(), duck.getWeight());
        }
    }

    public static void main(String[] args) {
        List<Duck> ducks = new ArrayList<>();
        ducks.add(new Duck("Henry", 8));
        ducks.add(new Duck("Johnny", 5));
        ducks.add(new Duck("Henry", 5));
        ducks.add(new Duck("Sally", 8));
        ducks.add(new Duck("Henry", 10));
        Duck[] ducksArr = new Duck[ducks.size()];

        System.out.println("Before sorting: ");
        Iterator ducksIterator = ducks.iterator();
        displayList(ducksIterator);
        for (int i = 0; i < ducks.size(); i++) {
            ducksArr[i] = ducks.get(i);
        }
        System.out.println();
        Arrays.sort(ducksArr);
        System.out.println("After sorting: ");
        Iterator ducksArrayIterator = Arrays.stream(ducksArr).iterator();
        displayList(ducksArrayIterator);
        System.out.println();

        for (Duck d : ducks) {
            if(ducks.get(0).compareTo(d) == 0) {
                System.out.println("Compare!");
            }
            if(ducks.get(0).compareTo(d) < 0) {
                System.out.println("Less");
            }
            if(ducks.get(0).compareTo(d) > 0) {
                System.out.println("Bigger");
            }
        }
    }
}
