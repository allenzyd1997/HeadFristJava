package com.HeadFirst.Chapter2;

public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
        weatherData.setrMeasurements(80, 65, 30.4f);
        weatherData.setrMeasurements(82, 70, 29.2f);
        weatherData.setrMeasurements(78, 90, 29.2f);

    }
}
