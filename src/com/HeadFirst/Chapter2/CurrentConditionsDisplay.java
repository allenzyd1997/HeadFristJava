package com.HeadFirst.Chapter2;

import java.util.Observable;
import java.util.Observer;

public class  CurrentConditionsDisplay implements Observer, DisplayElement {

    private float temperature;
    private float humidity;
    Observable observable;

    @Override
    public void display() {
        System.out.println("Current conditions: " + temperature + "F degrees and " + humidity + "% humidity");
    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof WeatherData){
            WeatherData wd = (WeatherData)o;
            this.temperature = wd.getTemperature();
            this.humidity = wd.getHumidity();
            display();
        }
    }

    public CurrentConditionsDisplay(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

}
