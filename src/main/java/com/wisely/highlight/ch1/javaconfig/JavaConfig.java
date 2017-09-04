package com.wisely.highlight.ch1.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.wisely.highlight.ch1.di.FunctionService;

@Configuration//表明当前类是一个配置类
public class JavaConfig {

	@Bean//声明当前方法的返回值是一个Bean
	public FunctionService functionService() {
		return new FunctionService();
	}
	
	@Bean
	public UseFunctionService useFunctionService() {
		UseFunctionService useFunctionService = new UseFunctionService();
		useFunctionService.setFunctionService(functionService());//注入FunctionService的Bean时候直接调用functionService()
		return useFunctionService;
	}
	
	
}
