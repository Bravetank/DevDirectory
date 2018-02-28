package com.bravetank.devdir.com.bravetank.models;

import java.util.Arrays;

public class Developer {
    private String name;
    private String city;
    private String imageURL;
    private String language;


    public Developer(String name, String city, String imageURL, String language) {
        this.name = name;
        this.city = city;
        this.imageURL = imageURL;
        this.language = language;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getImageURL() {
        return imageURL;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

}