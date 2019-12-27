package cn.hh.web.controller;

import cn.hh.pojo.Condition;
import cn.hh.pojo.User;
import org.apache.commons.lang.builder.ReflectionToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UserController {
    //查询详情
    @RequestMapping("/user/{id}")
    public User query(@PathVariable String id){
        System.out.println("传来的id是："+id);
        User user = new User();
        if(null != id)
            user.setId(Integer.parseInt(id));
        return user;
    }

    @RequestMapping("/user3")
    public List<User> query(Condition condition){
        //System.out.println("传来的参数对象："+condition);
        //System.out.println("传来的参数对象用户名："+condition.getUsername());
        System.out.println(ReflectionToStringBuilder.toString(condition, ToStringStyle.MULTI_LINE_STYLE));
        List<User> list = new ArrayList<>();
        list.add(new User(1,"tom1","123"));
        list.add(new User(2,"tom2","123"));
        list.add(new User(3,"tom3","123"));
        return list;
    }

    @RequestMapping("/user2")
    public List<User> query(String username,String email){
        System.out.println("传来的参数："+username);
        System.out.println("传来的参数："+email);
        List<User> list = new ArrayList<>();
        list.add(new User(1,"tom1","123"));
        list.add(new User(2,"tom2","123"));
        list.add(new User(3,"tom3","123"));
        return list;
    }

    @RequestMapping("/user")
    public List<User> query(){
        List<User> list = new ArrayList<>();
        list.add(new User(1,"tom1","123"));
        list.add(new User(2,"tom2","123"));
        list.add(new User(3,"tom3","123"));
        return list;
    }
}
