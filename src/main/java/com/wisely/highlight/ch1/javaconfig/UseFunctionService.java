package com.wisely.highlight.ch1.javaconfig;

import com.wisely.highlight.ch1.di.FunctionService;

public class UseFunctionService {

	FunctionService functionService;

	public void setFunctionService(FunctionService functionService) {
		this.functionService = functionService;
	}
	
	public String sayHello(String word) {
		return functionService.sayHello(word);
	}
}
