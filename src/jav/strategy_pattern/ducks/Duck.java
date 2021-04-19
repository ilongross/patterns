package jav.strategy_pattern.ducks;

public interface Duck {
    void watch();
    void setQuackBehaviour(QuackBehaviour qb);
    void setFlyBehaviour(FlyBehaviour fb);
}
