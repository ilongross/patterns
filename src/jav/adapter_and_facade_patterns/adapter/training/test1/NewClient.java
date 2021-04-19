package jav.adapter_and_facade_patterns.adapter.training.test1;

public class NewClient implements Client{
    Target target;

    public NewClient(Target target) {
        this.target = target;
    }

    @Override
    public void executeClient() {
        target.run();
        System.out.println(" and New Client");
    }
}
