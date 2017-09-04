package com.wisely.highlight.ch1.aop;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("com.wisely.highlight.ch1.aop")
@EnableAspectJAutoProxy//开启Spring对AspectJ的支持
public class AopConfig {

}
