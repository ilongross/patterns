package jav.template_method_pattern.training.house_building;

public class TownHouse extends Building {
    @Override
    public void floor() {
        System.out.println("Square for town house with underground");
    }

    @Override
    public void facadeWork() {
        System.out.println("Wood fence and roof");
    }
}
