package jav.adapter_and_facade_patterns.adapter.training.test1;

public class AnotherClient implements Client{

    Target target;

    public AnotherClient(Target target) {
        this.target = target;
    }

    @Override
    public void executeClient() {
        target.run();
        System.out.println(" and Another Client");
    }
}
