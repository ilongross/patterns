package jav.observer_pattern.subscribe;

import jav.pattern_of_patterns.ducks_app.interfaces.QuackObservable;

import java.util.List;

public interface Observer {
    public void handleEvent(List<String> vacancies);

    void update(QuackObservable duck);
}
