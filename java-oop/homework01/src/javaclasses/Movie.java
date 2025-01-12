package javaclasses;

/* Create a class Movie with attributes title, director, and release year.
Create two different movies and determine which movie is more recent. */

public class Movie {

    String title;
    String director;
    int releaseYear;

    public Movie() {

    }

    public Movie(String title, String director, int releaseYear) {
        this.title = title;
        this.director = director;
        this.releaseYear = releaseYear;
    }
}
