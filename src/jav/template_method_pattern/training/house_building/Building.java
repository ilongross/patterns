package jav.template_method_pattern.training.house_building;

public abstract class Building {

    public final void build() {
        registration();
        basement();
        floor();
        facadeWork();
    }

    private void registration() {
        System.out.println("Registration the build documents");
    }

    private void basement () {
        System.out.println("Lay the basement");
    }

    public abstract void floor();

    public abstract void facadeWork();
}
