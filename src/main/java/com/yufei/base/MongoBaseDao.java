package com.yufei.base;

import java.util.List;
import java.util.Map;

/**
 * Created by pc on 2016-12-22.
 */
public interface MongoBaseDao<T> {

    //添加
    public void insert(T object, String collectionName);

    //根据条件查找
    public T findOne(Map<String, Object> params, String collectionName);

    //查找所有
    public List<T> findAll(Map<String, Object> params, String collectionName);

    //修改
    public void update(Map<String, Object> params, String collectionName);

    //创建集合
    public void createCollection(String collectionName);

    //根据条件删除
    public void remove(Map<String, Object> params, String collectionName);

}
