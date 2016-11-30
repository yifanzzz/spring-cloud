package cn.yifan.cloud.service;

import cn.yifan.cloud.dao.TestDao;
import cn.yifan.cloud.entity.TestEntity;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by hopezzz on 2016/11/29.
 */

@Service
public class TestService {

    @Autowired
    private TestDao testDao;

    public String getList(){
        Gson gson=new Gson();
        return gson.toJson(testDao.findList());
    }

}
