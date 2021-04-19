package jav.condition_pattern.coin_ball;


import jav.condition_pattern.coin_ball.conditions.*;

import java.util.Random;

public class VendingMachine {

    private static VendingMachine uniqueVender;

    private Condition hasCoin;
    private Condition noCoin;
    private Condition sold;
    private Condition soldOut;

    private Condition condition;
    private int ballsCounter = 0;

     private VendingMachine() {
         hasCoin = new HasCoinCondition(this);
         noCoin = new NoCoinCondition(this);
         sold = new SoldCondition(this);
         soldOut = new SoldOutCondition(this);
         condition = noCoin;
    }

    public void insertCoin() {
         condition.insertCoin();
    }
    public void getGumBall() {
         condition.getGumBall();
    }
    public void takeAwayCoin() {
         condition.takeAwayCoin();
    }

    public void fillMachine(int balls) {
         this.ballsCounter = this.ballsCounter + balls;
         condition = noCoin;
    }

    public void setCondition(Condition condition) {
        this.condition = condition;
    }
    public int getBalls() {
        return ballsCounter;
    }

    public Condition getCondition() {
        return condition;
    }

    public Condition getHasCoin() {
        return hasCoin;
    }
    public Condition getNoCoin() {
        return noCoin;
    }
    public Condition getSold() {
        return sold;
    }
    public Condition getSoldOut() {
        return soldOut;
    }
    public void setBalls(int ballsCounter) {
        this.ballsCounter = ballsCounter;
    }
    public void setHasCoin(Condition hasCoin) {
        this.hasCoin = hasCoin;
    }
    public void setNoCoin(Condition noCoin) {
        this.noCoin = noCoin;
    }
    public void setSold(Condition sold) {
        this.sold = sold;
    }
    public void setSoldOut(Condition soldOut) {
        this.soldOut = soldOut;
    }

    public static VendingMachine getVender() {
         if(uniqueVender == null)
             return new VendingMachine();
         else
             return uniqueVender;
    }

    @Override
    public String toString() {
        return "Текущее состояние автомата: " + condition + "\n" +
                "Вендинговый автомат: " + ballsCounter + " жевачек";
    }
}
