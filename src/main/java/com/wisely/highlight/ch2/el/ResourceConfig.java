package com.wisely.highlight.ch2.el;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

@Configuration
@ComponentScan("com.wisely.highlight.ch2.el")
@PropertySource("classpath:com/wisely/highlight/ch2/el/test.properties")//注入配置文件
public class ResourceConfig {
	
	@Autowired
	private Environment environment;//properties可以从environment中获得
	
	public void outputResource() {
		try {
			System.out.println(environment.getProperty("book.author"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
