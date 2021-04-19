package jav.strategy_pattern.phones.search_types;

public class ContactsInNumbersApp implements SearchBehaviour {
    @Override
    public void findNumber() {
        System.out.println("Searching in Numbers App");
    }
}
