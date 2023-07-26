package com.easyai.forfree.service;

import com.easyai.forfree.model.User;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

/**
 * @Author Mark li
 * @Date 2023/7/26 0026 16:48
 * @ProjectName easyai
 */

public interface UserService {

    Map<String,Object> list();
}
