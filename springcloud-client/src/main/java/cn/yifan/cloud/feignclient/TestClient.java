package cn.yifan.cloud.feignclient;

import cn.yifan.cloud.common.ResponseMsg;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

//此处需要指定服务端的服务名也可以用占位符的方式
@FeignClient(value="server-cloud",fallback=TestClient.TestHystrix.class)
public interface TestClient {

	@RequestMapping(value="/test/list",method=RequestMethod.GET)
	@ResponseBody//此处需要添加json注解
	//此方法需要根据实际情况添加参数@RequestParam(value = "param", required = false)
	public ResponseMsg list();

	public static class TestHystrix  implements TestClient {

		//@RequestParam(value="param",required=false) 此处list方法中可以添加校验

		public ResponseMsg list() {
			return new ResponseMsg().failure("参数错误");
		}

	}
}
