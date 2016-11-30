package cn.yifan.cloud.feignclient;

import feign.Feign;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class TestClientHystix {
	
	@Bean
    @Scope("prototype")
    public Feign.Builder feignBuilder() {
        return Feign.builder();
    }
	
	@Bean
    public TestClient.TestHystrix hystrix(){
        return new TestClient.TestHystrix();
    }
	
}
