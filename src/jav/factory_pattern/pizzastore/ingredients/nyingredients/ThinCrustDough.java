package jav.factory_pattern.pizzastore.ingredients.nyingredients;

import jav.factory_pattern.pizzastore.ingredients.Dough;

public class ThinCrustDough extends Dough {
    @Override
    public String toString() {
        return getClass().getSimpleName();
    }
}
