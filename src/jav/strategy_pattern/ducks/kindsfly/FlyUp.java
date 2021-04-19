package jav.strategy_pattern.ducks.kindsfly;

import jav.strategy_pattern.ducks.FlyBehaviour;

public class FlyUp implements FlyBehaviour {
    @Override
    public void fly() {
        System.out.println("Fly to the riseup!");
    }
}
