package com.koro.movies.model;

public class Movie {

    private long id;
    private String title;
    private String director;
    private int yearOfPremiere;

    public Movie(long id, String title, String director, int yearOfPremiere) {
        this.id = id;
        this.title = title;
        this.director = director;
        this.yearOfPremiere = yearOfPremiere;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getYearOfPremiere() {
        return yearOfPremiere;
    }

    public void setYearOfPremiere(int yearOfPremiere) {
        this.yearOfPremiere = yearOfPremiere;
    }
}
