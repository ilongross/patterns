package jav.adapter_and_facade_patterns.facade.home_movie_theatre;

import jav.adapter_and_facade_patterns.facade.home_movie_theatre.devices.*;

public class Watching {
    public static void main(String[] args) {
        HomeTheatreFacade theater = new HomeTheatreFacade(
                        new Amplifier(), new Tuner(), new DvdPlayer(),
                        new CdPlayer(), new Projector(), new TheaterLights(),
                        new Screen(), new PopcornPopper(), new MovieLibrary());
        theater.watchMovie("Avatar");
        System.out.println();
        theater.endMovie();
    }
}
