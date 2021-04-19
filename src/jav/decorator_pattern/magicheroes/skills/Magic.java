package jav.decorator_pattern.magicheroes.skills;

import jav.decorator_pattern.magicheroes.Hero;

public class Magic extends Skills{
    Hero upgrade;

    public Magic(Hero upgrade) {
        this.upgrade = upgrade;
    }

    @Override
    public String getEquipment() {
        return upgrade.getEquipment();
    }

    @Override
    public String getSkills() {
        return upgrade.getSkills() + " + Powerful Magic Skills";
    }

    @Override
    public int powerful() {
        return upgrade.powerful() + 20;
    }

    @Override
    public String getName() {
        return upgrade.getName();
    }
}
