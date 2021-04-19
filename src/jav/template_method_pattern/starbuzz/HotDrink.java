package jav.template_method_pattern.starbuzz;

public abstract class HotDrink {
    final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        hook();
        if(customerWantsCondiments()) {
            addCondiments();
        }
    }
    abstract void brew();
    abstract void addCondiments();

    void boilWater() {
        System.out.println("Boiling water");
    }
    void pourInCup() {
        System.out.println("Pouring into cup");
    }

    void hook() {
    }

    boolean customerWantsCondiments() {
        return true;
    }
}
