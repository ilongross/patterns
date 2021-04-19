package jav.pattern_of_patterns.ducks_app.factory;

import jav.pattern_of_patterns.ducks_app.QuackCounter;
import jav.pattern_of_patterns.ducks_app.ducks.DuckCall;
import jav.pattern_of_patterns.ducks_app.ducks.MallardDuck;
import jav.pattern_of_patterns.ducks_app.ducks.ReadheadDuck;
import jav.pattern_of_patterns.ducks_app.ducks.RubberDuck;
import jav.pattern_of_patterns.ducks_app.interfaces.Quackable;

public class CountingDuckFactory extends AbstractDuckFactory{
    @Override
    public Quackable createMallardDuck() {
        return new QuackCounter(new MallardDuck());
    }

    @Override
    public Quackable createReadHeadDuck() {
        return new QuackCounter(new ReadheadDuck());
    }

    @Override
    public Quackable createDuckCall() {
        return new QuackCounter(new DuckCall());
    }

    @Override
    public Quackable createRubberduck() {
        return new QuackCounter(new RubberDuck());
    }
}
