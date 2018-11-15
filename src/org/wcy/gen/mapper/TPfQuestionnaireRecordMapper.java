package org.wcy.gen.mapper;

import org.wcy.gen.model.TPfQuestionnaireRecord;

public interface TPfQuestionnaireRecordMapper {
    int deleteByPrimaryKey(Long id);

    int insert(TPfQuestionnaireRecord record);

    int insertSelective(TPfQuestionnaireRecord record);

    TPfQuestionnaireRecord selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(TPfQuestionnaireRecord record);

    int updateByPrimaryKey(TPfQuestionnaireRecord record);
}