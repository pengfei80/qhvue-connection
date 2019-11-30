package com.zpf.Response;

import com.zpf.pojo.User;
import lombok.Data;

import java.util.List;

/**
 * Created by lenovo on 2019/11/27.
 */
@Data
public class UserResponse {

    private List<User> list;

    private Integer page;
    private Long total;


}
