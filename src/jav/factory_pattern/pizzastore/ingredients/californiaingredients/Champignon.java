package jav.factory_pattern.pizzastore.ingredients.californiaingredients;

import jav.factory_pattern.pizzastore.ingredients.Veggies;

public class Champignon extends Veggies {
    @Override
    public String toString() {
        return getClass().getSimpleName();
    }
}
