package jav.factory_pattern.learn_app;

public class PrimitivesGenerator {

    SimplePrimitiveNumbersFactory primitiveFactory;

    public PrimitivesGenerator(SimplePrimitiveNumbersFactory primitiveFactory) {
        this.primitiveFactory = primitiveFactory;
    }

    public void generate() {
        Primitive primitive = primitiveFactory.getPrimitive();
        System.out.println(primitive);
    }
}
