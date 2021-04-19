package jav.factory_pattern.pizzastore.stores;

import jav.factory_pattern.pizzastore.ingredients.PizzaIngredientsFactory;
import jav.factory_pattern.pizzastore.ingredients.californiaingredients.CaliforniaIngredientsFactory;
import jav.factory_pattern.pizzastore.typespizza.*;

public class CaliforniaPizzaStore extends PizzaStore {

    @Override
    public Pizza createPizza(String item) {
        Pizza pizza = null;
        PizzaIngredientsFactory ingredientFactory =
                new CaliforniaIngredientsFactory();

        if(item.equals("cheese")) {
            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("California Style CHEESE Pizza");
        }
        else if(item.equals("veggie")) {
            pizza = new VeggiePizza(ingredientFactory);
            pizza.setName("California Style VEGGIE Pizza");
        }
        else if (item.equals("clam")) {
            pizza = new ClamPizza(ingredientFactory);
            pizza.setName("California Style CLAM Pizza");
        }
        else if(item.equals("pepperoni")) {
            pizza = new PepperoniPizza(ingredientFactory);
            pizza.setName("California Style PEPPERONI Pizza");
        }
        return pizza;
    }
}
