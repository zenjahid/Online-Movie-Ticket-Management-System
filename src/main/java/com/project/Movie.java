package com.project;

interface details {
    void detail();
}

public abstract class Movie implements details {
    private String movie_name, director, rating, release_date;
    private String cast, budget, duration;
    private int movie_id, movie_seat = 300;
    private double price = 400;

    public Movie() {
    }

    public int id_getter() {
        return this.movie_id;
    }

    public int movie_seat_getter() {
        return this.movie_seat;
    }

    public void price_det(int ticket_count) {
        this.movie_seat -= ticket_count;
        System.out.println("\n======================================================");
        System.out.println("Movie ID\tPrice\tQuantity\tTotal Price");
        System.out
                .println(this.movie_id + "\t\t" + this.price + "\t   " + ticket_count + "\t          "
                        + (ticket_count * price));
        System.out.println("======================================================");
        System.out.println();

    }

    public void price_ref_det(int ticket_count) {
        if (this.movie_seat + ticket_count <= 300) {
            this.movie_seat += ticket_count;
            System.out.println("\n======================================================");
            System.out.println("Movie ID\tPrice\tQuantity\tTotal Refunded");
            System.out
                    .println(this.movie_id + "\t\t" + this.price + "\t   " + ticket_count + "\t          "
                            + (ticket_count * price));
            System.out.println("======================================================");
        } else
            System.out.println("This many tickets were not sold\nRefund invalid\n");

        System.out.println();

    }

    public Movie(String movie_name, String director, String rating, String release_date, String budget, String cast,
            String duration) {
        this.movie_name = movie_name;
        this.director = director;
        this.rating = rating;
        this.release_date = release_date;
        this.budget = budget;
        this.cast = cast;
        this.duration = duration;
    }

    public Movie(String movie_name, String director, String rating, String release_date, String budget, String cast,
            String duration, int movie_id) {
        this(movie_name, director, rating, release_date, budget, cast, duration);
        this.movie_id = movie_id;
    }

    public void detail() {
        System.out.println("The movie ID = " + this.movie_id);
        System.out.println("The Movie Name = " + this.movie_name);
        System.out.println("Release Date = " + this.release_date);
        System.out.println("Director = " + this.director);
        System.out.println("Cast = " + this.cast);
        System.out.println("Budget = " + this.budget);
        System.out.println("Duration = " + this.duration);
        System.out.println("Rating = " + this.rating);

    }

    abstract void movie_dettails_genre();
}

class genre_wise_movie extends Movie {
    private String genre;

    genre_wise_movie() {
    }

    String GenreGetter() {
        return this.genre;
    }

    genre_wise_movie(String movie_name, String director, String rating, String release_date, String budget, String cast,
            String duration, int movie_id, String genre) {
        super(movie_name, director, rating, release_date, budget, cast, duration, movie_id);
        this.genre = genre;
    }

    public void movie_dettails_genre() {
        detail();
        System.out.println("Genre = " + this.genre);
    }

}
