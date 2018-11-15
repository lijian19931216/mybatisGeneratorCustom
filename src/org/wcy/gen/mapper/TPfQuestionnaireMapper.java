package org.wcy.gen.mapper;

import org.wcy.gen.model.TPfQuestionnaire;

public interface TPfQuestionnaireMapper {
    int deleteByPrimaryKey(Long id);

    int insert(TPfQuestionnaire record);

    int insertSelective(TPfQuestionnaire record);

    TPfQuestionnaire selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(TPfQuestionnaire record);

    int updateByPrimaryKey(TPfQuestionnaire record);
}