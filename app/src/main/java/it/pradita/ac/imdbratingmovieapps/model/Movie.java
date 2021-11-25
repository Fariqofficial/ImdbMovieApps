package it.pradita.ac.imdbratingmovieapps.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class Movie implements Serializable {

    @SerializedName("id")
    @Expose
    private String Id;

    @SerializedName("rank")
    @Expose
    private String Rank;

    @SerializedName("title")
    @Expose
    private String Title;

    @SerializedName("fullTitle")
    @Expose
    private String fullTitle;

    @SerializedName("year")
    @Expose
    private String Year;

    @SerializedName("image")
    @Expose
    private String Image;

    @SerializedName("crew")
    @Expose
    private String Crew;

    @SerializedName("imDbRating")
    @Expose
    private String imdbRating;

    @SerializedName("imDbRatingCount")
    @Expose
    private String imdbRatingCount;

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getRank() {
        return Rank;
    }

    public void setRank(String rank) {
        Rank = rank;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getFullTitle() {
        return fullTitle;
    }

    public void setFullTitle(String fullTitle) {
        this.fullTitle = fullTitle;
    }

    public String getYear() {
        return Year;
    }

    public void setYear(String year) {
        Year = year;
    }

    public String getImage() {
        return Image;
    }

    public void setImage(String image) {
        Image = image;
    }

    public String getCrew() {
        return Crew;
    }

    public void setCrew(String crew) {
        Crew = crew;
    }

    public String getImdbRating() {
        return imdbRating;
    }

    public void setImdbRating(String imdbRating) {
        this.imdbRating = imdbRating;
    }

    public String getImdbRatingCount() {
        return imdbRatingCount;
    }

    public void setImdbRatingCount(String imdbRatingCount) {
        this.imdbRatingCount = imdbRatingCount;
    }
}
