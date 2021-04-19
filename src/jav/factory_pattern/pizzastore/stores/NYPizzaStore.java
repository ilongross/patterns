package jav.factory_pattern.pizzastore.stores;

import jav.factory_pattern.pizzastore.ingredients.PizzaIngredientsFactory;
import jav.factory_pattern.pizzastore.ingredients.nyingredients.NYPizzaIngredientFactory;
import jav.factory_pattern.pizzastore.typespizza.*;

public class NYPizzaStore extends PizzaStore {

    @Override
    protected Pizza createPizza(String item) {
        Pizza pizza = null;
        PizzaIngredientsFactory ingredientFactory =
                new NYPizzaIngredientFactory();

        if(item.equals("cheese")) {
            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("New York Style CHEESE Pizza");
        }
        else if(item.equals("veggie")) {
            pizza = new VeggiePizza(ingredientFactory);
            pizza.setName("New York Style VEGGIE Pizza");
        }
        else if (item.equals("clam")) {
            pizza = new ClamPizza(ingredientFactory);
            pizza.setName("New York Style CLAM Pizza");
        }
        else if(item.equals("pepperoni")) {
            pizza = new PepperoniPizza(ingredientFactory);
            pizza.setName("New York Style PEPPERONI Pizza");
        }
        return pizza;
    }
}
