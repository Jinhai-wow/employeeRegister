/**  
 * @FileName 	 UserExtend.java
 * @Package 	 com.po
 * @Description  TODO(用一句话描述该文件做什么)
 * @modifier 	 Jinhai
 * @modifiedDate 2018年7月20日下午6:41:38
 * @modifiedContent 修改的内容
 * @version 	 V1.0  
 */

package com.po;

/**
 * @ClassName    UserExtend
 * @Description  TODO(员工信息扩展类,包括员工完整信息)
 * @author       Jinhai
 * @modifiedDate 2018年7月20日下午6:41:38
 * @version      V1.0
 * 
 */
public class UserExtend extends ErLogin
{
    private ErYgxx ygxx;//登录员工信息
    private ErYgdz ygdz;//员工通讯信息
    
    public UserExtend(){};
    public UserExtend(ErYgxx ygxx, ErYgdz ygdz) {
		super();
		this.ygxx = ygxx;
		this.ygdz = ygdz;
	}
	public ErYgxx getYgxx()
    {
        return ygxx;
    }
    public void setYgxx(ErYgxx ygxx)
    {
        this.ygxx = ygxx;
    }
    public ErYgdz getYgdz()
    {
        return ygdz;
    }
    public void setYgdz(ErYgdz ygdz)
    {
        this.ygdz = ygdz;
    }
}
