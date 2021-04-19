package jav.observer_pattern.weatherApp;

public class ForecastDisplay implements DisplayElement, Observer{
    private float temperature;
    private float humidity;
    private float pressure;
    private Subject weatherData;

    public ForecastDisplay(Subject weatherData) {
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
        boolean forecast;
        if((temperature + humidity + pressure) > 180)
            forecast = true;
        else
            forecast = false;
        System.out.println(forecast ? "Sunny !)))" : "Cloudy :(");
    }
}
