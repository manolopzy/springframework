package com.worldexplorers.springioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.worldexplorers.springioc.bean.Librarian;
import com.worldexplorers.springioc.bean.Singer;
import com.worldexplorers.springioc.bean.Student;
import com.worldexplorers.springioc.bean.Teacher;
import com.worldexplorers.springioc.service.SomeService;

public class SpringiocApplication {

	public static void main(String[] args) {
		//the configuration file is located under the class path
		String resource = "applicationContext.xml";
		//initialization of the spring ioc container which contains DAO, SERVICE and CONTROLLER instances
		ApplicationContext context = new ClassPathXmlApplicationContext(resource);
		//retrieve the someService bean by its id identifier
		SomeService someService = (SomeService)context.getBean("someService");
		someService.doSome();
		Student student = (Student)context.getBean("student");
		
		System.out.println("name = " + student.getName());
		
		System.out.println("school name = " + student.getSchool().getName());
		Teacher teacher = (Teacher)context.getBean("teacher");
		System.out.println("teacher name = " + teacher.getName());
		
		Librarian librarian = (Librarian)context.getBean("librarian");
		System.out.println("a librarian's school name = " + librarian.getSchool().getName());
		
		Librarian librarian2 = (Librarian)context.getBean("librarian2");
		System.out.println("another librarian's school name = " + librarian2.getSchool().getName());
		
		Singer singer = (Singer)context.getBean("singer");
		System.out.println("singer name = " + singer.getName());
		
		//System.out.println("resource = " + context.getClass().getResource("classpath:spring-other-beans.xml"));;
	}

}
