package jav.decorator_pattern.starbuzz;

public abstract class Beverage {
    String description  = "Unknown Beverage";
    String size = "M";

    public abstract double cost();

    public String getSize() {
        return size;
    }
    public void setSize(String size) {
        this.size = size;
    }

    public String getDescription() {
        return description;
    }
}
