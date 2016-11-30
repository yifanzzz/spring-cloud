package cn.yifan.cloud;

import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.validation.beanvalidation.MethodValidationPostProcessor;

@Configuration
@ServletComponentScan
public class ApplicationConfiguration{
	
	@Bean
	public static PropertySourcesPlaceholderConfigurer pertySourprocesPlaceholderConfigurer() {
		return new PropertySourcesPlaceholderConfigurer();
	}

	@Bean
	public MethodValidationPostProcessor methodValidationPostProcessor() {//用于参数验证
		return new MethodValidationPostProcessor();
	}
	
}
