package com.easyai.forfree;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Author Mark li
 * @Date 2023/7/26 0026 3:33
 * @ProjectName easyai
 */
@SpringBootApplication
@MapperScan("com.easyai.forfree.mapper")
public class EasyaiApplication {

    public static void main(String[] args) {
        SpringApplication.run(EasyaiApplication.class, args);
    }

}
