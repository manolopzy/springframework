package com.worldexplorers.springioc.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
/**
 * 
 * @author tanku
 *
 */
@Component
public class Student {

	@Value(value = "Laula")
	private String name;
	
	@Value("25")
	private int age;
	
	private float height;

	private boolean female;
	/**
	 * Declare whether the annotated dependency is required, default true
	 */
	@Autowired(required = false)
	/**
	 * When there are more than one candidate beans, we can use this to 
	 * specify the id of the depended bean in the container
	 */
	@Qualifier("school")
	private School school;
	
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * @return the height
	 */
	public float getHeight() {
		return height;
	}

	/**
	 * @return the female
	 */
	public boolean isFemale() {
		return female;
	}

	/**
	 * @param female the female to set
	 */
	public void setFemale(boolean female) {
		this.female = female;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}

	/**
	 * @param height the height to set
	 */
	public void setHeight(float height) {
		this.height = height;
	}

	/**
	 * @return the school
	 */
	public School getSchool() {
		return school;
	}

	/**
	 * @param school the school to set
	 */
	public void setSchool(School school) {
		this.school = school;
	}

	
	
	
}
