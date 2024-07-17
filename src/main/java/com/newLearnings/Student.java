package com.newLearnings;

public class Student {
	private int rollo;
	private String name;
	public int getRollo() {
		return rollo;
	}
	public void setRollo(int rollo) {
		this.rollo = rollo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Student() {
		// TODO Auto-generated constructor stub
	}
	public Student(int rollo, String name) {
		super();
		this.rollo = rollo;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Student [rollo=" + rollo + ", name=" + name + "]";
	}

}
