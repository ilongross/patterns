package jav.factory_pattern.pizzastore.stores;

import jav.factory_pattern.pizzastore.ingredients.PizzaIngredientsFactory;
import jav.factory_pattern.pizzastore.ingredients.chicagoingredients.ChicagoPizzaIngredientFactory;
import jav.factory_pattern.pizzastore.typespizza.*;

public class ChicagoPizzaStore extends PizzaStore {

    @Override
    public Pizza createPizza(String item) {
        Pizza pizza = null;
        PizzaIngredientsFactory ingredientFactory =
                new ChicagoPizzaIngredientFactory();

        if(item.equals("cheese")) {
            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("Chicago Style CHEESE Pizza");
        }
        else if(item.equals("veggie")) {
            pizza = new VeggiePizza(ingredientFactory);
            pizza.setName("Chicago Style VEGGIE Pizza");
        }
        else if (item.equals("clam")) {
            pizza = new ClamPizza(ingredientFactory);
            pizza.setName("Chicago Style CLAM Pizza");
        }
        else if(item.equals("pepperoni")) {
            pizza = new PepperoniPizza(ingredientFactory);
            pizza.setName("Chicago Style PEPPERONI Pizza");
        }
        return pizza;
    }
}
