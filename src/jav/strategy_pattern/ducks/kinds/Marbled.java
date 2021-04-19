package jav.strategy_pattern.ducks.kinds;

import jav.strategy_pattern.ducks.Duck;
import jav.strategy_pattern.ducks.FlyBehaviour;
import jav.strategy_pattern.ducks.QuackBehaviour;
import jav.strategy_pattern.ducks.kindsfly.FlyDown;
import jav.strategy_pattern.ducks.kindsquack.QuackCrawckCrawck;

public class Marbled implements Duck {
    private FlyBehaviour flyBehaviour;
    private QuackBehaviour quackBehaviour;

    public Marbled() {
        this.flyBehaviour = new FlyDown();
        this.quackBehaviour = new QuackCrawckCrawck();
    }

    @Override
    public void setQuackBehaviour(QuackBehaviour qb) {
        this.quackBehaviour = qb;
    }

    @Override
    public void setFlyBehaviour(FlyBehaviour fb) {
        this.flyBehaviour = fb;
    }

    @Override
    public void watch() {
        this.flyBehaviour.fly();
        this.quackBehaviour.quack();
    }
}
