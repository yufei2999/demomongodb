package com.yufei.test;

import com.yufei.model.User;
import com.yufei.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by pc on 2016-12-22.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class TestUser {

    @Autowired
    private UserService userService;
    private String collectionName = "user";

    @Test
    public void testAdd() {
        //添加一百个user
        for (int i = 0; i < 100; i++) {
            User user = new User();
            user.setId("" + i);
            user.setAge(i);
            user.setName("name" + i);
            userService.insert(user, collectionName);
        }
        Map<String, Object> params = new HashMap<>();
        params.put("maxAge", 50);
        List<User> list = userService.findAll(params, collectionName);
        System.out.println("user.count()==" + list.size());
    }

}
