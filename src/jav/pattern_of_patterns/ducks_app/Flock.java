package jav.pattern_of_patterns.ducks_app;

import jav.observer_pattern.subscribe.Observer;
import jav.pattern_of_patterns.ducks_app.interfaces.Quackable;

import java.util.ArrayList;
import java.util.Iterator;

public class Flock implements Quackable {

    ArrayList<Quackable> quackers = new ArrayList();

    public void add(Quackable quacker) {
        quackers.add(quacker);
    }

    @Override
    public void quack() {
        Iterator iterator = quackers.iterator();
        while(iterator.hasNext()) {
            Quackable quacker = (Quackable) iterator.next();
            quacker.quack();
        }
    }

    @Override
    public void registerObserver(Observer observer) {
        Quackable quackable = (Quackable) observer;
        quackers.add(quackable);
    }

    @Override
    public void notifyObservers() {

    }
}