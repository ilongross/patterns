package jav.condition_pattern.coin_ball.conditions;

import jav.condition_pattern.coin_ball.VendingMachine;

import java.util.Random;

public class HasCoinCondition implements Condition{

    private String description = "Монетка вставлена";
    VendingMachine vender;


    private Random rand = new Random();

    public HasCoinCondition(VendingMachine vender) {
        this.vender = vender;
    }

    @Override
    public void insertCoin() {
        System.out.println("Вставлена монета. Сначала нажмите кнопку \"Получить жевачку\"");
    }

    @Override
    public void getGumBall() {
        int drop = rand.nextInt(10);
        if(vender.getBalls() > 0) {
            System.out.print("Выдается жевачка... ");
            if((drop == 0) && (vender.getBalls() > 1)) {
                System.out.println(drop);
                System.out.println("Вы везуньчик!!! Вам выпало 2 жевачки!");
                vender.setBalls(vender.getBalls() - 2);
            }
            else {
                vender.setBalls(vender.getBalls() - 1);
                System.out.println("Возьмите жевачку.");
            }
            vender.setCondition(vender.getNoCoin());
        }
        else {
            System.out.println("Жевачки кончились. Заберите монетку.");
            vender.setCondition(vender.getSoldOut());
        }

    }

    @Override
    public void takeAwayCoin() {
        System.out.println("Выдается монетка...");
        vender.setCondition(vender.getNoCoin());
    }

    @Override
    public String toString() {
        return description;
    }
}
