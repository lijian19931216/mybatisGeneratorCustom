package org.wcy.gen.mapper;

import org.wcy.gen.model.TPfQuestionOption;

public interface TPfQuestionOptionMapper {
    int deleteByPrimaryKey(Long id);

    int insert(TPfQuestionOption record);

    int insertSelective(TPfQuestionOption record);

    TPfQuestionOption selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(TPfQuestionOption record);

    int updateByPrimaryKey(TPfQuestionOption record);
}