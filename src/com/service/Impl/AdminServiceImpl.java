/**  
 * @FileName     AdminServiceImpl.java
 * @Package      com.service.Impl
 * @Description  TODO(用一句话描述该文件做什么)
 * @modifier     eIT
 * @modifiedDate 2018年7月19日下午8:17:34
 * @modifiedContent 修改的内容
 * @version      V1.0  
 */

package com.service.Impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mapper.ErLoginMapper;
import com.mapper.ErYgdzMapper;
import com.mapper.ErYgxxMapper;
import com.po.ErLogin;
import com.po.ErYgdz;
import com.po.ErYgxx;
import com.po.ErYgxxExample;
import com.po.UserExtend;
import com.service.AdminService;

/**
 * @ClassName    AdminServiceImpl
 * @Description  TODO(管理员业务逻辑实现)
 * @author       Jinhai
 * @modifiedDate 2018年7月19日下午8:17:34
 * @version      V1.0
 * 
 */
@Service
@Transactional
public class AdminServiceImpl implements AdminService
{
    @Autowired
    private ErYgxxMapper userMapper;
    @Autowired
    private ErYgdzMapper erYgdzMapper;
    @Autowired
    private ErLoginMapper erLoginMapper;
    
    /* (非 Javadoc)
     * 
     * @param userVo
     * @return
     * @see com.service.AdminService#updateUser(com.po.ErYgxx)
     */
    @Override
    public int updateUser(ErYgxx userVo, ErYgdz erYgdz, ErLogin erLogin)
    {
        int rs0 = userMapper.updateByPrimaryKey(userVo);
        int rs1 = erYgdzMapper.updateByPrimaryKey(erYgdz);
        int rs2 = erLoginMapper.updateByPrimaryKey(erLogin);
        return rs0+rs1+rs2+1;
    }

    /* (非 Javadoc)
     * 
     * @param id
     * @return
     * @see com.service.AdminService#addAdmin(java.lang.String)
     */
    @Override
    public int addAdmin(String glbm)
    {
        ErLogin login = erLoginMapper.selectByBlbm(glbm);
        if (login != null)
        {
            login.setQxjb(1);//赋予普通管理员权限
            return erLoginMapper.updateByPrimaryKey(login);
        }
        else
        {
            return 0;
        }
    }

    /* (非 Javadoc)
     * 
     * @param key
     * @return
     * @see com.service.AdminService#searchUserByDepart(java.lang.String)
     */
    @Override
    public List<ErYgxx> searchUserByDepart(String key)
    {
        List<ErYgxx> users = new ArrayList<ErYgxx>();
        if ("".equals(key.trim()))
        {
            users = userMapper.selectByDepartAll();
        }
        else
        {
            users = userMapper.selectByDepart("%"+key+"%");
        }
        if (!users.isEmpty())
        {
            return users;
        }
        else
        {
            return null;
        }
    }

    /* (非 Javadoc)
     * 
     * @param key
     * @return
     * @see com.service.AdminService#searchUserBySkill(java.lang.String)
     */
    @Override
    public List<ErYgxx> searchUserBySkill(String key)
    {
        List<ErYgxx> users = new ArrayList<ErYgxx>();
        if ("".equals(key.trim()))
        {
            users = userMapper.selectBySkillAll();
        }
        else
        {
            users = userMapper.selectBySkill("%"+key+"%");
        }
        if (!users.isEmpty())
        {
            return users;
        }
        else
        {
            return null;
        }
    }

    /* (非 Javadoc)
     * 
     * @param key
     * @return
     * @see com.service.AdminService#searchUserByName(java.lang.String)
     */
    @Override
    public List<ErYgxx> searchUserByName(String key)
    {
        List<ErYgxx> users = new ArrayList<ErYgxx>();
        if ("".equals(key.trim()))
        {
            users = userMapper.selectByNameAll();
        }
        else
        {
            users = userMapper.selectByName("%"+key+"%");
        }
        if (!users.isEmpty())
        {
            return users;
        }
        else
        {
            return null;
        }
    }

    /* (非 Javadoc)
     * 
     * @param login
     * @return
     * @see com.service.AdminService#addAmin(com.po.ErLogin)
     */
    @Override
    public int addAmin(ErLogin login)
    {
        return erLoginMapper.insert(login);
    }

    /* (非 Javadoc)
     * 
     * @param glbm
     * @return
     * @see com.service.AdminService#getDetailInfo(java.lang.String)
     */
    @Override
    public UserExtend getDetailInfo(String glbm)
    {
        return userMapper.selectBygl(glbm);
    	//return new UserExtend(userMapper.selectByGlbm(glbm),erYgdzMapper.selectByGlbm(glbm));
    }

    /* (非 Javadoc)
     * 
     * @param glbm
     * @return
     * @see com.service.AdminService#deleteUpdate(java.lang.String)
     */
    @Override
    public int deleteUpdate(String glbm)
    {
        ErLogin login = erLoginMapper.selectByPrimaryKey(glbm);
        login.setStatus(1);
        return erLoginMapper.updateByPrimaryKey(login);
    }

    /* (非 Javadoc)
     * 
     * @param glbm
     * @param type
     * @return
     * @see com.service.AdminService#updateAdmin(java.lang.String, java.lang.String)
     */
    @Override
    public int updateAdmin(String glbm, String type)
    {
        ErLogin login = erLoginMapper.selectByBlbm(glbm);
        if (login != null || "add".equals(type))
        {
            login.setQxjb(1);//赋予普通管理员权限
            return erLoginMapper.updateByPrimaryKey(login);
        }else if (login != null || "delete".equals(type)) {
            login.setQxjb(3);//取消管理员权限
            return erLoginMapper.updateByPrimaryKey(login);
        }
        else
        {
            return 0;
        }
    }

}
