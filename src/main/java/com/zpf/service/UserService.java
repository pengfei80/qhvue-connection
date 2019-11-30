package com.zpf.service;

import com.zpf.Response.UserResponse;
import com.zpf.pojo.User;

import java.util.List;

/**
 * Created by lenovo on 2019/11/27.
 */
public interface UserService {
 UserResponse  findAll(Integer size,Integer page);

 User  findById(Integer id);
 User  saveAndFlush(User user);
 String  deleteById(Integer id);
}
