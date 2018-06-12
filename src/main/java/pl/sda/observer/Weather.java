package pl.sda.observer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Weather {

    private int curentTemperature;
    private List<Person> observers = new ArrayList<>();

    public void addObserver (Person... observer){
        observers.addAll(Arrays.asList(observer));
    }

    public float getCurentTemperature() {
        return curentTemperature;
    }

    public void setCurentTemperature(int curentTemperature) {
        this.curentTemperature = curentTemperature;
        notifyObservers();
    }

    private void notifyObservers() {
        for (Person observer : observers) {
            if (curentTemperature>observer.getTempMax()){
                observer.update(curentTemperature);
            }
        }
    }
}
