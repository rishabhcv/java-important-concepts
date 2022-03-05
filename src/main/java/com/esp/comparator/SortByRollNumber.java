package com.esp.comparator;

import java.util.Comparator;

import com.esp.models.Student;

public class SortByRollNumber implements Comparator<Student> {
	
	public int compare(Student a, Student b) {
		return a.getRollNo()-b.getRollNo();
	}
}