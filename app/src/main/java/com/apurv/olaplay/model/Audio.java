package com.apurv.olaplay.model;


import java.io.Serializable;

/**
 * Created by Apurv Pandey on 16/12/17.
 * mailapurvpandey@gmail.com
 * Contact No. - +91-8377887369
 */
public class Audio implements Serializable {

    private String song;
    private String url;
    private String artists;
    private String coverImage;

    public Audio(String song, String url, String artists, String coverImage) {
        this.song = song;
        this.url = url;
        this.artists = artists;
        this.coverImage = coverImage;
    }

    public String getSong() {
        return song;
    }

    public void setSong(String song) {
        this.song = song;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getArtists() {
        return artists;
    }

    public void setArtists(String artists) {
        this.artists = artists;
    }

    public String getCoverImage() {
        return coverImage;
    }

    public void setCoverImage(String coverImage) {
        this.coverImage = coverImage;
    }


}
