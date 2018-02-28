package com.bravetank.devdir.com.bravetank.data;

;
import com.bravetank.devdir.com.bravetank.models.Skillset;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class SkillsetRepository {

    private static final List<Skillset> ALL_SKILLSETS = Arrays.asList(

            new Skillset("Java", "https://cdn.pixabay.com/photo/2017/05/12/08/29/coffee-2306471__340.jpg"),
            new Skillset("Javascript", "https://cdn.pixabay.com/photo/2017/11/06/11/12/music-2923374__340.jpg"),
            new Skillset("Python", "https://cdn.pixabay.com/photo/2014/11/23/21/22/green-tree-python-543243__340.jpg"),
            new Skillset("HTML", "https://cdn.pixabay.com/photo/2017/08/19/17/19/texture-2659241__340.jpg")
            );

    //Getter for whole list. Will need in GET method for index page in DevController.
    public List<Skillset> getAllSkillsets() {
        return ALL_SKILLSETS;
    }

    public Skillset findByLanguage(String language){
        for (Skillset skillset : ALL_SKILLSETS){
            if (skillset.getLanguage().equals(language)){
                return skillset;
            }
        } return null;
    }

}
