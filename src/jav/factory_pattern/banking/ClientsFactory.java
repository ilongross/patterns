package jav.factory_pattern.banking;

public abstract class ClientsFactory {

    public Client createClient(String bankName) {
        Client client;
        client = newClient(bankName);
        client.accountOpeningRequest();
        client.paperworking();
        return client;
    }
    protected abstract Client newClient(String bank);
}
