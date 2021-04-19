package jav.adapter_and_facade_patterns.facade.home_movie_theatre.devices;

import java.util.ArrayList;
import java.util.List;

public class MovieLibrary {
    private List<Movie> movies = new ArrayList<>();

    public MovieLibrary(String ... movies) {
        for (String title : movies) {
            this.movies.add(new Movie(title));
        }
    }
    public Movie getMovie(String title) {
        for (Movie movie : movies) {
            if(movie.getTitle().equals(title))
                return movie;
        }
        return new NullMovie("Not exist");
    }

    private class NullMovie extends Movie{

        private String title;

        public NullMovie(String title) {
            super(title);
            this.title = title;
        }
        @Override
        public String getTitle() {
            return title;
        }
    }

    public static class Movie {
        private String title;

        public Movie(String title) {
            this.title = title;
        }
        public String getTitle() {
            return title;
        }
    }

}
