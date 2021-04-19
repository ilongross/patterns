package jav.factory_pattern.pizzastore.ingredients.nyingredients;

import jav.factory_pattern.pizzastore.ingredients.Cheese;

public class ReggianoCheese extends Cheese {
    @Override
    public String toString() {
        return getClass().getSimpleName();
    }
}
