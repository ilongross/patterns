package jav.factory_pattern.learn_app;

public class App {
    public static void main(String[] args) {
        SimplePrimitiveNumbersFactory sf = new SimplePrimitiveNumbersFactory();
        PrimitivesGenerator pg = new PrimitivesGenerator(sf);
        for (int i = 0; i < 10; i++) {
            pg.generate();
        }
    }
}
