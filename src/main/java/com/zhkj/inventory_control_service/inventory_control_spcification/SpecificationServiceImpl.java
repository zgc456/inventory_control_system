package com.zhkj.inventory_control_service.inventory_control_spcification;

import com.zhkj.inventory_control_api.api.SpecificationService;
import com.zhkj.inventory_control_api.dto.SpecificationRelationDto;
import com.zhkj.inventory_control_dao.entity.SpecificationdetailedEntity;
import com.zhkj.inventory_control_dao.entity.SpecificationrelationEntity;
import com.zhkj.inventory_control_dao.entity.SpecificationtopicEntity;
import com.zhkj.inventory_control_dao.mapper.SpecificationDetailedMapper;
import com.zhkj.inventory_control_dao.mapper.SpecificationRelationMapper;
import com.zhkj.inventory_control_dao.mapper.SpecificationTopicMapper;
import com.zhkj.inventory_control_tools.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SpecificationServiceImpl implements SpecificationService {
    @Autowired
    private SpecificationRelationMapper specificationRelationMapper;
    @Autowired
    private SpecificationTopicMapper specificationTopicMapper;
    @Autowired
    private SpecificationDetailedMapper specificationDetailedMapper;
    @Override
    public Result listSpecificationAll() {
        Result result = new Result();
        List<SpecificationrelationEntity> specificationrelationEntityList = specificationRelationMapper.listSpecificationRelation();
        if(null != specificationrelationEntityList && specificationrelationEntityList.size() > 0){
            List<SpecificationtopicEntity> specificationtopicEntityList = specificationTopicMapper.getTopic();
            List<SpecificationdetailedEntity> specificationdetailedEntityList = specificationDetailedMapper.getSpecificationDetailed();
            List<SpecificationRelationDto> specificationRelationDtoList = convertSpecificationRelationDTO(specificationrelationEntityList
                    ,specificationtopicEntityList,specificationdetailedEntityList);
            result.setSuccess(true);
            result.setData(specificationRelationDtoList);
        }
        return result;
    }

    @Override
    public Result listSpecificationTopicAll() {
        Result result = new Result();
        List<SpecificationtopicEntity> specificationtopicEntityList = specificationTopicMapper.getTopic();
        result.setSuccess(true);
        result.setData(specificationtopicEntityList);
        return result;
    }

    /**
     * 转换规格关系
     * @param specificationrelationEntityList 规格关系列表
     * @param specificationtopicEntityList 规格标题列表
     * @param specificationdetailedEntityList 规格详情列表
     * @return
     */
    private List<SpecificationRelationDto> convertSpecificationRelationDTO(List<SpecificationrelationEntity> specificationrelationEntityList
            ,List<SpecificationtopicEntity> specificationtopicEntityList,List<SpecificationdetailedEntity> specificationdetailedEntityList){
        List<SpecificationRelationDto> specificationRelationDtoList = new ArrayList<>();
        // 循环规格标题
        for(int i = 0;i < specificationtopicEntityList.size();i++){
            // 得到改标题下的所有规格详细
            List<Integer> integerList = recordNumber(specificationtopicEntityList.get(i).getId(),specificationrelationEntityList);
            // 如果有规格详细
            if(integerList.size() > 0){
                SpecificationRelationDto specificationRelationDto = new SpecificationRelationDto();
                String[] strings = new String[integerList.size()];
                // 循环得到的规格详细
                for(int j = 0;j < integerList.size();j++){
                    // 循环全部规格详细
                    for(int k = 0;k < specificationdetailedEntityList.size();k++){
                        // 如果给得到的规格详细等于规格详细 id 存储规格详细名称
                        if(integerList.get(j).equals(specificationdetailedEntityList.get(k).getId())){
                            strings[j] = "<option value = "+ specificationdetailedEntityList.get(k).getId() +">"
                                    + specificationdetailedEntityList.get(k).getDetailedName() + "</option>";
                            break;
                        }
                    }
                }
                specificationRelationDto.setTopicName(specificationtopicEntityList.get(i).getTopicName());
                specificationRelationDto.setDetailed(strings);
                specificationRelationDtoList.add(specificationRelationDto);
            }
        }
        return specificationRelationDtoList;
    }
    private List<Integer> recordNumber(Integer topicId,List<SpecificationrelationEntity> specificationrelationEntityList){
        List<Integer> integerList = new ArrayList<>();
        for(int i = 0;i < specificationrelationEntityList.size();i++){
            if(topicId.equals(specificationrelationEntityList.get(i).getSpecificationTopicId())){
                integerList.add(specificationrelationEntityList.get(i).getSpecificationDetailedId());
            }
        }
        return integerList;
    }
}
