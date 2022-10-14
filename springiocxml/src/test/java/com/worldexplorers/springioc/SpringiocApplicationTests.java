package com.worldexplorers.springioc;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.worldexplorers.springioc.service.SomeService;

@SpringBootTest
class SpringiocApplicationTests {

	@Test
	void contextLoads() {
		String resource = "applicationContext.xml";
		ApplicationContext context = new ClassPathXmlApplicationContext(resource);
		SomeService someService = (SomeService)context.getBean("someService");
		someService.doSome();
	}

}
