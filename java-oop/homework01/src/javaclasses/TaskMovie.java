package javaclasses;

public class TaskMovie {
    public static void main(String[] args) {

        Movie movie1 = new Movie("Titanic", "James Cameron", 1997);
        Movie movie2 = new Movie("Pearl Harbor", "Michael Bay", 2001);

        if (movie1.releaseYear < movie2.releaseYear) {
            System.out.println(movie1.title + ", directed by " + movie1.director + ", released in " + movie1.releaseYear + ", is older than " + movie2.title + ", directed by " + movie2.director + ", released in " + movie2.releaseYear + ".");
        } else if (movie1.releaseYear > movie2.releaseYear) {
            System.out.println(movie2.title + ", directed by " + movie2.director + ", released in " + movie2.releaseYear + ", is older than " + movie1.title + ", directed by " + movie1.director + ", released in " + movie1.releaseYear + ".");
        } else {
            System.out.println(movie1.title + ", directed by " + movie1.director + ", released in " + movie1.releaseYear + " and " + movie2.title + ", directed by " + movie2.director + ", released in " + movie2.releaseYear + ", were released in the same year.");
        }
    }
}
