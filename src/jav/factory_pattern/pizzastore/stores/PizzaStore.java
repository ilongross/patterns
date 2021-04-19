package jav.factory_pattern.pizzastore.stores;

import jav.factory_pattern.pizzastore.typespizza.Pizza;

public abstract class PizzaStore {
    private String brandName = getClass().getSimpleName();

    public String getBrandName() {
        return brandName;
    }

    public Pizza orderPizza(String type) {
        Pizza pizza;
        pizza = createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }
    protected abstract Pizza createPizza(String item);
}