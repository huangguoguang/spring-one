package com.wisely.highlight.ch2.el;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
	public static void main(String[] args) {
//		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ElConfig.class);
//		
//		ElConfig resourceService = context.getBean(ElConfig.class);
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ResourceConfig.class);
		
		ResourceConfig resourceService = context.getBean(ResourceConfig.class);
		resourceService.outputResource();
		context.close();
		
	}
}
