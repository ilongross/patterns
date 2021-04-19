package jav.template_method_pattern.starbuzz;

public class SubCoffee extends HotDrink{
    @Override
    void brew() {
        System.out.println("Dripping Coffee through filter");
    }
    @Override
    void addCondiments() {
        System.out.println("Adding Sugar and Milk");
    }
}
