package com.bravetank.devdir.com.bravetank.models;

public class Skillset {

    private String language;
    private String imageURL;

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getImageURL() {
        return imageURL;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }

    public Skillset(String language, String imageURL) {
        this.language = language;
        this.imageURL = imageURL;


    }
}
