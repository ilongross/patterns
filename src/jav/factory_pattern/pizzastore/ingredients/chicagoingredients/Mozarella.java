package jav.factory_pattern.pizzastore.ingredients.chicagoingredients;

import jav.factory_pattern.pizzastore.ingredients.Cheese;

public class Mozarella extends Cheese {
    @Override
    public String toString() {
        return getClass().getSimpleName();
    }
}
