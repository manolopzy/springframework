package com.worldexplorers.springioc.bean;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Singer {
	
	@Value("Maria")
	private String name;

	private int age;

	private float height;

	private boolean female;
	/**
	 * This is a java annotation to annotate a dependency injection
	 */
	@Resource
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
