package jav.adapter_and_facade_patterns.adapter.training.test1;

public class Test {
    public static void main(String[] args) {
        Adaptee adaptee = new Adaptee();
        Adapter adapter = new Adapter(adaptee);
        Client client1 = new FirstClient(adapter);
        Client client2 = new NewClient(adapter);
        Client client3 = new AnotherClient(adapter);
        client1.executeClient();
        client2.executeClient();
        client3.executeClient();
    }
}
