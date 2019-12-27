package cn.crud.controller;

import cn.crud.biz.UserInfoBiz;
import cn.crud.pojo.ResponseObject;
import cn.crud.pojo.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class CrudController {

    //注入业务层
    @Autowired
    private UserInfoBiz biz;
    //查询所有信息
    @GetMapping
    public List<UserInfo> findAll(){
        return biz.findAll();
    }
    //新增用户信息
    @PostMapping
    public ResponseObject create(@RequestBody UserInfo userInfo){
        biz.save(userInfo);
        return new ResponseObject("新增成功","200",null);
    }
}
