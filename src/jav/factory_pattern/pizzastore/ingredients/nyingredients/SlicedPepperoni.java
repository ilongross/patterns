package jav.factory_pattern.pizzastore.ingredients.nyingredients;

import jav.factory_pattern.pizzastore.ingredients.Pepperoni;

public class SlicedPepperoni extends Pepperoni {
    @Override
    public String toString() {
        return getClass().getSimpleName();
    }
}
