package com.bravetank.devdir.com.bravetank.data;

import com.bravetank.devdir.com.bravetank.models.Developer;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//For in Memory Storage using a simple Java List - using method Arrays.asList

@Component
public class DeveloperRepository {
    private static final List<Developer> ALL_DEVELOPERS = Arrays.asList(
    new Developer("Bravetank", "Swansea", "https://cdn.pixabay.com/photo/2018/02/16/02/03/elephant-3156768__340.png", "Java"),
    new Developer("TeriShelly", "Cardiff", "https://cdn.pixabay.com/photo/2014/10/02/15/43/zebra-470305__340.png", "Javascript"),
    new Developer("Deks", "RealMadrid", "https://cdn.pixabay.com/photo/2016/09/12/13/11/pug-1664217__340.png", "Python"),
    new Developer("SleepyPete", "Abertawe", "https://cdn.pixabay.com/photo/2014/10/04/22/29/monkey-474147__340.png", "HTML"),
            new Developer("Seashell", "Rome", "https://cdn.pixabay.com/photo/2014/04/03/10/52/spider-311548__340.png", "Java")
    );

    //Method below searches through the list above checking each object with the getName method to find out the name & checks if its the same as the name that was submitted. If it is it returns the whole developer object.

    public Developer findByName(String name){
        for(Developer developer : ALL_DEVELOPERS ){
            if(developer.getName().equals(name)){
                return developer;
            }
        } return null;
    }

    //Getter for whole list. Will need in GET method for index page in DevController.
    public List<Developer> getAllDevelopers() {
        return ALL_DEVELOPERS;
    }


    //Getter for developers by Language
    public List<Developer> findByLanguage(String language) {
        List<Developer>developers = new ArrayList<>();
        for(Developer developer : ALL_DEVELOPERS ){
            if(developer.getLanguage().equals(language)){
                developers.add(developer);
            }
        } return developers;

    }
}
