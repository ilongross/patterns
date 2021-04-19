package jav.observer_pattern.weatherApp;

public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        Observer currentDisplay =
                new CurrentConditionsDisplay(weatherData);
        Observer statDisplay =
                new StatisticsDisplay(weatherData);
        Observer forecastDisplay =
                new ForecastDisplay(weatherData);

        weatherData.removeObserver(forecastDisplay);
        weatherData.setMeasurements(80, 65, 30.4F);
        System.out.println();
        weatherData.setMeasurements(82, 70, 29.2F);
        System.out.println();
        weatherData.setMeasurements(78, 90, 29.2F);
    }
}
