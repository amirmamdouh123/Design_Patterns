package main.java.Design_Pattern.Behavioral.Observer.TemperatureExample.Observers;

public interface TempObserver {

    public void UpdateTemp(String temp, String humidity ,String pressure);
    public void DisplayTemp();

}
