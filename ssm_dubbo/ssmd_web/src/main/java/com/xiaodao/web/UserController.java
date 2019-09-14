package com.xiaodao.web;

import com.alibaba.dubbo.config.annotation.Reference;
import com.xiaodao.domain.User;
import com.xiaodao.userservice.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {

    @Reference
    private UserService userService;

    private HttpServletRequest request;

    @ModelAttribute
    public void before(HttpServletRequest request, HttpServletResponse response){
        this.request = request;
    }

    // 查询所有
    @RequestMapping("/selectAllUser")
    public String selectAllUser(){
        List<User> userList = userService.selectByExample(null);
        System.out.println(userList);
        request.setAttribute("userList", userList);
        return "user_list";
    }

    // 删除指定
    @RequestMapping("/deleteUser")
    public String deleteUser(int id){
        userService.deleteByPrimaryKey(id);
        return "redirect:/user/selectAllUser.do";
    }

    // 跳转到添加页面
    @RequestMapping("/toAddUser")
    public String addUser(){
        return "add_user";
    }


    // 真正往数据库添加数据
    @RequestMapping("/addUser")
    public String addUser(User user){
        userService.insertSelective(user);
        return "redirect:/user/selectAllUser.do";
    }


    // 跳转到修改页面
    @RequestMapping("/toUpdate")
    public String toUpdate(int id){
        User user = userService.selectByPrimaryKey(id);
        request.setAttribute("user", user);
        return "update_user";
    }

    // 真正修改数据
    @RequestMapping("/updateUser")
    public String updateUser(User user){
        userService.updateByPrimaryKeySelective(user);
        return "user_list";
    }
}
