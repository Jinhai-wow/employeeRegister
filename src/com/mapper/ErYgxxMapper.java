package com.mapper;

import com.po.ErYgxx;
import com.po.ErYgxxExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ErYgxxMapper {
    int countByExample(ErYgxxExample example);

    int deleteByExample(ErYgxxExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ErYgxx record);

    int insertSelective(ErYgxx record);

    List<ErYgxx> selectByExample(ErYgxxExample example);

    ErYgxx selectByPrimaryKey(Integer id);
    ErYgxx selectByGlbm(String glbm);

    int updateByExampleSelective(@Param("record") ErYgxx record, @Param("example") ErYgxxExample example);

    int updateByExample(@Param("record") ErYgxx record, @Param("example") ErYgxxExample example);

    int updateByPrimaryKeySelective(ErYgxx record);

    int updateByPrimaryKey(ErYgxx record);
    
    /**
     * @Description: TODO(根据部门查找员工信息)
     * @param string
     * @return
     * @creator Jinhai
     * @since  v1.0
     */
    List<ErYgxx> selectByDepart(String key);

    /**
     * @Description: TODO(按部门顺序排序)
     * @return
     * @creator Jinhai
     * @since  v1.0
     */
    List<ErYgxx> selectByDepartAll();

    /**
     * @Description: TODO(按技能顺序排序)
     * @return
     * @creator Jinhai
     * @since  v1.0
     */
    List<ErYgxx> selectBySkillAll();

    /**
     * @Description: TODO(根据技能查找员工信息)
     * @param string
     * @return
     * @creator Jinhai
     * @since  v1.0
     */
    List<ErYgxx> selectBySkill(String key);

    /**
     * @Description: TODO(根据姓名查找员工信息)
     * @return
     * @creator Jinhai
     * @since  v1.0
     */
    List<ErYgxx> selectByNameAll();

    /**
     * @Description: TODO(按姓名顺序排序)
     * @param string
     * @return
     * @creator Jinhai
     * @since  v1.0
     */
    List<ErYgxx> selectByName(String key);
}