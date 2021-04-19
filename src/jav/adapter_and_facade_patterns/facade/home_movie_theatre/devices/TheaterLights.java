package jav.adapter_and_facade_patterns.facade.home_movie_theatre.devices;

public class TheaterLights {

    public void dim(int lvl) {
        System.out.println("Lights set on dim level: " + lvl);
    }
    public void on() {
        System.out.println("Day lights is ON");
    }
}
