package jav.decorator_pattern.magicheroes.skills;

import jav.decorator_pattern.magicheroes.Hero;

public class Strength extends Skills{
    Hero upgrade;

    public Strength(Hero upgrade) {
        this.upgrade = upgrade;
    }

    @Override
    public String getEquipment() {
        return upgrade.getEquipment();
    }

    @Override
    public String getSkills() {
        return upgrade.getSkills() + " + Very strength KICKS";
    }

    @Override
    public int powerful() {
        return upgrade.powerful() + 15;
    }

    @Override
    public String getName() {
        return upgrade.getName();
    }
}
