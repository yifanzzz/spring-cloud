package cn.yifan.cloud.controller;

import cn.yifan.cloud.entity.TestEntity;
import cn.yifan.cloud.service.TestService;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value="/test")
@Validated
public class TestController {

    @Autowired
    private TestService testService;

    @ApiOperation(value="获取列表数据", notes="")
	@RequestMapping(value="/list",method=RequestMethod.GET)
	public String list(){
        return testService.getList();
	}

	@ApiOperation(value="创建Entity",notes = "根据TestEntity对象创建数据")
    @ApiImplicitParam(name = "testEntity", value = "详细实体testEntity", required = true, dataType = "TestEntity")
    @RequestMapping(value="/add", method=RequestMethod.POST)
	@ResponseBody
    public String postEntity(TestEntity testEntity){
	    return "success";
    }

	
}
