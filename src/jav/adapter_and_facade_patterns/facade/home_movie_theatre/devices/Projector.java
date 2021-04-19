package jav.adapter_and_facade_patterns.facade.home_movie_theatre.devices;

public class Projector {
    public void on() {
        System.out.println(getClass().getSimpleName() + " is ON");
    }
    public void off() {
        System.out.println(getClass().getSimpleName() + " is OFF");
    }
    public void wideScreenMode() {
        System.out.println(getClass().getSimpleName() + " setup widescreen");
    }
}
