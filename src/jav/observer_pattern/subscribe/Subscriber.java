package jav.observer_pattern.subscribe;

import jav.pattern_of_patterns.ducks_app.interfaces.QuackObservable;

import java.util.List;

public class Subscriber implements Observer{

    String name;

    public Subscriber(String name) {
        this.name = name;
    }

    @Override
    public void handleEvent(List<String> vacancies) {
        System.out.println("Dear " + name + "\nWe have some changes in vacancies:\n" + vacancies +
                "\n======================================\n");
    }

    @Override
    public void update(QuackObservable duck) {

    }
}
