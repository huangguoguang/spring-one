package com.wisely.highlight.ch2.prepost;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.wisely.highlight.ch2.prepost")
public class PrePostConfig{

	@Bean(initMethod = "init", destroyMethod = "destroy")//指定BeanWayService的init和destroy方法在构造之后，销毁之前执行
	BeanWayService beanWayService() {
		return new BeanWayService();
	}
	
	@Bean
	JSR250WayService jsr250WayService() {
		return new JSR250WayService();
	}
}
