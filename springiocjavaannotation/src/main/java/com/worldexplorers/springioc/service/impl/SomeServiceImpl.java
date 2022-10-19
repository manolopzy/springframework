package com.worldexplorers.springioc.service.impl;




import org.springframework.stereotype.Service;

import com.worldexplorers.springioc.service.SomeService;
/**
 * import org.springframework.stereotype.Service;
 * import org.springframework.stereotype.Component;
 * import org.springframework.stereotype.Controller;
 * import org.springframework.stereotype.Repository;
 * @Service Business logic layer object annotation
 * @Controller Web service layer object annotation
 * @Repository Data access layer object annotation
 * @Component(value = "someService") General component object annotation
 * 
 * @author tanku
 *
 */

@Service(value = "someService")
public class SomeServiceImpl implements SomeService{

	public SomeServiceImpl() {
		System.out.println("SomeServiceImpl Constructor");
	}
	
	@Override
	public void doSome() {
		System.out.println("I am doing something");
	}

}
