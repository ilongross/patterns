package jav.factory_pattern.pizzastore.ingredients.californiaingredients;

import jav.factory_pattern.pizzastore.ingredients.*;
import jav.factory_pattern.pizzastore.ingredients.chicagoingredients.Mozarella;
import jav.factory_pattern.pizzastore.ingredients.nyingredients.*;

public class CaliforniaIngredientsFactory implements PizzaIngredientsFactory {
    @Override
    public Dough createDough() {
        return new ThinCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new OlivaHoneySauce();
    }

    @Override
    public Cheese createCheese() {
        return new Mozarella();
    }

    @Override
    public Veggies[] createVeggies() {
        Veggies veggies[] = { new Garlic(), new Tomato(), new RedOnion(), new Champignon()};
        return veggies;
    }

    @Override
    public Pepperoni createPepperoni() {
        return new Bacon();
    }

    @Override
    public Clams createClam() {
        return null;
    }
}
