package com.fs.week5.lab3;

public class Person {
	
	private int age;
	private int personId;
	private String name;
	
	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public int getPersonId() {
		return personId;
	}

	

	public void performDuties() {

		System.out.println("Person is performing hospital duties.");
	}

	public Person(int personId, String name, int age) {
		
		this.personId = personId;
		this.name = name;
		this.age = age;
	}

}
