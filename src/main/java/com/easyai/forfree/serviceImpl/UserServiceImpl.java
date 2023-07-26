package com.easyai.forfree.serviceImpl;

import com.easyai.forfree.mapper.UserMapper;
import com.easyai.forfree.model.User;
import com.easyai.forfree.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @Author Mark li
 * @Date 2023/7/26 0026 16:50
 * @ProjectName easyai
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
    @Override
    public Map<String,Object> list() {
        Map<String, Object> list = userMapper.list();
        return list;
    }
}
