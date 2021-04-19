package jav.iterator_pattern.dinner_menu;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Waitress {
    private Menu pancakeHouseMenu;
    private Menu dinnerMenu;
    private Menu cafeMenu;
    private List<Menu> kindsMenu = new ArrayList<>();

    public Waitress(Menu ... kindsMenu) {
        this.kindsMenu.addAll(Arrays.asList(kindsMenu));
    }

    public void printMenu () {
        System.out.println("MENU:\n");
        for (Menu menu : kindsMenu) {
            printMenu(menu.createIterator());
            System.out.println("--------------");
        }
    }

    private void printMenu(Iterator iterator) {
        double totalPrice = 0;
        while(iterator.hasNext()) {
            MenuItem menuItem = (MenuItem) iterator.next();
            System.out.print(menuItem.getName() + ", ");
            System.out.print("$" + menuItem.getPrice() + " --");
            System.out.println(menuItem.getDescription());
            totalPrice += menuItem.getPrice();
        }
        System.out.printf("TOTAL PRICE: -- $%.2f --\n", totalPrice);
    }
}
