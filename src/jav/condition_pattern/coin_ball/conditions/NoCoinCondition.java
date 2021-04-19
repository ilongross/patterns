package jav.condition_pattern.coin_ball.conditions;


import jav.condition_pattern.coin_ball.VendingMachine;

public class NoCoinCondition implements Condition{

    private String description = "Нет монетки";
    private VendingMachine vender;

    public NoCoinCondition(VendingMachine vender) {
        this.vender = vender;
    }

    @Override
    public void insertCoin() {
        System.out.println("Люся вставила монетку.");
        vender.setCondition(vender.getHasCoin());
    }
    @Override
    public void getGumBall() {
        System.out.println("Вставьте монету.");
    }
    @Override
    public void takeAwayCoin() {
        System.out.println("Вставьте монету.");
    }
    @Override
    public String toString() {
        return description;
    }
}
