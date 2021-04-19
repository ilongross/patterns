package jav.condition_pattern.coin_ball.conditions;

import jav.condition_pattern.coin_ball.VendingMachine;

public class SoldCondition implements Condition{

    private String description = "Жевачка выдана. Нет монетки.";
    VendingMachine vender;

    public SoldCondition(VendingMachine vender) {
        this.vender = vender;
    }

    @Override
    public void insertCoin() {
        if(vender.getBalls() == 0) {
            System.out.println("Жевачки закончились. Не вставляйте монетку.");
            vender.setCondition(vender.getSoldOut());
        }
        else {
            System.out.println("Вставьте монету.");
            vender.setCondition(vender.getNoCoin());
        }
    }

    @Override
    public void getGumBall() {
        if(vender.getBalls() == 0) {
            System.out.println("Жевачки закончились.");
            vender.setCondition(vender.getNoCoin());
        }
        else {
            System.out.println("Вставьте монету.");
            vender.setCondition(vender.getNoCoin());
        }
    }

    @Override
    public void takeAwayCoin() {
        System.out.println("Вставьте монету.");
        vender.setCondition(vender.getNoCoin());
    }

    @Override
    public String toString() {
        return description;
    }
}
