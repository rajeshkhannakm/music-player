package com.example.rajeshkhanna.musicplayer;


public class Song {

    private long id;
    private String title;
    private String artist;

    public Song(long songID, String songTitle, String songArtist){
        this.id = songID;
        this.title = songTitle;
        this.artist =  songArtist;
    }

    public long getID() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }
}
