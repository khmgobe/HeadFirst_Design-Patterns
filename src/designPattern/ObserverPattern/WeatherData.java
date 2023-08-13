package designPattern.ObserverPattern;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject{

    private List<Observer> observers;
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData() {
        observers = new ArrayList<Observer>();
    }
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    // 모든 옵저버에게 상태 변화를 알려준다.
    public void notifyObservers(){
        for (Observer observer : observers) {
            observer.update();
        }
    }

    //기상 스테이션으로부터 갱신된 측정값 받을 시 옵저버에게 전달.
    public void measurementsChanged() {
        notifyObservers();
    }


    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

    public float getPressure() {
        return pressure;
    }
}
