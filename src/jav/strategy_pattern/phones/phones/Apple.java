package jav.strategy_pattern.phones.phones;

import jav.strategy_pattern.phones.calltypes.CallingBehaviour;
import jav.strategy_pattern.phones.search_types.SearchBehaviour;
import jav.strategy_pattern.phones.calltypes.CallTelegram;
import jav.strategy_pattern.phones.search_types.ContactsInNumbersApp;

public class Apple implements Phone {

    private CallingBehaviour callb = new CallTelegram();
    private SearchBehaviour contb = new ContactsInNumbersApp();

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
