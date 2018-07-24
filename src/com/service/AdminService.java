/**  
 * @FileName     AdminService.java
 * @Package      com.service
 * @Description  TODO(用一句话描述该文件做什么)
 * @modifier     eIT
 * @modifiedDate 2018年7月19日下午8:16:43
 * @modifiedContent 修改的内容
 * @version      V1.0  
 */

package com.service;

import java.util.List;

import com.po.ErLogin;
import com.po.ErYgdz;
import com.po.ErYgxx;
import com.po.UserExtend;

/**
 * @ClassName    AdminService
 * @Description  TODO(管理员业务逻辑接口)
 * @author       Jinhai
 * @modifiedDate 2018年7月19日下午8:16:43
 * @version      V1.0
 * 
 */
public interface AdminService
{

    /**
     * @Description: TODO(更新新员工信息并返回更新后的信息)
     * @param userVo
     * @param erLogin 
     * @param erYgdz 
     * @return int
     * @creator Jinhai
     * @since  v1.0
     */
    int updateUser(ErYgxx userVo, ErYgdz erYgdz, ErLogin erLogin);

    /**
     * @Description: TODO(根据用户id添加管理员权限)
     * @param glbm
     * @return
     * @creator Jinhai
     * @since  v1.0
     */
    int addAdmin(String glbm);

    /**
     * @Description: TODO(直接创建管理员账号和密码)
     * @param login
     * @return
     * @creator Jinhai
     * @since  v1.0
     */
    int addAmin(ErLogin login);
    
    /**
     * @Description: TODO(按部门搜索)
     * @param key
     * @return
     * @creator Jinhai
     * @since  v1.0
     */
    List<ErYgxx> searchUserByDepart(String key);

    /**
     * @Description: TODO(按技能搜索)
     * @param key
     * @return
     * @creator Jinhai
     * @since  v1.0
     */
    List<ErYgxx> searchUserBySkill(String key);

    /**
     * @Description: TODO(按姓名搜索)
     * @param key
     * @return
     * @creator Jinhai
     * @since  v1.0
     */
    List<ErYgxx> searchUserByName(String key);

    /**
     * @Description: TODO(根据员工关联编号获取详细信息)
     * @param glbm
     * @return
     * @creator Jinhai
     * @since  从哪个版本开始有这个方法
     */
    UserExtend getDetailInfo(String glbm);

    /**
     * @Description: TODO(删除标记)
     * @param glbm
     * @return
     * @creator Jinhai
     * @since  v1.0
     */
    int deleteUpdate(String glbm);

}
