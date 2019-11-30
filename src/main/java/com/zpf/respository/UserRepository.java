package com.zpf.respository;

import com.zpf.pojo.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by lenovo on 2019/11/27.
 */
public interface UserRepository extends JpaRepository<User,Integer> {
}
