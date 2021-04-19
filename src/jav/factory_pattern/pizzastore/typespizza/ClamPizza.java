package jav.factory_pattern.pizzastore.typespizza;

import jav.factory_pattern.pizzastore.ingredients.PizzaIngredientsFactory;

public class ClamPizza extends Pizza {

    PizzaIngredientsFactory ingredientFactory;

    public ClamPizza(PizzaIngredientsFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    @Override
    public void prepare() {
        System.out.println("Prepare: " + name);
        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
        cheese = ingredientFactory.createCheese();
        clam = ingredientFactory.createClam();
    }
}
