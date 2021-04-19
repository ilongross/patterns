package jav.factory_pattern.learn_app;

import java.util.Random;

public class Primitive {

    private String number = "";

    public Primitive(char type) {
        this.number = getRandom(type);
    }

    private String getRandom(char type) {
        Random rand = new Random();
        String number = "";
        switch (type) {
            case 'i':
                number = "INTEGER = " + rand.nextInt(10000000);
                break;
            case 'f':
                number = "FLOAT = " + rand.nextFloat();
                break;
            case 'l':
                number = "LONG = " + rand.nextLong();
                break;
            case 'd':
                number = "DOUBLE = " + rand.nextDouble();
                break;
            default:
                number = "Wrong CHAR";
        }
        return number;
    }

    @Override
    public String toString() {
        return number;
    }
}
