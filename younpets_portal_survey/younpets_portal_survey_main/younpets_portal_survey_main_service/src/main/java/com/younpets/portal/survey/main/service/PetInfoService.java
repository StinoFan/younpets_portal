package com.younpets.portal.survey.main.service;

import com.younpets.portal.survey.main.pojo.PetInfo;

public interface PetInfoService {

    PetInfo getPetInfoById(String id);
    int addPetInfo(String name);
}
