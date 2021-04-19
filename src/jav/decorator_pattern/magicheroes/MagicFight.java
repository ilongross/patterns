package jav.decorator_pattern.magicheroes;

import jav.decorator_pattern.magicheroes.equipment.Axe;
import jav.decorator_pattern.magicheroes.equipment.Bow;
import jav.decorator_pattern.magicheroes.equipment.Shield;
import jav.decorator_pattern.magicheroes.skills.Agility;
import jav.decorator_pattern.magicheroes.skills.Magic;
import jav.decorator_pattern.magicheroes.skills.Strength;
import jav.decorator_pattern.magicheroes.skills.Velosity;

import java.util.ArrayList;
import java.util.Arrays;

public class MagicFight {

    public static void main(String[] args) {
        ArrayList<Hero> heroes = new ArrayList<>();

        heroes.addAll(Arrays.asList(
                new Shield(new Axe(new Strength(new Viking()))),
                new Magic(new Agility(new Alien())),
                new Agility(new Velosity(new Bow(new Hobbit())))
        ));

        for (Hero hero : heroes){
            System.out.printf("--%s--\nEquipment: %s\nSkills: %s\nPowerful: %d\n\n",
                    hero.getName(),
                    hero.getEquipment(), hero.getSkills(), hero.powerful());
        }
    }
}
