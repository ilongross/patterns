package jav.adapter_and_facade_patterns.adapter.training.test2;

public class Windows implements OperationSystem {


    @Override
    public void setup() {
        System.out.println("Windows update");
    }
}
