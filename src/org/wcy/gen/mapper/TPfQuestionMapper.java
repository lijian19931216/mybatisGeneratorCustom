package org.wcy.gen.mapper;

import org.wcy.gen.model.TPfQuestion;

public interface TPfQuestionMapper {
    int deleteByPrimaryKey(Long id);

    int insert(TPfQuestion record);

    int insertSelective(TPfQuestion record);

    TPfQuestion selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(TPfQuestion record);

    int updateByPrimaryKey(TPfQuestion record);
}