package com.younpets.portal.survey.main.mapper;

import com.younpets.portal.survey.main.pojo.PetInfo;
import com.younpets.portal.survey.main.pojo.PetInfoExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface PetInfoMapper {
    long countByExample(PetInfoExample example);

    int deleteByExample(PetInfoExample example);

    int deleteByPrimaryKey(String id);

    int insert(PetInfo record);

    int insertSelective(PetInfo record);

    List<PetInfo> selectByExample(PetInfoExample example);

    PetInfo selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") PetInfo record, @Param("example") PetInfoExample example);

    int updateByExample(@Param("record") PetInfo record, @Param("example") PetInfoExample example);

    int updateByPrimaryKeySelective(PetInfo record);

    int updateByPrimaryKey(PetInfo record);
}