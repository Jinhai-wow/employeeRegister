package com.mapper;

import com.po.ErLogin;
import com.po.ErLoginExample;
import com.po.UserExtend;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface ErLoginMapper {
    int countByExample(ErLoginExample example);

    int deleteByExample(ErLoginExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ErLogin record);

    int insertSelective(ErLogin record);

    List<ErLogin> selectByExample(ErLoginExample example);

    ErLogin selectByPrimaryKey(String glbm);

    int updateByExampleSelective(@Param("record") ErLogin record, @Param("example") ErLoginExample example);

    int updateByExample(@Param("record") ErLogin record, @Param("example") ErLoginExample example);

    int updateByPrimaryKeySelective(ErLogin record);

    int updateByPrimaryKey(ErLogin record);
    
    ErLogin checkMsg(String userid);
    
    /**
     * @Description: TODO(根据关联编码查找账号密码)
     * @param glbm
     * @return
     * @creator Jinhai
     * @since  v1.0
     */
    UserExtend selectByBlbm(String glbm);

    /**
     * @Description: TODO(根据关联编号关联查询信息)
     * @param glbm
     * @return
     * @creator Jinhai
     * @since  v1.0
     */
    UserExtend selectBygl(String glbm);
}