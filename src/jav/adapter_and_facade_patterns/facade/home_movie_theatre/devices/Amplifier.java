package jav.adapter_and_facade_patterns.facade.home_movie_theatre.devices;

public class Amplifier {
    public void on() {
        System.out.println(getClass().getSimpleName() + " is ON");
    }
    public void setDvd(DvdPlayer dvd) {
        System.out.println(getClass().getSimpleName() + " set DVD");
    }
    public void setSurroundSound() {
        System.out.println(getClass().getSimpleName() + " set \"Surround Sound\"");
    }
    public void setVolume(int lvl) {
        System.out.println(getClass().getSimpleName() + " volume level:  " + lvl);
    }
    public void off() {
        System.out.println("Amplifier is shutting down...");
        System.out.println("Amplifier is OFF");
    }

}
