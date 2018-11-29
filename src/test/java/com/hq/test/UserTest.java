package com.hq.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.hq.model.User;
import com.hq.service.UserService;

public class UserTest {
	@Test
	public void test1() {
              ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
		      UserService userService = context.getBean("userService",UserService.class);
		      
		      User user = new User("admin", "123");
		      userService.save(user);
		
	}

	
	
	
	
}
