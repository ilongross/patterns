package jav.factory_pattern.pizzastore.ingredients.nyingredients;

import jav.factory_pattern.pizzastore.ingredients.Clams;

public class FreshClams extends Clams {
    @Override
    public String toString() {
        return getClass().getSimpleName();
    }
}
