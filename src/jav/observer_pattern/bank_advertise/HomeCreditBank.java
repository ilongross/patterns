package jav.observer_pattern.bank_advertise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HomeCreditBank implements Bank{

    List<String> credits = new ArrayList<>();

    List<Client> clients = new ArrayList<>();

    public void addCreditAds(String ... ads) {
        this.credits.addAll(Arrays.asList(ads));
        notifyClients();
    }

    public void removeCreditAds(String ... ads) {
        this.credits.removeAll(Arrays.asList(ads));
        notifyClients();
    }

    @Override
    public void addClient(Client client) {
        this.clients.add(client);
    }

    @Override
    public void removeClient(Client client) {
        this.clients.remove(client);
    }

    @Override
    public void notifyClients() {
        int i = 1;
        for (Client client : this.clients) {
            System.out.println(i++);
            client.getAdvertise(this.credits);
        }
    }
}
