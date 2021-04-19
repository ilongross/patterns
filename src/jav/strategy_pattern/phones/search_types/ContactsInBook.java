package jav.strategy_pattern.phones.search_types;

public class ContactsInBook implements SearchBehaviour {
    @Override
    public void findNumber() {
        System.out.println("Searching in book");
    }
}
