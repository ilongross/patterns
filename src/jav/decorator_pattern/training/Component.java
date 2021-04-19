package jav.decorator_pattern.training;

public abstract class Component {
    public String title = "default";
    private static long id = 0;

    public abstract void setTitle();

    public long getId() {
        return ++id;
    }
}
