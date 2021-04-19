package jav.adapter_and_facade_patterns.adapter.training.test2;

public class MacOS implements OperationSystem{
    @Override
    public void setup() {
        System.out.println("MacOS update");
    }
}
