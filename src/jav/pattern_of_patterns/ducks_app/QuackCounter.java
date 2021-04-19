package jav.pattern_of_patterns.ducks_app;

import jav.pattern_of_patterns.ducks_app.interfaces.Observer;
import jav.pattern_of_patterns.ducks_app.interfaces.Quackable;

import java.util.ArrayList;
import java.util.Iterator;

public class QuackCounter implements Quackable {

    ArrayList observers = new ArrayList();
    Quackable duck;
    static int numberOfQuacks;

    public QuackCounter(Quackable duck) {
        this.duck = duck;
    }

    @Override
    public void quack() {
        duck.quack();
        numberOfQuacks++;
    }

    public static int getNumberOfQuacks() {
        return numberOfQuacks;
    }

    @Override
    public void registerObserver(jav.observer_pattern.subscribe.Observer observer) {

    }

    @Override
    public void notifyObservers() {
        Iterator iterator = observers.iterator();
        while(iterator.hasNext()) {
//            jav.pattern_of_patterns.ducks_app.interfaces.Observer
        }
    }
}
