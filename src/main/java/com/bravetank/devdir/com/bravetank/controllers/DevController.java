package com.bravetank.devdir.com.bravetank.controllers;

import com.bravetank.devdir.com.bravetank.data.DeveloperRepository;
import com.bravetank.devdir.com.bravetank.models.Developer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;



@Controller
public class DevController {

    @Autowired  //This tells Spring to construct & assign a GifRepository object to this instance field as soon as it's needed. This is Dependency Injection. Just one object. Not whole list. Have a Getter in the DevRepo for that.

    private DeveloperRepository developerRepository;


    @RequestMapping("/")  //This maps URI requested to method below
    public String listAllDevs(ModelMap modelMap) {
        List<Developer>allDevelopers =
               developerRepository.getAllDevelopers();
        modelMap.put("developers", allDevelopers);
        return "home";
    }


    //Single Dev

    @RequestMapping ("/developer/{name}")
    public String devDetails(@PathVariable String name, ModelMap modelMap){
        //First retrieve a Developer object from the DeveloperRepository that you can return to the View. Using DI.
        Developer developer = developerRepository.findByName(name); //Takes the name from the PathVariable
//See DeveloperRepository for what happens with this method.

        //Second - make object available to View. Need to add it to a Model Map.//This means when this method called Spring passes in an instance of a model map into this parameter. So Has to be added as an argument to method (completed above)

        //Third - put developer in modelMap. String = Key; Object = Value
        modelMap.put("developer", developer);
        return "dev-details";
    }
}
