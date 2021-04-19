package jav.strategy_pattern.phones.calltypes;

public class CallMobile implements CallingBehaviour{
    @Override
    public void call() {
        System.out.println("Calling by Mobile Network");
    }
}
