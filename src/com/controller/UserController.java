package com.controller;


import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.po.ErLogin;
import com.po.ErYgdz;
import com.po.ErYgxx;
import com.po.UserExtend;
import com.service.UserService;

import utils.CreateGlbm;


/**
 * @ClassName UserController
 * @Description TODO(普通员工controller)
 * @author Jinhai
 * @modifiedDate 2018年7月19日下午8:21:16
 * @version V1.0
 */

@Controller
public class UserController
{
    @Autowired
    private UserService userService;

    /**
     * @throws IOException 
     * @Title: saveData
     * @Description: TODO(登陆界面)
     * @creator: liuzheng
     * @param @return
     * @return ModelAndView
     * @throws
     */
    @RequestMapping(value = "/savedata")
    public  ModelAndView saveData(String type, String username,String password, HttpSession session,HttpServletResponse resp) throws IOException
    {
    	//设置响应编码
    	resp.setCharacterEncoding("utf-8");
        ModelAndView mv = new ModelAndView();
        UserExtend user= new UserExtend();
        PrintWriter pw=resp.getWriter();
        // 新员工保存信息
        if ("regist".equals(type))
        {
            mv.setViewName("savedata");
        }
        // 登陆
        else if ("login".equals(type))
        {
        	ErLogin erLogin2=userService.checkMsg(username);
        	System.out.println("密码为"+erLogin2.getPassword()+"权限为"+erLogin2.getQxjb());
            //普通员工登录
            if (password.equals(erLogin2.getPassword()))
            {
          
            session.setAttribute("login", erLogin2);
              if(erLogin2.getQxjb() == 2){
               user=userService.selectMsg(erLogin2.getGlbm());
               session.setAttribute("ygxx", user.getYgxx());
               session.setAttribute("ygdz", user.getYgdz());
                mv.setViewName("employeeInfo");//新员工登陆获取信息
                
            	}
            	else if(erLogin2.getQxjb() == 1){
            	    user = userService.selectUserByGlbm(erLogin2.getGlbm());
            	    session.setAttribute("user", user);
            	    mv.setViewName("table");//管理员登录
            		
            	}
            //超级管理员登陆
            	else{
            		 mv.setViewName("admin");
            	}
            }
            else
            {
            	pw.print("false");
              mv=null;
            }

        }
        return mv;
    }
    /**
     * @Title: hello
     * @Description: TODO(保存数据到数据库)
     * @creator: liuzheng
     * @param @param userVo
     * @param @param erYgdz
     * @param @return
     * @return ModelAndView
     * @throws
     */

    @RequestMapping(value = "/save")
    public ModelAndView login(ErYgxx userVo, ErYgdz erYgdz, ErLogin erLogin)
    {
        if (userVo != null && erYgdz != null)
        {
            String glbm = CreateGlbm.createGlbm();// 获取唯一关联编码
            userVo.setGlbm(glbm);
            erLogin.setQxjb(2);// 设置权限级别
            erYgdz.setGlbm(glbm);
            erLogin.setGlbm(glbm);
            erLogin.setUserid(erYgdz.getYddh());// 设置账号为手机号
            erLogin.setPassword("GeoStar999");// 设置初始密码
            userService.saveData(userVo, erYgdz, erLogin);
            ModelAndView mv = new ModelAndView();
            mv.setViewName("helloworld");
            return mv;
        }
        else
        {
            return null;
        }
    }
    
        /**  
        * @Title: updatePwd  
        * @Description: TODO(用户更新密码)
        * @creator: liuzheng
        * @param @param username
        * @param @param password
        * @param @param password1
        * @param @param session
        * @param @param resp
        * @return void
        * @throws  
        */  
        
    @RequestMapping(value = "/updatePwd")
    public void updatePwd( String username,String password,String password1, HttpSession session,HttpServletResponse resp){
    	
    }
    

}
