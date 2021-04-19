package jav.factory_pattern.learn_app;

import java.util.Random;

public class SimplePrimitiveNumbersFactory {

    private char[] primitiveNumberTypes = {'i', 'f', 'l', 'd'};

    public Primitive getPrimitive() {
        Random rand = new Random();
        char type = primitiveNumberTypes[rand.nextInt(4)];
        return getPrimitive(type);
    }

    private Primitive getPrimitive(char type) {
        return new Primitive(type);
    }
}
