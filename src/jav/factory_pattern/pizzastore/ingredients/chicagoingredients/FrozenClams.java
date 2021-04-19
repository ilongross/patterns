package jav.factory_pattern.pizzastore.ingredients.chicagoingredients;

import jav.factory_pattern.pizzastore.ingredients.Clams;

public class FrozenClams extends Clams {
    @Override
    public String toString() {
        return getClass().getSimpleName();
    }
}
