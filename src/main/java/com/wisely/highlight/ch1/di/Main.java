package com.wisely.highlight.ch1.di;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
	public static void main(String[] args) {
		//使用AnnotationConfigApplicationContext作为Spring容器，接受输入一个配置类作为参数
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DiConfig.class);
		
		UseFunctionService useFunctionService = context.getBean(UseFunctionService.class);//获得声明配置的Bean
		
		System.out.println(useFunctionService.sayHello("di"));
		
		context.close();
	}
}
