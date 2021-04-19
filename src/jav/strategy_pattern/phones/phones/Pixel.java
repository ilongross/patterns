package jav.strategy_pattern.phones.phones;

import jav.strategy_pattern.phones.calltypes.CallingBehaviour;
import jav.strategy_pattern.phones.search_types.SearchBehaviour;
import jav.strategy_pattern.phones.calltypes.CallWhatsApp;
import jav.strategy_pattern.phones.search_types.ContactsInBook;

public class Pixel implements Phone {

    private CallingBehaviour callb = new CallWhatsApp();
    private SearchBehaviour contb = new ContactsInBook();

    public void call() {
        callb.call();
    }

    public void contact() {
        contb.findNumber();
    }


    @Override
    public void use() {
        call();
        contact();
    }

    @Override
    public void setCalling(CallingBehaviour callb) {
        this.callb = callb;
    }

    @Override
    public void setContact(SearchBehaviour contb) {
        this.contb = contb;
    }
}
