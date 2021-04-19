package jav.decorator_pattern.magicheroes;

public class Hobbit extends Hero{

    @Override
    public String getName() {
        return "Hobbit";
    }

    public Hobbit() {
        equipment = "Boots of Speed";
        skills = "Stealth";
    }

    @Override
    public int powerful() {
        return 5;
    }
}
