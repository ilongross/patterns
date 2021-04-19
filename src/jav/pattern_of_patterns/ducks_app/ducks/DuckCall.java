package jav.pattern_of_patterns.ducks_app.ducks;

import jav.observer_pattern.subscribe.Observer;
import jav.pattern_of_patterns.ducks_app.interfaces.Quackable;

public class DuckCall implements Quackable {
    @Override
    public void quack() {
        System.out.println("Kwak");
    }

    @Override
    public void registerObserver(Observer observer) {

    }

    @Override
    public void notifyObservers() {

    }
}
