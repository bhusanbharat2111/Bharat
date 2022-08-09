package com.josh.java.collection.comparebleandcomprator;

public class Student {
	private Integer age;
	private String name;
	private String favSub;

	public Student(int age, String name, String favSub) {
		super();
		this.age = age;
		this.name = name;
		this.favSub = favSub;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFavSub() {
		return favSub;
	}

	public void setFavSub(String favSub) {
		this.favSub = favSub;
	}

	@Override
	public String toString() {
		return "Student [age=" + age + ", name=" + name + ", favSub=" + favSub + "]";
	}

}
