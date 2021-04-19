package jav.factory_pattern.pizzastore.typespizza;

import jav.factory_pattern.pizzastore.ingredients.PizzaIngredientsFactory;

public class VeggiePizza extends Pizza {

    PizzaIngredientsFactory ingredientFactory;

    public VeggiePizza(PizzaIngredientsFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    @Override
    public void prepare() {
        System.out.println("Prepare: " + name);
        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
        cheese = ingredientFactory.createCheese();
        veggies = ingredientFactory.createVeggies();
    }
}
