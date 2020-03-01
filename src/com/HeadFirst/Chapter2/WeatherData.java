package com.HeadFirst.Chapter2;


import java.util.Observable;



public class WeatherData extends Observable {


    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData() {
    }


    public void measurementsChanged(){
        setChanged();
        notifyObservers();
    }

    public void setMeasurements(float temperature, float humidity, float pressure){
        this.temperature = temperature;
        this.humidity = humidity ;
        this.pressure = pressure ;
        measurementsChanged();
    }

    public float getTemperature() {
        return temperature;
    } //为了满足观察者方拉数据， 当然也可以定义成推数据，则需要在notifyObservers方法中传参数

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }
}

