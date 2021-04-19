package jav.template_method_pattern.starbuzz;

public class SubTea extends HotDrink{

    @Override
    void brew() {
        System.out.println("Steeping the tea");
    }

    @Override
    void addCondiments() {
        System.out.println("Adding Lemon");
    }
}
