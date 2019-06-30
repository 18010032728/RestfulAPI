package com.example.ztlend.repository;

import com.example.ztlend.dataobject.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @Author: Li Liu
 * @Description:
 * @Date: Created in 下午3:40 2018/11/14
 * @Modified By:
 */
public interface UserRepository extends JpaRepository<User,Integer> {
}
