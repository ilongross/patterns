package jav.decorator_pattern.magicheroes.skills;

import jav.decorator_pattern.magicheroes.Hero;

public class Agility extends Skills{
    Hero upgrade;

    public Agility(Hero upgrade) {
        this.upgrade = upgrade;
    }

    @Override
    public String getEquipment() {
        return upgrade.getEquipment();
    }

    @Override
    public String getSkills() {
        return upgrade.getSkills() + " + Smart Dodges";
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
