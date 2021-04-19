package jav.template_method_pattern.training.house_building;

public class SkyScaper extends Building {
    @Override
    public void floor() {
        System.out.println("Building floors to the MOON");
    }

    @Override
    public void facadeWork() {
        System.out.println("Many beautiful glass-windows");
    }
}
