package jav.decorator_pattern.magicheroes.equipment;

import jav.decorator_pattern.magicheroes.Hero;

public class Axe extends Equipment{
    Hero upgrade;

    public Axe(Hero upgrade) {
        this.upgrade = upgrade;
    }

    @Override
    public String getEquipment() {
        return upgrade.getEquipment() + " + Thor's Axe";
    }

    @Override
    public String getSkills() {
        return upgrade.getSkills() + " + Destroiyng hummering";
    }

    @Override
    public int powerful() {
        return upgrade.powerful() + 12;
    }

    @Override
    public String getName() {
        return upgrade.getName();
    }
}
