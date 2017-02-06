package cn.yifan.cloud.controller;

import cn.yifan.cloud.common.ResponseMsg;
import cn.yifan.cloud.service.TestClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/client/test")
@Validated
public class TestClientController {

    @Autowired
    private TestClientService testClientService;

    @RequestMapping(value="/list",method=RequestMethod.GET)
    public ResponseMsg getList(){
        return testClientService.list();
    }

}