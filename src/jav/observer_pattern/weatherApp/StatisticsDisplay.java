package jav.observer_pattern.weatherApp;

public class StatisticsDisplay implements DisplayElement, Observer{
    private float temperature;
    private float humidity;
    private float pressure;
    private Subject weatherData;

    public StatisticsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temperature = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }
    @Override
    public void display() {
        System.out.printf("Statistics now: %.2f percents; %.2f percents;  %.2f percents\n",
                temperature/150, humidity, pressure/150);
    }
}
