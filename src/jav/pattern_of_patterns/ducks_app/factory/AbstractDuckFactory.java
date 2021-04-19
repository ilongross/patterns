package jav.pattern_of_patterns.ducks_app.factory;

import jav.pattern_of_patterns.ducks_app.interfaces.Quackable;

public abstract class AbstractDuckFactory {
    public abstract Quackable createMallardDuck();
    public abstract Quackable createReadHeadDuck();
    public abstract Quackable createDuckCall();
    public abstract Quackable createRubberduck();
}