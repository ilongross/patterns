package jav.decorator_pattern.magicheroes;

public class Alien extends Hero{
    @Override
    public String getName() {
        return "Alien";
    }

    public Alien() {
        equipment = "Fangs";
        skills = "Poison";
    }

    @Override
    public int powerful() {
        return 10;
    }
}
