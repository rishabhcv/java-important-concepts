package com.esp.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import com.esp.models.Student;

public class SortingUsingStream {

	public static void main(String[] args) {

		List<Student> students = Arrays.asList(new Student("Rishabh", 1), new Student("Aman", 3), new Student("Ankit", 2));

		//Original list is not modified
		students.stream()
		.sorted((a, b) -> a.getRollNo()-b.getRollNo())
		.forEach( s-> System.out.println(s));
		
		
		//This is how we store the modified list
		students = students.stream()
		.sorted((a, b) -> b.getRollNo()-a.getRollNo())
		.collect(Collectors.toList());
		
		students.forEach(s->System.out.println(s));
		
	}

}
