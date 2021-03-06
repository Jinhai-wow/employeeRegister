/**
 * @FileName AdminController.java
 * @Package com.controller
 * @Description TODO(用一句话描述该文件做什么)
 * @modifier eIT
 * @modifiedDate 2018年7月19日下午8:15:32
 * @modifiedContent 修改的内容
 * @version V1.0
 */

package com.controller;


import java.io.BufferedOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import utils.CreateGlbm;
import utils.ExportExcel;

import com.po.ErLogin;
import com.po.ErYgdz;
import com.po.ErYgxx;
import com.po.UserExtend;
import com.service.AdminService;
import com.service.UserService;


/**
 * @ClassName AdminController
 * @Description TODO(管理员controller)
 * @author Jinhai
 * @modifiedDate 2018年7月19日下午8:15:32
 * @version V1.0
 */
@RequestMapping(value="/admin")
@Controller
public class AdminController
{
    @Autowired
    private AdminService adminService;

    @Autowired
    private UserService userService;

    /**
     * @Description: TODO(更新新员工信息)
     * @param user
     * @param session
     * @return String
     * @creator Jinhai
     * @since v1.0
     */
    @RequestMapping(value = "/updateUser")
    @ResponseBody
    public String updateUser(ErYgxx userVo, ErYgdz erYgdz, ErLogin erLogin, HttpSession session)
    {
        if (userVo != null)
        {
            // 更新信息
            int result = adminService.updateUser(userVo, erYgdz, erLogin);
            if (result > 3)
            {
                return "updateSuccess";
            }
            else
            {
                return "updateError";
            }
        }
        else
        {
            return "nulluser";
        }
    }

    /**
     * @Description: TODO(添加/取消管理员权限)
     * @param glbm
     * @param userid
     * @param password
     * @param type 修改权限类型
     * @param session
     * @return
     * @creator Jinhai
     * @since  v1.0
     */
    @RequestMapping(value = "/updateAdmin")
    @ResponseBody
    public String addAdmin(String glbm, String userid, String password,String type, HttpSession session)
    {
        if ("add".equals(type))//添加管理员
        {
            if (!"".equals(glbm) && "".equals(userid))
            {
                // 根据用户id添加管理员权限
                int result = adminService.updateAdmin(glbm,type);
                if (result > 0)
                {
                    return "addSuccess";
                }
                else
                {
                    return "addError";
                }
            }
            else if ("".equals(userid))
            {
                // 直接创建管理员账号和密码
                ErLogin login = new ErLogin();
                login.setGlbm(CreateGlbm.createGlbm());
                login.setUserid(userid);
                login.setPassword(password);
                login.setQxjb(1);
                int rs = adminService.addAmin(login);
                if (rs > 0)
                {
                    return "addSuccess";
                }
                else
                {
                    return "addError";
                }
            }
            else
            {
                return "error";
            }
        }else if ("delete".equals(type))//删除管理员权限
        {
            int rs = adminService.updateAdmin(glbm,type);
            if (rs > 0)
            {
                return "addSuccess";
            }
            else
            {
                return "addError";
            }
        }
        else
        {
            return "error";
        }
    }

    /**
     * @Description: TODO(分类搜索用户)
     * @param searchType
     *            类别
     * @param key
     *            搜索关键词
     * @return
     * @creator Jinhai
     * @since v1.0
     */
    @RequestMapping(value = "/search")
    @ResponseBody
    public List<ErYgxx> searchUser(String searchType, String key, HttpSession session)
    {
        List<ErYgxx> users = new ArrayList<ErYgxx>();
        if (searchType == "1" || "1".equals(searchType))// 按部门搜索
        {
            users = adminService.searchUserByDepart(key);
        }
        else if (searchType == "2" || "2".equals(searchType))// 按技能搜索
        {
            users = adminService.searchUserBySkill(key);
        }
        else if (searchType == "3" || "3".equals(searchType))// 按姓名搜索
        {
            users = adminService.searchUserByName(key);
        }
        else
        // 默认按姓名搜索
        {
            users = adminService.searchUserByName(key);
        }
        return users;
    }
    
    
    /**
     * @Description: TODO(根据员工关联编号获取详细信息)
     * @param glbm
     * @param session
     * @return
     * @creator Jinhai
     * @since  v1.0
     */
    @RequestMapping(value="/{glbm}/detail")
    @ResponseBody
    public UserExtend detail(@PathVariable("glbm") String glbm,HttpSession session){
        if ("".equals(glbm))
        {
            return adminService.getDetailInfo(glbm);
        }
        else
        {
            return null;
        }
    }
    
    /**
     * @Description: TODO(根据员工关联编号删除)
     * @param glbm
     * @param session
     * @return
     * @creator Jinhai
     * @since  v1.0
     */
    @RequestMapping(value="/{glbm}/delete")
    @ResponseBody
    public String delete(@PathVariable("glbm") String glbm,HttpSession session){
        if ("".equals(glbm))
        {
            int rs = adminService.deleteUpdate(glbm);
            if (rs > 0)
            {
                return "success";
            }
            else
            {
                return "error";
            }
        }
        else
        {
            return "error";
        }
    }

    /**
     * @Description: TODO(用户详细信息页面导出Excel)
     * @param userVo
     * @param session
     * @return
     * @creator Jinhai
     * @since v1.0
     */
    @RequestMapping(value = "toExcel")
    @ResponseBody
    public String toExcel(List<String> glbms, HttpServletResponse response)
    {
        if (glbms.isEmpty())
        {
            response.reset(); // 清除buffer缓存
            // 指定下载的文件名
            response.setHeader("Content-Disposition", "attachment;filename=新员工信息" + new Date() + ".xlsx");
            response.setContentType("application/vnd.ms-excel;charset=UTF-8");
            response.setHeader("Pragma", "no-cache");
            response.setHeader("Cache-Control", "no-cache");
            response.setDateHeader("Expires", 0);
            
            String[] headers = {"候选人姓名", "性别", "应聘岗位", "年龄", "工作年限", "电话", "邮箱", "专业", "专科毕业院校",
                "本科毕业院校", "硕士毕业院校", "技能（前台，后台）", "其他关键技能", "简历附件"};
            List<UserExtend> users = new ArrayList<UserExtend>();
           
            for (String glbm : glbms)
            {
                UserExtend user = adminService.getDetailInfo(glbm);
                users.add(user);
            }
            ExportExcel<UserExtend> ex = new ExportExcel<UserExtend>();
            OutputStream output;
            try {
                output = response.getOutputStream();
                BufferedOutputStream bufferedOutPut = new BufferedOutputStream(output);
                bufferedOutPut.flush();
                ex.exportExcel(headers, users, output);
                bufferedOutPut.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        else
        {

        }
        
        return "error";
    }

    /**
     * @Title: pageInfo
     * @Description: TODO(控制界面跳转)
     * @creator: liuzheng
     * @param @param type
     * @param @param session
     * @param @return
     * @return ModelAndView
     * @throws
     */

    @RequestMapping(value = "pageInfo")
    public String pageInfo(String type, HttpSession session)
    {
        String page = "";
        // 管理员查询界面
        if ("one".equals(type))
        {
            page = "forward:/WEB-INF/jsp/table.jsp";
        }
        // 如果管理员为新员工则显示个人信息
        else if ("two".equals(type))
        {
            ErLogin erLogin = (ErLogin)session.getAttribute("login");
            UserExtend user = userService.selectMsg(erLogin.getGlbm());
            if (user != null)
            {
                session.setAttribute("ygxx", user.getYgxx());
                session.setAttribute("ygdz", user.getYgdz());
            }
            page = "forward:/WEB-INF/jsp/main2.jsp";
        }
        //超级管理员界面
        else if("three".equals(type)){
        	 page = "forward:/WEB-INF/jsp/admin.jsp";
        }
        return page;
    }
}
