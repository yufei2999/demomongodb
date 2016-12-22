package com.yufei.service.impl;

import com.yufei.dao.UserDao;
import com.yufei.model.User;
import com.yufei.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * Created by pc on 2016-12-22.
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    public void insert(User object, String collectionName) {
        userDao.insert(object, collectionName);
    }

    public User findOne(Map<String, Object> params, String collectionName) {
        return userDao.findOne(params, collectionName);
    }

    public List<User> findAll(Map<String, Object> params, String collectionName) {
        return userDao.findAll(params, collectionName);
    }

    public void update(Map<String, Object> params, String collectionName) {
        userDao.update(params, collectionName);
    }

    public void createCollection(String collectionName) {
        userDao.createCollection(collectionName);
    }

    public void remove(Map<String, Object> params, String collectionName) {
        userDao.remove(params, collectionName);
    }

}
