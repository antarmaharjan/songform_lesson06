package me.ratna.springdemo;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Song {
    @NotNull
    //@Size(min = 1)
    private long id;

    @NotNull
    @Size(min=2,max = 25)
    private String name;
    @NotNull
    @Size(min = 1,max = 25)
    private String artist;
    @NotNull
    @Size(min = 1,max = 25)
    private String album;
    private int rating;
    private int year;


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}

