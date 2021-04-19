package jav.pattern_of_patterns.ducks_app.interfaces;

public class Quackologist implements Observer{

    @Override
    public void update(QuackObservable duck) {
        System.out.println("Quackologist: " + duck + " just quacked.");
    }
}
