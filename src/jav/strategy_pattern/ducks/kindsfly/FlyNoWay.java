package jav.strategy_pattern.ducks.kindsfly;

import jav.strategy_pattern.ducks.FlyBehaviour;

public class FlyNoWay implements FlyBehaviour {
    @Override
    public void fly() {
        System.out.println("can't fly");
    }
}
