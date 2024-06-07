package main.java.Design_Pattern.Behavioral.Observer.TemperatureExample;

import main.java.Design_Pattern.Behavioral.Observer.TemperatureExample.Observers.TempObserver;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation {
    String temp;
    String humidity;
    String pressure;
    List<TempObserver> observers=new ArrayList<>();

    public void attach(TempObserver tempObserver){
        observers.add(tempObserver);
    }

    public void detach(TempObserver tempObserver){
        observers.remove(tempObserver);
    }

    public void setTemp(String temp,String humidity,String pressure){
        this.temp=temp;
        this.humidity=humidity;
        this.pressure=pressure;
        notifyObservers();
    }

    private void notifyObservers(){
        observers.forEach((observer)->{
            observer.UpdateTemp(temp,humidity,pressure);
        });
    }

}
