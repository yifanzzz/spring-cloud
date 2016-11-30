package cn.yifan.cloud.dao;

import cn.yifan.cloud.entity.TestEntity;

import java.util.List;

/**
 * Created by hopezzz on 2016/11/29.
 */
public interface TestDao {

    public List<TestEntity> findList();

}
