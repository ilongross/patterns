package jav.decorator_pattern.magicheroes.equipment;

import jav.decorator_pattern.magicheroes.Hero;

public class Shield extends Equipment{

    Hero upgrade;

    public Shield(Hero upgrade) {
        this.upgrade = upgrade;
    }

    @Override
    public String getEquipment() {
        return upgrade.getEquipment() + " + Mjolnir's Shield";
    }

    @Override
    public String getSkills() {
        return upgrade.getSkills() + " + Protection";
    }

    @Override
    public int powerful() {
        return upgrade.powerful() + 10;
    }
    @Override
    public String getName() {
        return upgrade.getName();
    }
}
