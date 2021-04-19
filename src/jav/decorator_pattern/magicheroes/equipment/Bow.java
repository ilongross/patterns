package jav.decorator_pattern.magicheroes.equipment;

import jav.decorator_pattern.magicheroes.Hero;

public class Bow extends Equipment{
    Hero upgrade;

    public Bow(Hero upgrade) {
        this.upgrade = upgrade;
    }

    @Override
    public String getEquipment() {
        return upgrade.getEquipment() + " + Elfin Bow";
    }

    @Override
    public String getSkills() {
        return upgrade.getSkills() + " + Accuracy";
    }

    @Override
    public int powerful() {
        return upgrade.powerful() + 8;
    }

    @Override
    public String getName() {
        return upgrade.getName();
    }
}
