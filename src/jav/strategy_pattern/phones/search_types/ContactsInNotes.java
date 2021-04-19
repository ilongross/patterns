package jav.strategy_pattern.phones.search_types;

public class ContactsInNotes implements SearchBehaviour {

    @Override
    public void findNumber() {
        System.out.println("Searching in notes");
    }
}
