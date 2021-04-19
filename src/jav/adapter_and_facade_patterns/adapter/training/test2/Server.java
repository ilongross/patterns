package jav.adapter_and_facade_patterns.adapter.training.test2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Server {

    private List<Client> systemsSettings = new ArrayList<>();

    public Server(Client ... systems) {
        this.systemsSettings.addAll(Arrays.asList(systems));
    }

    public void sendUpdates(){
        for (Client client : systemsSettings) {
            client.update();
        }
    }
}
