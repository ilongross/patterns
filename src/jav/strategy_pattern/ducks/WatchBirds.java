package jav.strategy_pattern.ducks;

import jav.strategy_pattern.ducks.kinds.*;
import jav.strategy_pattern.ducks.kindsfly.FlyUp;
import jav.strategy_pattern.ducks.kindsquack.QuackCrawckCrawck;

import java.util.ArrayList;

public class WatchBirds {
    public static ArrayList<Duck> birds = new ArrayList<>();

    public static void main(String[] args) {
        birds.add(new Alabio());
        birds.add(new Canvasback());
        birds.add(new Domestic());
        birds.add(new Mallard());
        birds.add(new Marbled());

        for (Duck bird : birds) {
            System.out.println("Duck: " + bird.getClass().getSimpleName());
            bird.setFlyBehaviour(new FlyUp());
            bird.setQuackBehaviour(new QuackCrawckCrawck());
            bird.watch();
            System.out.println();
        }
    }
}
