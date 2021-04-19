package jav.factory_pattern.pizzastore.stores.chicago;

import jav.factory_pattern.pizzastore.typespizza.Pizza;

public class ChicagoStyleCheesePizza extends Pizza {



    @Override
    public void prepare() {

    }

    @Override
    public void cut() {
        System.out.println("Cutting the pizza into square slices");
    }
}
