package jav.strategy_pattern.phones.phones;

import jav.strategy_pattern.phones.calltypes.CallingBehaviour;
import jav.strategy_pattern.phones.search_types.SearchBehaviour;

public interface Phone {
    void use();
    void setCalling(CallingBehaviour callb);
    void setContact(SearchBehaviour contb);
}
