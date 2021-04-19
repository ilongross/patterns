package jav.adapter_and_facade_patterns.facade.operations;

import jav.adapter_and_facade_patterns.facade.operations.types_operations.*;

public class Client {
    public static void main(String[] args) {
        FacadeClass fc = new FacadeClass(
                new Back(), new Cycle(), new Jump(),
                new Repeat(), new Run(), new Stop(),
                new SuperSpeed());
        fc.standard();
        fc.cycles();
        fc.variable();
    }
}
