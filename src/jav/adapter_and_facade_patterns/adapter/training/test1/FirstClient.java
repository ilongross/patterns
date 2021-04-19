package jav.adapter_and_facade_patterns.adapter.training.test1;

public class FirstClient implements Client{
    Target target;

    public FirstClient(Target target) {
        this.target = target;
    }

    public void executeClient() {
        target.run();
        System.out.println(" and First Client");
    }
}
