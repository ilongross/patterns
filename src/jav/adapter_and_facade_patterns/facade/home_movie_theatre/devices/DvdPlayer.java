package jav.adapter_and_facade_patterns.facade.home_movie_theatre.devices;

import java.util.ArrayList;
import java.util.List;

public class DvdPlayer {

    List<MovieLibrary.Movie> hardDrive = new ArrayList<>();

    public void on() {
        System.out.println("DVD player is ON");
    }
    public void off() {
        System.out.println("DVD player is OFF");
    }
    public void play(String title) {
        for (MovieLibrary.Movie movie : hardDrive) {
            if(movie.getTitle().equals(title)) {
                System.out.println("Movie \"" + title + "\" is beginning...");
            }
            else
                System.out.println("Not exist.");
        }
    }
    public void stop() {
        System.out.println("Movie is stopped");
    }
    public void eject() {
        System.out.println("Disk ejected");
    }

    public void addDiskToHardDrive(String ... movies) {
        for (String movie : movies) {
            hardDrive.add(new MovieLibrary.Movie(movie));
        }
    }

}
