package com.example.ztlend.service.impl;

import com.example.ztlend.dataobject.User;
import com.example.ztlend.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;

/**
 * @Author: Li Liu
 * @Description:
 * @Date: Created in 下午3:45 2018/11/14
 * @Modified By:
 */
@Service
public class UserServiceImpl {

    @Autowired
    private UserRepository repository;

    /**
     * 根据id进行查询
     * @param id
     * @return
     */
    public User findOne(Integer id){
        Optional<User> user = repository.findById(id);
        return user.get();
    }

    /**
     * 查询所有并且带分页.
     * @param pageable
     * @return
     */
    public  Page<User> findAll(Pageable pageable){
        Page<User> all = repository.findAll(pageable);
        return all;
    }

    /**
     * 添加 / 更新
     * @param user
     * @return
     */
    public User save(User user){
        return repository.save(user);
    }

    /**
     * 根据id进行删除
     * @param id
     */
    public void delete(Integer id){
        repository.deleteById(id);
    }

}
