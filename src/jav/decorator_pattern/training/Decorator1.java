package jav.decorator_pattern.training;

public class Decorator1 extends Decorator{

    private long id = getId();
    Component component;

    public Decorator1(Component component) {
        this.component = component;
    }

    @Override
    public String toString() {
        return "[" + id + "]" + " Decorator 1: " + component;
    }
}
