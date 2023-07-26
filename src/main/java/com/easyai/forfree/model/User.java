package com.easyai.forfree.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author Mark li
 * @Date 2023/7/26 0026 16:03
 * @ProjectName easyai
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private int id;
    private String username;
    private String nickname;
    private String password;
    private int age;
}
