package jav.pattern_of_patterns.ducks_app;

import jav.pattern_of_patterns.ducks_app.factory.AbstractDuckFactory;
import jav.pattern_of_patterns.ducks_app.factory.CountingDuckFactory;
import jav.pattern_of_patterns.ducks_app.gooses.Goose;
import jav.pattern_of_patterns.ducks_app.gooses.GooseAdapter;
import jav.pattern_of_patterns.ducks_app.interfaces.Quackable;
import jav.pattern_of_patterns.ducks_app.interfaces.Quackologist;

public class DuckSimulator {
    public static void main(String[] args) {
        DuckSimulator simulator = new DuckSimulator();
        AbstractDuckFactory duckFactory = new CountingDuckFactory();

        simulator.simulate(duckFactory);
    }

    void simulate(AbstractDuckFactory duckFactory) {
        Quackable mallard = duckFactory.createMallardDuck();
        Quackable readhead = duckFactory.createReadHeadDuck();
        Quackable duckCall = duckFactory.createDuckCall();
        Quackable rubber = duckFactory.createRubberduck();
        Quackable goose = new GooseAdapter(new Goose());
        System.out.println("Duck Simulator: With Decorator Pattern");

        Flock flockOfDucks = new Flock();

        flockOfDucks.add(readhead);
        flockOfDucks.add(duckCall);
        flockOfDucks.add(rubber);
        flockOfDucks.add(goose);

        Flock flockOfMallards = new Flock();

        Quackable mallardOne = duckFactory.createMallardDuck();
        Quackable mallardTwo = duckFactory.createMallardDuck();
        Quackable mallardThree = duckFactory.createMallardDuck();
        Quackable mallardFour = duckFactory.createMallardDuck();

        flockOfMallards.add(mallardOne);
        flockOfMallards.add(mallardTwo);
        flockOfMallards.add(mallardThree);
        flockOfMallards.add(mallardFour);

        flockOfDucks.add(flockOfMallards);

        System.out.println("\nDuck simulator: With Observer");
        Quackologist quackologist = new Quackologist();
//        flockOfDucks.registerObserver(quackologist);
        simulate(flockOfDucks);

        System.out.println("The ducks quacked " +
                QuackCounter.getNumberOfQuacks() + " times");
    }

    void simulate(Quackable duck) {
        duck.quack();
    }
}
