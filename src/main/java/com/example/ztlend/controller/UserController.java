package com.example.ztlend.controller;

import com.example.ztlend.dataobject.User;
import com.example.ztlend.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author: Li Liu
 * @Description:
 * @Date: Created in 下午4:13 2018/11/14
 * @Modified By:
 */
@RestController
public class UserController {

    @Autowired
    private UserServiceImpl userService;


    //查询接口
    @GetMapping("/findone/{id}")
    public User findOne(@PathVariable("id")Integer id){
        return userService.findOne(id);
    }

    //查询所有
    @GetMapping("/list/{pageIndex}/{pageSize}")
    public List<User> list(@PathVariable("pageIndex")Integer pageIndex,
                           @PathVariable("pageSize")Integer pageSize){

        PageRequest pageRequest = new PageRequest(pageIndex,pageSize);

        Page<User> all = userService.findAll(pageRequest);

        return all.getContent();
    }

    //添加/修改
    @PostMapping("save")
    public User save(User user){
        return userService.save(user);
    }

    //删除
    @PostMapping("del/{id}")
    public void del(@PathVariable("id")Integer id){
        userService.delete(id);
    }
}
