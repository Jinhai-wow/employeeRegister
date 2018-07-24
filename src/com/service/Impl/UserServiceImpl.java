package com.service.Impl;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mapper.ErLoginMapper;
import com.mapper.ErYgdzMapper;
import com.mapper.ErYgxxMapper;
import com.po.ErLogin;
import com.po.ErYgdz;
import com.po.ErYgxx;
import com.po.UserExtend;
import com.service.UserService;


@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private ErYgxxMapper userMapper;
	@Autowired
	private ErYgdzMapper userMapper1;
	@Autowired
	private ErLoginMapper userMapper2;
	
	@Override
	public ErYgxx selectUserById(Integer id) {
		// TODO Auto-generated method stub
		return userMapper.selectByPrimaryKey(id);
	}

    /* (非 Javadoc)
     * 
     * @param id
     * @return
     * @see com.service.UserService#selectUserById(java.util.HashMap)
     */
    @Override
    public HashMap<Object, Object> selectUserByExample(HashMap<Object, Object> id)
    {
        return null;
    }

    /* (非 Javadoc)
     * 
     * @param userVo
     * @return
     * @see com.service.UserService#registIn(com.po.User)
     */
    @Override
    public ErYgxx registIn(ErYgxx userVo)
    {
        // TODO Auto-generated method stub
        return null;
    }

    /* (非 Javadoc)
     * 
     * @param userVo
     * @return
     * @see com.service.UserService#updateIn(com.po.User)
     */
    @Override
    public ErYgxx updateIn(ErYgxx userVo)
    {
        // TODO Auto-generated method stub
        return null;
    }
@Override
public void saveData(ErYgxx erYgxx, ErYgdz erYgdz,ErLogin erLogin) {
	// TODO Auto-generated method stub
	userMapper.insert(erYgxx);
	userMapper1.insert(erYgdz);
	userMapper2.insert(erLogin);
}
@Override
public ErLogin checkMsg(String userid) {
	System.out.println(userid);
	return userMapper2.checkMsg(userid);
}
@Override
public ErYgxx selectErYgxxMsg(String glbm) {
	// TODO Auto-generated method stub
	return userMapper.selectByGlbm(glbm);
}
@Override
public ErYgdz selectErYgdzMsg(String glbm) {
	// TODO Auto-generated method stub
	return userMapper1.selectByGlbm(glbm);
}
@Override
public UserExtend selectMsg(String glbm) {
	// TODO Auto-generated method stub
	return new UserExtend(userMapper.selectByGlbm(glbm), userMapper1.selectByGlbm(glbm));
}

/* (非 Javadoc)
 * 
 * @param glbm
 * @return
 * @see com.service.UserService#selectUserByGlbm(java.lang.String)
 */
@Override
public UserExtend selectUserByGlbm(String glbm)
{
    return userMapper2.selectBygl(glbm);
}
}
