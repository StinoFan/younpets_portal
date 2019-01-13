package com.younpets.portal.survey.main.controller;

import com.younpets.portal.survey.main.pojo.PetInfo;
import com.younpets.portal.survey.main.service.PetInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {
    @Autowired
    PetInfoService petInfoService;

    @RequestMapping("/")
    public String requestIndex() {
        return "index";
    }

    @RequestMapping("/add/{name}")
    @ResponseBody
    public int addPetInfo(@PathVariable String name) {
        int i = petInfoService.addPetInfo(name);
        return i;

    }

}
