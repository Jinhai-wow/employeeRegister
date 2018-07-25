package com.service;

import java.util.HashMap;

import com.po.ErLogin;
import com.po.ErYgdz;
import com.po.ErYgxx;
import com.po.UserExtend;

public interface UserService {
	public ErYgxx selectUserById(Integer id);
	
	public HashMap<Object, Object> selectUserByExample(HashMap<Object, Object> id);

    /**
     * @Description: TODO(新员工登记信息)
     * @param userVo
     * @return
     * @creator Jinhai
     * @since  v1.0
     */
    public ErYgxx registIn(ErYgxx userVo);

    /**
     * @Description: TODO(更新用户信息)
     * @param userVo
     * @return
     * @creator Jinhai
     * @since  v1.0
     */
    public ErYgxx updateIn(ErYgxx userVo);
    
        /**  
        * @Title: saveData  
        * @Description: TODO(保存新员工信息)
        * @creator: liuzheng
        * @param @param erYgxx
        * @param @param erYgdz
        * @return void
        * @throws  
        */  
    public void saveData(ErYgxx erYgxx,ErYgdz erYgdz,ErLogin erLogin);
    
        /**  
        * @Title: checkMsg  
        * @Description: TODO(用户登陆使用)
        * @creator: liuzheng
        * @param @param userid
        * @return void
        * @throws  
        */  
        
    
        /**  
        * @Title: checkMsg  
        * @Description: TODO(根据账号查询权限密码等登陆信息)
        * @creator: liuzheng
        * @param @param userid
        * @param @return
        * @return ErLogin
        * @throws  
        */  
        
    public ErLogin checkMsg(String userid);
    
        /**  
        * @Title: selectErYgxxMsg  
        * @Description: TODO(通过关联编码查询用户的个人信息)
        * @creator: liuzheng
        * @param @param glbm
        * @param @return
        * @return ErYgxx
        * @throws  
        */  
        
    public ErYgxx selectErYgxxMsg(String glbm);
    
        /**  
        * @Title: selectErYgdzMsg  
        * @Description: TODO(根据关联编码查询用户通讯信息)
        * @creator: liuzheng
        * @param @param glbm
        * @param @return
        * @return ErYgdz
        * @throws  
        */  
        
    public ErYgdz selectErYgdzMsg(String glbm);
    public UserExtend selectMsg(String glbm);

    /**
     * @Description: TODO(根据关联编号查询用户信息)
     * @param glbm
     * @return
     * @creator Jinhai
     * @since  v1.0
     */
    public UserExtend selectUserByGlbm(String glbm);
    
        /**  
        * @Title: updatePwd  
        * @Description: TODO(用户更新密码)
        * @creator: liuzheng
        * @param @param userid
        * @param @return
        * @return ErLogin
        * @throws  
        */  
        
    public int updatePwd(ErLogin erLogin);
}
