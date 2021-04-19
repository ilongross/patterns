package jav.observer_pattern.bank_advertise;

import java.util.List;

public abstract class Client {
    public abstract void getAdvertise(List<String> ads);

    public void showListAds(List<String> ads) {
//        System.out.println(getClass().getSimpleName() + " get new mail from bank.");
//        System.out.println("Current credit advertise:");
        for (String ad : ads) {
            System.out.println(ad);
        }
        System.out.println("---------------------");
    }
}
