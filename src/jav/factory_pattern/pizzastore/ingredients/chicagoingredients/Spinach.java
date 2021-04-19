package jav.factory_pattern.pizzastore.ingredients.chicagoingredients;

import jav.factory_pattern.pizzastore.ingredients.Veggies;

public class Spinach extends Veggies {
    @Override
    public String toString() {
        return getClass().getSimpleName();
    }
}
