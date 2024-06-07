package main.java.Design_Pattern.Behavioral.Observer.TemperatureExample.Observers;

public class CurrentConditionsDisplayChannel1 implements TempObserver{
    String temp;
    String humidity;
    String pressure;
    @Override
    public void UpdateTemp(String temp, String humidity, String pressure) {
        this.temp=temp;
        this.humidity=humidity;
        this.pressure=pressure;
        DisplayTemp();

    }
    @Override
    public void DisplayTemp(){
        System.out.println("In Alex");
        System.out.println("Temperature: "+temp+" ,Humidity: "+humidity+" ,pressure: "+pressure);
    }
}
