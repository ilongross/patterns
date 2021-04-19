package jav.observer_pattern.bank_advertise;

import java.util.List;

public class Male2 extends Client{
    Bank bank;

    public Male2(Bank bank) {
        this.bank = bank;
        bank.addClient(this);
    }

    @Override
    public void getAdvertise(List<String> ads) {
        showListAds(ads);
    }
}
