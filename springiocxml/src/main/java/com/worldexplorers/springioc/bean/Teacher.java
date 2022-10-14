package com.worldexplorers.springioc.bean;

public class Teacher {

	private String name;

	private int age;

	private float height;

	private boolean female;

	private School school;

	public Teacher(String name, int age, float height) {
		this.name = name;
		this.age = age;
		this.height = height;
	}

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
	 * @return the school
	 */
	public School getSchool() {
		return school;
	}
	
	
}
