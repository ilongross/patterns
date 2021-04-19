package jav.proxy_pattern;

import jav.condition_pattern.coin_ball.VendingMachine;

public class VendingMonitor {

    VendingMachine vender;

    public VendingMonitor(VendingMachine vender) {
        this.vender = vender;
    }

    public void report() {
        System.out.printf(  "Current balls count: %d\n" +
                            "Current condition: %s\n", vender.getBalls(), vender.getCondition());
    }
}
