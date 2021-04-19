package jav.factory_pattern.banking;

import jav.factory_pattern.banking.clients.BanksNetwork;

import java.util.ArrayList;
import java.util.Random;

public class Bank {

    public static ArrayList<String> banks = new ArrayList<>();

    public static String bestDeal() {
        Random rand = new Random();
        return banks.get(rand.nextInt(banks.size()));
    }

    public static void main(String[] args) {
        BanksNetwork network = new BanksNetwork();
        banks.add("tinkoff");
        banks.add("sber");
        banks.add("homecredit");
        banks.add("alfabank");

        for (int i = 0; i < 10; i++) {
            network.createClient(bestDeal());
            System.out.println();
        }
    }
}
