package com.comp208.implementation.implement;

import com.comp208.mappers.ClassificationMapper;
import com.comp208.entity.Classification;
import com.comp208.implementation.ClassificationService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by comp208 on 2024.3.1.
 */
@Service
public class ClassificationServiceImpl implements ClassificationService {

    @Resource
    private ClassificationMapper classificationMapper;
    @Override
    public int deleteByPrimaryKey(Integer id) {
        return 0;
    }

    @Override
    public int insert(Classification record) {
        return classificationMapper.insert(record);
    }

    @Override
    public int insertSelective(Classification record) {
        return classificationMapper.insertSelective(record);
    }

    @Override
    public Classification selectByPrimaryKey(Integer id) {
        return classificationMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(Classification record) {
        return classificationMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Classification record) {
        return classificationMapper.updateByPrimaryKey(record);
    }

    @Override
    public List<Classification> selectByAid(int aid) {
        return classificationMapper.selectByAid(aid);
    }
}
