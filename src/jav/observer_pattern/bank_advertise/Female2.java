package jav.observer_pattern.bank_advertise;

import java.util.List;

public class Female2 extends Client{
    Bank bank;

    public Female2(Bank bank) {
        this.bank = bank;
        bank.addClient(this);
    }

    @Override
    public void getAdvertise(List<String> ads) {
        showListAds(ads);
    }
}
