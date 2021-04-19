package jav.factory_pattern.pizzastore.typespizza;

import jav.factory_pattern.pizzastore.ingredients.*;

import java.util.Arrays;

public abstract class Pizza {
    public String name = getClass().getSimpleName();
    public Dough dough;
    public Sauce sauce;
    public Veggies veggies[];
    public Cheese cheese;
    public Pepperoni pepperoni;
    public Clams clam;

    public abstract void prepare();

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void bake() {
        System.out.println("Bake by Pizza-oven for 25 minutes at 350");
    }
    public void cut() {
        System.out.println("Cutting into diagonal slices");
    }
    public void box() {
        System.out.print("Fast Boxing " + "\"" + getName() + "\"\n");
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "name='" + name + '\'' +
                ", dough=" + dough +
                ", sauce=" + sauce +
                ", veggies=" +
                Arrays.toString(veggies) +
                ", cheese=" + cheese +
                ", pepperoni=" + pepperoni +
                ", clam=" + clam +
                '}';
    }
}
