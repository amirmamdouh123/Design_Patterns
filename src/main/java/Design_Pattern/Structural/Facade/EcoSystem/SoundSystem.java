package main.java.Design_Pattern.Structural.Facade.EcoSystem;

public class SoundSystem {

    public void on(){
        System.out.println("SoundSystem is on...");
    }
    public void setVolume(int level){
        System.out.println("Setting volume to "+level);

    }
    public void off(){
        System.out.println("SoundSystem is off...");
    }
}
