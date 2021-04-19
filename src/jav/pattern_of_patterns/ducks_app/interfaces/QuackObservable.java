package jav.pattern_of_patterns.ducks_app.interfaces;

import jav.observer_pattern.subscribe.Observer;

public interface QuackObservable {
    public void registerObserver(Observer observer);
    public void notifyObservers();
}
