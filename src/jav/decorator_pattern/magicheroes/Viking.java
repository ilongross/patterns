package jav.decorator_pattern.magicheroes;

public class Viking extends Hero{

    @Override
    public String getName() {
        return "Viking";
    }

    public Viking() {
        equipment = "Helmet";
        skills = "Courage";
    }

    @Override
    public int powerful() {
        return 15;
    }
}
