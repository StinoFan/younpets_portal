package com.younpets.portal.survey.main.service.impl;

import com.younpets.portal.survey.main.mapper.PetInfoMapper;
import com.younpets.portal.survey.main.pojo.PetInfo;
import com.younpets.portal.survey.main.pojo.PetInfoExample;
import com.younpets.portal.survey.main.service.PetInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PetInfoServiceImpl implements PetInfoService {

    @Autowired
    PetInfoMapper petInfoMapper;

    @Override
    public PetInfo getPetInfoById(String id) {
        PetInfoExample example = new PetInfoExample();
        PetInfoExample.Criteria criteria = example.createCriteria();
        criteria.andIdEqualTo(id);
        List<PetInfo> infos = petInfoMapper.selectByExample(example);
        return infos.get(0);
    }

    @Override
    public int addPetInfo(String name) {
        PetInfo petInfo = new PetInfo();
        petInfo.setPetName(name);
        int insert = petInfoMapper.insert(petInfo);
        return insert;
    }
}
