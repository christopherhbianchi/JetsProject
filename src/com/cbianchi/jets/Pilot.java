package com.cbianchi.jets;

public class Pilot {

	String name;
	int age, experience;

	public Pilot(String name, int age, int experience) {
		this.name = name;
		this.age = age;
		this.experience = experience;
		
	}
	
	public Pilot() {
		this("Danger Rick", 45, 25);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getExperience() {
		return experience;
	}

	public void setExperience(int experience) {
		this.experience = experience;
	}

	
	public String toString() { //this is a toString
		StringBuilder builder = new StringBuilder();
		builder.append("Pilot Name: ");
		builder.append(name);
		builder.append(", Age: ");
		builder.append(age);
		builder.append(", Experience: ");
		builder.append(experience);
		builder.append("\n");
		return builder.toString();
	}

}
