package jav.decorator_pattern.training;

public class TestDecorators {

    public static void main(String[] args) {
        Component dec = new ConcreteObject();
        System.out.println(dec);

        Component dec1 = new Decorator1(dec);
        System.out.println(dec1);

        Component dec2 = new Decorator2(dec1);
        System.out.println(dec2);

        Component dec3 = new Decorator3(dec2);
        System.out.println(dec3);

    }
}
