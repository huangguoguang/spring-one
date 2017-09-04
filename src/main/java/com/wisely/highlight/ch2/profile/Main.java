package com.wisely.highlight.ch2.profile;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.getEnvironment().setActiveProfiles("prod");//先将活动的profile设为prod
		
		context.register(ProfileConfig.class);//后置注册Bean配置类，
		
		context.refresh();//刷新容器
		DemoBean demoBean = context.getBean(DemoBean.class);
		
		System.out.println(demoBean.getContent());
		
		context.close();
	}
}
