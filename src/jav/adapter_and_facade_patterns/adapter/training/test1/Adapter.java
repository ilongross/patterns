package jav.adapter_and_facade_patterns.adapter.training.test1;

public class Adapter implements Target{

    Adaptee adaptee;

    public Adapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void run() {
        adaptee.execute();
    }
}
