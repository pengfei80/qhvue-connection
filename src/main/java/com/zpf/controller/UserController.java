package com.zpf.controller;

import com.zpf.Response.UserResponse;
import com.zpf.pojo.User;
import com.zpf.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by lenovo on 2019/11/27.
 */
@RestController
public class UserController {
    @Autowired

    private UserService userService;
    @RequestMapping("/findAll/{size}/{page}")
    public UserResponse findAll(@PathVariable("size")Integer size, @PathVariable("page")Integer page){
        System.out.println("这是8082的第一次访问");
       return userService.findAll(size,page);
    }
    @RequestMapping("/findOne")
    public User findOne(@RequestBody User user){
        Integer  id= user.getId();
        return  userService.findById(id);

    }
    @RequestMapping("/updateuser")
    public  User updateuser(@RequestBody User user){
        return   userService.saveAndFlush(user);


    }
    @RequestMapping(value = "/deleteById",method = RequestMethod.POST)
    public String deleteById(@RequestBody  User user){
        System.out.println("第一次访问");
         Integer id=user.getId();
        return  userService.deleteById(id);
    }
}
