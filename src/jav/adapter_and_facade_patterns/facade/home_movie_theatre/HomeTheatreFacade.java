package jav.adapter_and_facade_patterns.facade.home_movie_theatre;

import jav.adapter_and_facade_patterns.facade.home_movie_theatre.devices.*;

public class HomeTheatreFacade {

    private Amplifier amp;
    private Tuner tuner;
    private DvdPlayer dvd;
    private CdPlayer cd;
    private Projector projector;
    private TheaterLights lights;
    private Screen screen;
    private PopcornPopper popper;
    private MovieLibrary movies;

    public HomeTheatreFacade(Amplifier amp, Tuner tuner, DvdPlayer dvd,
                         CdPlayer cd, Projector projector, TheaterLights lights,
                         Screen screen, PopcornPopper popper, MovieLibrary movies) {
        this.amp = amp;
        this.tuner = tuner;
        this.dvd = dvd;
        this.cd = cd;
        this.projector = projector;
        this.lights = lights;
        this.screen = screen;
        this.popper = popper;
        this.movies = movies;
    }

    public void watchMovie(String movie) {
        System.out.println("Get ready to watch a movie... \"" + movie + "\"");
        popper.on();
        popper.pop();
        lights.dim(10);
        screen.down();
        projector.on();
        projector.wideScreenMode();
        amp.on();
        amp.setDvd(dvd);
        amp.setSurroundSound();
        amp.setVolume(5);
        dvd.on();
        dvd.addDiskToHardDrive(movie);
        dvd.play(movie);
    }

    public void endMovie() {
        System.out.println("Shutting movie theater down...");
        popper.off();
        lights.on();
        screen.up();
        projector.off();
        amp.off();
        dvd.stop();
        dvd.eject();
        dvd.off();
    }
}
