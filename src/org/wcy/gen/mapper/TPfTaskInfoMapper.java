package org.wcy.gen.mapper;

import org.wcy.gen.model.TPfTaskInfo;

public interface TPfTaskInfoMapper {
    int deleteByPrimaryKey(Long id);

    int insert(TPfTaskInfo record);

    int insertSelective(TPfTaskInfo record);

    TPfTaskInfo selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(TPfTaskInfo record);

    int updateByPrimaryKey(TPfTaskInfo record);
}