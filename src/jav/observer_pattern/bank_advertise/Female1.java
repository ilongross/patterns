package jav.observer_pattern.bank_advertise;

import java.util.List;

public class Female1 extends Client{

    Bank bank;

    public Female1(Bank bank) {
        this.bank = bank;
        bank.addClient(this);
    }

    @Override
    public void getAdvertise(List<String> ads) {
        showListAds(ads);
    }
}
