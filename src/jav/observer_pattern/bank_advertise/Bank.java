package jav.observer_pattern.bank_advertise;

import java.util.List;

public interface Bank {
    public void addClient(Client client);
    public void removeClient(Client client);
    public void notifyClients();
}
