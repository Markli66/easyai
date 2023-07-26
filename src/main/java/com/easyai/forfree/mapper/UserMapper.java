package com.easyai.forfree.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.easyai.forfree.model.User;
import org.apache.ibatis.annotations.Mapper;
import org.yaml.snakeyaml.error.Mark;

import java.util.List;
import java.util.Map;

/**
 * @Author Mark li
 * @Date 2023/7/26 0026 16:47
 * @ProjectName easyai
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {

   Map<String,Object> list();
}
