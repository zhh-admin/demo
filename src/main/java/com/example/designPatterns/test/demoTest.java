package com.example.designPatterns.test;


import com.example.designPatterns.dto.UserDO;
import org.junit.Test;

public class demoTest {
    @Test
    public void test(){
        UserDO userDO=UserDO.builder().id(1L).name("账号").build();
        System.out.println(userDO);
    }
}
