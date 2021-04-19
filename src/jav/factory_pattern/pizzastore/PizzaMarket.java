package jav.factory_pattern.pizzastore;

import jav.factory_pattern.pizzastore.stores.CaliforniaPizzaStore;
import jav.factory_pattern.pizzastore.stores.ChicagoPizzaStore;
import jav.factory_pattern.pizzastore.stores.NYPizzaStore;
import jav.factory_pattern.pizzastore.stores.PizzaStore;
import jav.factory_pattern.pizzastore.typespizza.Pizza;

import java.util.ArrayList;

public class PizzaMarket {
    public static void main(String[] args) {
        PizzaStore  p1 = new ChicagoPizzaStore(),
                    p2 = new CaliforniaPizzaStore(),
                    p3 = new NYPizzaStore();
        ArrayList<PizzaStore> markets = new ArrayList<>();
        markets.add(p1);
        markets.add(p2);
        markets.add(p3);

        for (PizzaStore p : markets) {
            System.out.println("Local Market: \"" + p.getBrandName() + "\"");
            Pizza pizza = p.orderPizza("pepperoni");
            System.out.println(pizza);
            System.out.println();
        }
    }
}
