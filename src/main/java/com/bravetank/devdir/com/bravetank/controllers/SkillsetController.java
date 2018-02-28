package com.bravetank.devdir.com.bravetank.controllers;

import com.bravetank.devdir.com.bravetank.data.DeveloperRepository;
import com.bravetank.devdir.com.bravetank.data.SkillsetRepository;
import com.bravetank.devdir.com.bravetank.models.Developer;
import com.bravetank.devdir.com.bravetank.models.Skillset;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class SkillsetController {

    @Autowired
    private SkillsetRepository skillsetRepository;

    @Autowired
    private DeveloperRepository developerRepository;

    @RequestMapping("/skillsets")
   private String listAllSkillsets(ModelMap modelMap){
        List<Skillset>allSkillets = skillsetRepository.getAllSkillsets();
        modelMap.put("skillsets", allSkillets);
        return "skillsets";
    }

    @RequestMapping("skillset/{language}")
    private String skillsetDetail(@PathVariable String language, ModelMap modelMap){
       Skillset skillset = skillsetRepository.findByLanguage(language);
       modelMap.put("skillset", skillset);
       List<Developer>developers = developerRepository.findByLanguage(language);
       modelMap.put("developers", developers);
       return "skillsetDetail";
    }
}
