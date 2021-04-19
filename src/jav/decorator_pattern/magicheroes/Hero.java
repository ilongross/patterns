package jav.decorator_pattern.magicheroes;

public abstract class Hero {
    public String equipment = "Poor hero";
    public String skills = "Without skills";

    public abstract int powerful();

    public abstract String getName();

    public String getEquipment() {
        return equipment;
    }

    public String getSkills() {
        return skills;
    }
}
