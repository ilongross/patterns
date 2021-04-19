package jav.decorator_pattern.training;

public class Decorator2 extends Decorator{

    private long id = getId();
    Component component;

    public Decorator2(Component component) {
        this.component = component;
    }

    @Override
    public String toString() {
        return "[" + id + "]" + " Decorator 2: " + component;
    }
}
