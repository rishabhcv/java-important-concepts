package com.esp.models;

public class Student {
	@Override
	public String toString() {
		return "Student [name=" + name + ", rollNo=" + rollNo + "]";
	}

	String name;
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getRollNo() {
		return rollNo;
	}

	public void setRollNo(Integer rollNo) {
		this.rollNo = rollNo;
	}

	Integer rollNo;
	
	public Student(String name, Integer rollNo) {
		this.name = name;
		this.rollNo = rollNo;
	}
}
