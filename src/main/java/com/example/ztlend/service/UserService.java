package com.example.ztlend.service;

import com.example.ztlend.dataobject.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

/**
 * @Author: Li Liu
 * @Description:
 * @Date: Created in 下午3:43 2018/11/14
 * @Modified By:
 */
public interface UserService {
    /**
     * 根据id进行查询
     * @param id
     * @return
     */
     User findOne(Integer id);
    /**
     * 查询所有并且带分页.
     * @param pageable
     * @return
     */
     Page<User> findAll(Pageable pageable);
    /**
     * 添加 / 更新
     * @param user
     * @return
     */
     User save(User user);

    /**
     * 根据id进行删除
     * @param id
     */
    void delete(Integer id);
}
