package com.wisely.highlight.ch2.event;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * @author Administrator
 *	事件监听器
 */
@Component
public class DemoListener implements ApplicationListener<DemoEvent> {//实现ApplicationListener接口，并指定监听 的事件类型

	public void onApplicationEvent(DemoEvent event) {//使用onApplicationEvent方法对消息进行接受处理
		String msg = event.getMsg();
		
		System.out.println("我(bean-demoListener)接收到了bean-demoPublisher发布的消息" + msg);
	}

}
