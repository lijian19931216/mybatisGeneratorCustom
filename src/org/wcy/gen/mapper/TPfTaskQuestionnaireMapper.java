package org.wcy.gen.mapper;

import org.wcy.gen.model.TPfTaskQuestionnaire;

public interface TPfTaskQuestionnaireMapper {
    int deleteByPrimaryKey(Long id);

    int insert(TPfTaskQuestionnaire record);

    int insertSelective(TPfTaskQuestionnaire record);

    TPfTaskQuestionnaire selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(TPfTaskQuestionnaire record);

    int updateByPrimaryKey(TPfTaskQuestionnaire record);
}