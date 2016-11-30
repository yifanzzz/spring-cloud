package cn.yifan.cloud;

import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.validation.beanvalidation.MethodValidationPostProcessor;

/**
 * Created by hopezzz on 2016/11/29.
 */
@Configuration
@ServletComponentScan
public class ApplicationConfiguration {

    @Bean
    public static PropertySourcesPlaceholderConfigurer pertySourprocesPlaceholderConfigurer() {
        return new PropertySourcesPlaceholderConfigurer();
    }

    @Bean
    public MethodValidationPostProcessor methodValidationPostProcessor() {//开启bean验证

        return new MethodValidationPostProcessor();
    }

}
