package jav.iterator_pattern.dinner_menu;

import jav.composite_pattern.MenuComponent;
import jav.composite_pattern.NullIterator;

import java.util.Iterator;

public class MenuItem extends MenuComponent {
    private String name;
    private double price;
    private String description;
    boolean vegan;

    public MenuItem(String name, String description, boolean vegan, double price) {
        this.name = name;
        this.price = price;
        this.description = description;
        this.vegan = vegan;
    }

    public Iterator createIterator() {
        return new NullIterator();
    }

    public String getDescription() {
        return description;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
    public boolean isVegan() {
        return vegan;
    }
    public void print() {
        System.out.println(" " + getName());
        if(isVegan()) {
            System.out.println("(v)");
        }
        System.out.println(", " + getPrice());
        System.out.println("    -- " + getDescription());
    }
}
