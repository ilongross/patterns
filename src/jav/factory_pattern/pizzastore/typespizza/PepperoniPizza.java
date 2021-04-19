package jav.factory_pattern.pizzastore.typespizza;

import jav.factory_pattern.pizzastore.ingredients.PizzaIngredientsFactory;

public class PepperoniPizza extends Pizza {

    PizzaIngredientsFactory ingredientFactory;

    public PepperoniPizza(PizzaIngredientsFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    @Override
    public void prepare() {
        System.out.println("Prepare: " + name);
        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
        cheese = ingredientFactory.createCheese();
        veggies = ingredientFactory.createVeggies();
        pepperoni = ingredientFactory.createPepperoni();
    }
}
