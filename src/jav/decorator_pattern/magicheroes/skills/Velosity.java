package jav.decorator_pattern.magicheroes.skills;

import jav.decorator_pattern.magicheroes.Hero;

public class Velosity extends Skills{
    Hero upgrade;

    public Velosity(Hero upgrade) {
        this.upgrade = upgrade;
    }

    @Override
    public String getEquipment() {
        return upgrade.getEquipment();
    }

    @Override
    public String getSkills() {
        return upgrade.getSkills() + " + Very Very Fast MOVES";
    }

    @Override
    public int powerful() {
        return upgrade.powerful() + 16;
    }

    @Override
    public String getName() {
        return upgrade.getName();
    }
}
