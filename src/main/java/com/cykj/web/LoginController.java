package com.cykj.web;

import com.alibaba.fastjson.JSON;
import com.cykj.bean.TblUser;
import com.cykj.bean.Tblpower;
import com.cykj.bean.Tblrole;
import com.cykj.service.TbUserService;
import com.cykj.service.TblpowerService;
import com.cykj.service.TblrolePowerService;
import com.cykj.service.TblroleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/admin")
public class LoginController {

    @Autowired
    private TbUserService tbUserService;
    @Autowired
    private TblroleService tblroleService;
    @Autowired
    private TblpowerService tblpowerService;
    @Autowired
    private TblrolePowerService tblrolePowerService;
    @RequestMapping("/hello")
    public String hello(){
        return "hello";
    }

    /*进入页面*/
    @RequestMapping("/userList")
    public String userList(){
        System.out.println("进入用户查询");
        return "userList";
    }
    /*查询数据*/
    @RequestMapping(value="/find",produces = { "text/html;charset=UTF-8;", "application/json;charset=UTF-8;" })
    public  String find(String acc,String name){
        System.out.println("userList-----------");
        System.out.println(acc+"---------"+name);
        //  c-->service
        List<TblUser> list = tbUserService.findAll(name,acc);
        String json = JSON.toJSONString(list);
        return json;
    }
    /*删除*/
    @RequestMapping("/del")
    public  String del(String id){
        if (tbUserService.del(Long.parseLong(id))){
            System.out.println("删除成功");
            return "1";
        }else {
            System.out.println("删除失败");
            return "2";
        }
    }
    /*添加*/
    @RequestMapping("/add")
    public  String add(String acc, String pwd, String age,String address){
        TblUser tblUser = new TblUser(acc,pwd,Long.parseLong(age),address,"");
        if (tbUserService.enroll(tblUser)){
            return "1";
        }else {
            return "2";
        }
    }
    /*修改*/
    @RequestMapping("/upd")
    public  String upd(String id, String pwd, String age,String address){
        if (tbUserService.upd(Long.parseLong(id),pwd,Long.parseLong(age),address)){
            return "1";
        }else {
            return "2";
        }
    }

    /*查询角色权限*/
    @RequestMapping(value="/power",produces = { "text/html;charset=UTF-8;", "application/json;charset=UTF-8;" })
    public  String findRolePower(String roleId){
        List<Tblpower> list = tbUserService.findRolePower(Long.parseLong(roleId));
        String json = JSON.toJSONString(list);
        return json;
    }

    /*进入角色页面*/
    @RequestMapping("/roleManage")
    public String roleManage(){
        return "roleManage";
    }

    /*查询角色*/
    @RequestMapping(value="/role",produces = { "text/html;charset=UTF-8;", "application/json;charset=UTF-8;" })
    public  String role(){
        //  执行方法
        List<Tblrole> list = tblroleService.findRole();
        String json = JSON.toJSONString(list);
        return json;
    }
    /*删除角色*/
    @RequestMapping("/delRole")
    public  String delRole(String roleId){
        if (tblroleService.del(Long.parseLong(roleId))){
            System.out.println("删除成功");
            return "1";
        }else {
            System.out.println("删除失败");
            return "2";
        }
    }
    /*修改角色*/
    @RequestMapping("/updRole")
    public  String updRole(String updRoleId,String updDescribe){
        if (tblroleService.upd(updDescribe,Long.parseLong(updRoleId))){
            System.out.println("修改成功");
            return "1";
        }else {
            System.out.println("修改失败");
            return "2";
        }
    }
    /*新增角色*/
    @RequestMapping("/addRole")
    public  String addRole(String addRoleName,String addDescribe){
        if (tblroleService.add(addRoleName,addDescribe)){
            System.out.println("新增成功");
            return "1";
        }else {
            System.out.println("新增失败");
            return "2";
        }
    }
    /*权限管理界面*/
    @RequestMapping("/rolePower")
    public  String rolePower(String roleId,HttpSession session){
        Tblrole tblrole = tblroleService.selRole(Long.parseLong(roleId));
        if (tblrole != null){
            session.setAttribute("role",tblrole);
            return "1";
        }else {
            return "2";
        }
    }
    /*查找所有权限*/
    @RequestMapping(value="/findPower",produces = { "text/html;charset=UTF-8;", "application/json;charset=UTF-8;" })
    public  String findPower(String roleId){
        List<Tblpower> powerList = tblpowerService.findAllPower();
        List<Tblpower> rolePowerList = tblpowerService.findRolePower(Long.parseLong(roleId));
        Map<String,Object> map = new HashMap<>();
        map.put("powerList",powerList);
        map.put("roleList",rolePowerList);
        String json = JSON.toJSONString(map);
        return json;
    }
    /*进入权限管理界面*/
    @RequestMapping("/test")
    public String test(){
        return "test";
    }
    /*获取权限*/
    @RequestMapping("/addPower")
    public  String addPower(String powerIds,String roleId){
        System.out.println(176);
        List<Integer> list = JSON.parseArray(powerIds);
        System.out.println(list);
        //  删除角色下的所有权限
        tblrolePowerService.delRolePower(Long.parseLong(roleId));
        boolean is = true;
        //  循环给角色添加权限
        for (int i = 0; i < list.size(); i++) {
            Long powerId = Long.parseLong(String.valueOf(list.get(i)));
            if (tblrolePowerService.addPower(Long.parseLong(roleId),powerId)){
                is = true;
            }else {
                is = false;
                break;
            }
        }
        if (is){
            return "1";
        }else {
            return "2";
        }

    }

    @RequestMapping("/toRolePower")
    public String toRolePower(){
       return "rolePower";
    }

    @RequestMapping("/loginView")
    public String login(){
        return "login";//   页面名称
    }

    @RequestMapping("/toEnroll")
    public String toEnroll(){
            return "enroll";
    }

    @RequestMapping("/doLogin")
    public  String doLogin(String acc, String pwd){
        TblUser tblUser = tbUserService.login(acc,pwd);
        if (tblUser != null){
            System.out.println("登录成功");
            return "1";
        }else {
            System.out.println("登录失败");
            return "2";
        }
    }

    @RequestMapping("/enroll")
    public String enroll(String acc, String pwd, String age,String address, MultipartFile fname,HttpServletRequest request){
        String fileName = fname.getOriginalFilename();//    图片名称
        String url5 = "";
        try {
            url5 = request.getServletContext().getRealPath("/upload");
            File file = new File(url5);
            if (!file.exists()){
                file.mkdir();
            }
            fname.transferTo(new File(url5+"/"+acc+fileName));//   保存file,转存到路径下
        } catch (IOException e) {
            e.printStackTrace();
        }
        TblUser tblUser = new TblUser(acc,pwd,Long.parseLong(age),address,acc+fileName);
        if (tbUserService.enroll(tblUser)){
            System.out.println("注册成功");
            return "login";
        }else {
            System.out.println("注册失败");
            return "enroll";
        }
    }

    @RequestMapping("/checkacc")
    public  String checkAcc(@RequestBody String acc){
        System.out.println(acc);
        return "1";
    }

    //1.springApplication 静态调用run方法，从静态run方法中new一个自己的实例，并调用实例的run方法
    //springApplication 构造方法进行属性变量的初始化
    //2.run方法
        //2.1创建SpringApplicationRunListeners类，实例对象，starting（），启动监听
        //2.2如何加载配置文件 xml/properties
        //  2.2.1 <-- 通过ConfigurableEnvironment得到配置环境对象，
        //      new ApplicationServletEnvironment -->配置tomcat 运行环境，
        //  2.2.2prepareContext加载xml/properties
        //  2.2.3通知listener对象，配置环境已读取完成
        //2.3 从ApplicationContextFactory中create一个ApplicationContext（上下文容器）对象
        //  （ApplicationContext 实例化类得到对象）
        //  @RestController：相当于在上下文容器注入，进行实例化生成对象

    //三个注解
    //@SpringBootApplication
    //  @SpringBootConfiguration    :实例化对象
    //  @configuration -->@component
    //  @EnableAutoConfiguration
}