package main.java.Design_Pattern.Behavioral.Observer.TemperatureExample;

import main.java.Design_Pattern.Behavioral.Observer.TemperatureExample.Observers.CurrentConditionsDisplayChannel1;
import main.java.Design_Pattern.Behavioral.Observer.TemperatureExample.Observers.CurrentConditionsDisplayInChannel2;
import main.java.Design_Pattern.Behavioral.Observer.TemperatureExample.Observers.CurrentConditionsDisplayInChannel3;

public class run {
    public static void main(String[] args){
        CurrentConditionsDisplayChannel1 alexTemp =new CurrentConditionsDisplayChannel1();
        CurrentConditionsDisplayInChannel2 cairoTemp =new CurrentConditionsDisplayInChannel2();
        CurrentConditionsDisplayInChannel3 luxorTemp=new CurrentConditionsDisplayInChannel3();

        WeatherStation subject=new WeatherStation();

        subject.attach(alexTemp);
        subject.attach(cairoTemp);
        subject.attach(luxorTemp);

        subject.setTemp("10o","15F","20M");
    }
}
