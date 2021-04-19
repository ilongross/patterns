package jav.factory_pattern.pizzastore.ingredients.chicagoingredients;

import jav.factory_pattern.pizzastore.ingredients.Veggies;

public class EggPlant extends Veggies {
    @Override
    public String toString() {
        return getClass().getSimpleName();
    }
}
