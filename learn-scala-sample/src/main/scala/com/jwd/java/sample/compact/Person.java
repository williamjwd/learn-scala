package com.jwd.java.sample.compact;

import java.util.ArrayList;
import java.util.List;

public class Person {
	private String name;
	private final Integer age;
	
	public Person(String name, Integer age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}
	
	public static void print(Person[] people) {
		for (Person p : people) {
			System.out.println("Name: " + p.getName() + "; Age: " + p.getAge());
		}
	}
	
	public static void printLine() {
		System.out.println("------------------------------");
	}
	
	public static void main(String args[]) {
		Person[] people = 
				new Person[] {new Person("Scott", 30), 
								new Person("Lynn", 25), 
								new Person("Smith", 15), 
								new Person("Linda", 10)};
		Person[] minors;
		Person[] adults;
		
		List<Person> minorsList = new ArrayList<Person>();
		List<Person> adultsList = new ArrayList<Person>();
		
		for (Person person : people) {
			if (person.getAge() < 18) {
				minorsList.add(person);
			} else {
				adultsList.add(person);
			}
		}
		
		minors = minorsList.toArray(new Person[minorsList.size()]);
		adults = adultsList.toArray(new Person[adultsList.size()]);
		
		print(minors);
		printLine();
		print(adults);
		
	}
}
