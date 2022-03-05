package com.esp.lambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import com.esp.comparator.SortByRollNumber;
import com.esp.models.Student;

public class LambdaComparator {

	public static void main(String[] args) {

		List<Student> studentList = Arrays.asList(
				new Student("Rishabh", 3),
				new Student("Ravi", 1),
				new Student("Aman", 2)
				);

		Collections.sort(studentList, new SortByRollNumber());
		System.out.println("Sorted by Roll No ASC: " + studentList);
		
		Collections.sort(studentList, (a,b)-> b.getRollNo()-a.getRollNo());
		System.out.println("Sorted by Roll No Desc: " +studentList);
		
		Collections.sort(studentList, (a,b)-> a.getName().compareTo(b.getName()));
		System.out.println("Sorted by Name ASC: " +studentList);
	}
}

