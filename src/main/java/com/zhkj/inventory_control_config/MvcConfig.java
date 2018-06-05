package com.zhkj.inventory_control_config;

import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alibaba.fastjson.support.config.FastJsonConfig;
import com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerAdapter;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerMapping;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

/**
 * 配置MVC
 */
@Configuration
@EnableWebMvc
@ComponentScan("com.zhkj")
public class MvcConfig extends WebMvcConfigurerAdapter {
    @Bean
    public ViewResolver viewResolver(){
        InternalResourceViewResolver internalResourceViewResolver=new InternalResourceViewResolver();
        internalResourceViewResolver.setViewClass(JstlView.class);//引用jstl表达式
        internalResourceViewResolver.setPrefix("/WEB-INF/jsp/");//以/WEB-INF/jsp/开头
        internalResourceViewResolver.setSuffix(".jsp");//以jsp结尾的
        return internalResourceViewResolver;
    }
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler ("/static/**").addResourceLocations ("classpath:/static/").setCachePeriod (10000);
    }
//    @Bean
//    RequestMappingHandlerMapping requestMappingHandlerMapping(){
//        RequestMappingHandlerAdapter requestMappingHandlerAdapter=new RequestMappingHandlerAdapter();
//        List<HttpMessageConverter<String>>  stringHttpMessageConverter= new ArrayList<>();
//
//        stringHttpMessageConverter.add(new StringHttpMessageConverter("text/html; charset=UTF-8"));
//        requestMappingHandlerAdapter.setMessageConverters();
//    }
}
