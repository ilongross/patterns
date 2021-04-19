package jav.factory_pattern.pizzastore.ingredients.californiaingredients;

import jav.factory_pattern.pizzastore.ingredients.Pepperoni;

public class Bacon extends Pepperoni {
    @Override
    public String toString() {
        return getClass().getSimpleName();
    }
}
