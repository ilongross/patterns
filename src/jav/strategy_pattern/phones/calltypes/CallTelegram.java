package jav.strategy_pattern.phones.calltypes;

public class CallTelegram implements CallingBehaviour {
    @Override
    public void call() {
        System.out.println("Calling by Telegram");
    }
}
