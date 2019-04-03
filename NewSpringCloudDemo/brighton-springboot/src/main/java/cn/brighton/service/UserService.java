/**
 * BrightonWang.com Inc.
 * Copyright (c) 2019- All Rights Reserved.
 */
package cn.brighton.service;

import cn.brighton.Mapper.UserMapper;
import cn.brighton.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * <p>
 * </p>
 *
 * @author BrightonWang
 * @version $Id: NewSpringCloudDemo, v 1.0 22:26 2019-04-03 BrightonWang Exp $
 */
@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;

    public User queryById(Long id) {
        return this.userMapper.selectByPrimaryKey(id);
    }

    @Transactional
    public void deleteById(Long id) {
        this.userMapper.deleteByPrimaryKey(id);
    }

    public List<User> queryAll() {
        return this.userMapper.selectAll();
    }
}
