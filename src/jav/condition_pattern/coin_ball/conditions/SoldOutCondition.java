package jav.condition_pattern.coin_ball.conditions;

import jav.condition_pattern.coin_ball.VendingMachine;

public class SoldOutCondition implements Condition{

    private String description = "Все жевачки проданы.";
    VendingMachine vender;

    public SoldOutCondition(VendingMachine vender) {
        this.vender = vender;
    }

    @Override
    public void insertCoin() {
        System.out.println("Жевачки кончились. Заберите монетку.");
        this.takeAwayCoin();
    }

    @Override
    public void getGumBall() {
        System.out.println("Жевачки закончились.");
        vender.setCondition(vender.getNoCoin());
    }

    @Override
    public void takeAwayCoin() {
        System.out.println("Выдается монетка...");
        vender.getNoCoin();
    }

    @Override
    public String toString() {
        return description;
    }
}
