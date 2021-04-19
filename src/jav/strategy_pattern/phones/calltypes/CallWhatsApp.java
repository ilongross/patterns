package jav.strategy_pattern.phones.calltypes;

public class CallWhatsApp implements CallingBehaviour {
    @Override
    public void call() {
        System.out.println("Calling by WhatsApp");
    }
}
