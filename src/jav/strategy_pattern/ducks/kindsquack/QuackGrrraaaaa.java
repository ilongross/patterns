package jav.strategy_pattern.ducks.kindsquack;

import jav.strategy_pattern.ducks.QuackBehaviour;

public class QuackGrrraaaaa implements QuackBehaviour {
    @Override
    public void quack() {
        System.out.println("Grrraaaaaa");
    }
}
