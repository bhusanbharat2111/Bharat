package com.josh.java.collection.comparebleandcomprator;

class Person implements Comparable<Person> {
	private int age;
	private String name;

	public Person(int age, String name) {
		this.age = age;
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int compareTo(Person p) {
		if (this.getAge() > p.getAge())
			return 1;
		else if (this.getAge() < p.getAge())
			return -1;
		else
			return 0;
	}
}