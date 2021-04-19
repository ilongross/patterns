package jav.observer_pattern.bank_advertise;

import java.util.List;

public class Male1 extends Client{

    Bank bank;

    public Male1(Bank bank) {
        this.bank = bank;
        bank.addClient(this);
    }

    @Override
    public void getAdvertise(List<String> ads) {
        showListAds(ads);
    }
}
