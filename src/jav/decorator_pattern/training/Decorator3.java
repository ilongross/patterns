package jav.decorator_pattern.training;

public class Decorator3 extends Decorator{

    private long id = getId();
    Component component;

    public Decorator3(Component component) {
        this.component = component;
    }

    @Override
    public String toString() {
        return "[" + id + "]" + " Decorator 3: " + component;
    }

}
