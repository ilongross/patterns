package jav.factory_pattern.pizzastore.ingredients.nyingredients;

import jav.factory_pattern.pizzastore.ingredients.Veggies;

public class Onion extends Veggies {
    @Override
    public String toString() {
        return getClass().getSimpleName();
    }
}
