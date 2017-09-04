package com.wisely.highlight.ch1.di;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration//声明当前类是一个配置类
@ComponentScan("com.wisely.highlight.chl.di")//自动扫描包名下所有使用@Service,@Component.@Repository,@Controller的类，并注册为Bean
public class DiConfig {
	
}
