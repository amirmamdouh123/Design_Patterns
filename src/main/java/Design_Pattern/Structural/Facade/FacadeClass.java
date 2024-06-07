package main.java.Design_Pattern.Structural.Facade;

import main.java.Design_Pattern.Structural.Facade.EcoSystem.DVDPlayer;
import main.java.Design_Pattern.Structural.Facade.EcoSystem.Projector;
import main.java.Design_Pattern.Structural.Facade.EcoSystem.SoundSystem;

//controller
public class FacadeClass {

    DVDPlayer dvdPlayer;
    Projector projector;
    SoundSystem soundSystem;

    public FacadeClass(DVDPlayer dvdPlayer, Projector projector, SoundSystem soundSystem) {
        this.dvdPlayer = dvdPlayer;
        this.projector = projector;
        this.soundSystem = soundSystem;
    }

    public void watchMovie(){
        System.out.println("Getting ready for Watching a Film ");
        projector.on();
        dvdPlayer.on();
        dvdPlayer.playingMovie();
        soundSystem.on();
        soundSystem.setVolume(100);
    }

    public void endMovie(){
        System.out.println("Clicking on Power off... ");
        soundSystem.off();
        dvdPlayer.off();
        projector.off();
    }


}
