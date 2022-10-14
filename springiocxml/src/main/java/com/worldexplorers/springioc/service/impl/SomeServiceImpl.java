package com.worldexplorers.springioc.service.impl;

import com.worldexplorers.springioc.service.SomeService;


public class SomeServiceImpl implements SomeService{

	public SomeServiceImpl() {
		System.out.println("SomeServiceImpl Constructor");
	}
	
	@Override
	public void doSome() {
		System.out.println("I am doing something");
	}

}
