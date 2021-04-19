package jav.factory_pattern.pizzastore.ingredients.californiaingredients;

import jav.factory_pattern.pizzastore.ingredients.Veggies;

public class Tomato extends Veggies {
    @Override
    public String toString() {
        return getClass().getSimpleName();
    }
}
