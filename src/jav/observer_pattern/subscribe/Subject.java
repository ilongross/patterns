package jav.observer_pattern.subscribe;

public interface Subject {
    public void addObserver(Observer observer);

    public void removeObserver(Observer observer);

    public void notifyObservers();
}
