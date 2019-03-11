package com.example.inclassassignment07_meixuanl;

import java.io.Serializable;

public class SongInfo implements Serializable {

    private String name;
    private int id;
    private String artist;
    private boolean releasedThisYear;

    public SongInfo(String name,int id,String artist,boolean releasedThisYear){
        this.name = name;
        this.id = id;
        this.artist = artist;
        this.releasedThisYear = releasedThisYear;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public long getId() {
        return id;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getArtist() {
        return artist;
    }

    public void setReleasedThisYear(boolean releasedThisYear) {
        this.releasedThisYear = releasedThisYear;
    }

    public boolean getReleasedThisYear() {
        return releasedThisYear;
    }

    public String toString(){
        return "Song Name: " + name + "\nId: " + id + "\nArtist: " + artist + "\nIs the song released this year? " + releasedThisYear;
    }
}
