package jav.adapter_and_facade_patterns.adapter.training.test2;

public class AdapterOS implements Client {

    private OperationSystem os;

    public AdapterOS(OperationSystem os) {
        this.os = os;
    }

    @Override
    public void update() {
        os.setup();
    }
}
