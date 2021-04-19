package jav.template_method_pattern.training.house_building;

public class HighRiseHouse extends Building {
    @Override
    public void floor() {
        System.out.println("Many same apartments for poor families");
    }

    @Override
    public void facadeWork() {
        System.out.println("Simple material and colors");
    }
}
