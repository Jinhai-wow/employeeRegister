package com.mapper;

import com.po.ErYgdz;
import com.po.ErYgdzExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ErYgdzMapper {
    int countByExample(ErYgdzExample example);

    int deleteByExample(ErYgdzExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ErYgdz record);

    int insertSelective(ErYgdz record);

    List<ErYgdz> selectByExample(ErYgdzExample example);

    ErYgdz selectByPrimaryKey(Integer id);
    
    ErYgdz selectByGlbm(String glbm);

    int updateByExampleSelective(@Param("record") ErYgdz record, @Param("example") ErYgdzExample example);

    int updateByExample(@Param("record") ErYgdz record, @Param("example") ErYgdzExample example);

    int updateByPrimaryKeySelective(ErYgdz record);

    int updateByPrimaryKey(ErYgdz record);
}