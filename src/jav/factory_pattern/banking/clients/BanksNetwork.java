package jav.factory_pattern.banking.clients;

import jav.factory_pattern.banking.Client;
import jav.factory_pattern.banking.ClientsFactory;

public class BanksNetwork extends ClientsFactory {
    @Override
    public Client newClient(String bank) {
        if(bank.equals("tinkoff"))
            return new TinkoffClient();
        if(bank.equals("alfabank"))
            return new AlfaBankClient();
        if(bank.equals("sber"))
            return new SberClient();
        if(bank.equals("homecredit"))
            return new HomeCreditClient();
        else return null;
    }
}
