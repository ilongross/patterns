package jav.observer_pattern.weatherApp;

public interface Observer {
    void update(float temp, float humidity, float pressure);
}
