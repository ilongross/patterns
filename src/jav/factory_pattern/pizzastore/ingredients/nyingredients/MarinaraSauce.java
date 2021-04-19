package jav.factory_pattern.pizzastore.ingredients.nyingredients;

import jav.factory_pattern.pizzastore.ingredients.Sauce;

public class MarinaraSauce extends Sauce {
    @Override
    public String toString() {
        return getClass().getSimpleName();
    }
}
