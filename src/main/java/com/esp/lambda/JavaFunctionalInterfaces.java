package com.esp.lambda;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

import com.esp.models.Student;

public class JavaFunctionalInterfaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Consumer Functional Interface examples
		Consumer<String> consumerStringLambda = s-> System.out.println(s);
		consumerStringLambda.accept("Hello World");

		Student newStud = new Student("Rishabh", 420);
		Consumer<Student> consumerStudentLambda = s-> System.out.println(s.getName() +" "+ s.getRollNo());
		consumerStudentLambda.accept(newStud);

		//Predicate Functional Interface examples
		Predicate<Integer> predicateInt = a -> { return (a>0) ? true : false;};
		System.out.println(predicateInt.test(-9));
		System.out.println(predicateInt.test(10));
		
		Predicate<Student> predicateStudent = s -> {return s.getName() == "Rishabh";};
		System.out.println(predicateStudent.test(new Student("Rishabh", 2)));
		System.out.println(predicateStudent.test(new Student("Pandey", 3)));
		
		//Supplier Functional Interface Examples
		Supplier<Student> studentSupplier = ()-> new Student("Rishabh Pandey", 420);
		System.out.println(studentSupplier.get());
		
		//Function Functional Interface
		Function<Student, String> func = s -> s.getName()+" "+s.getRollNo();
		System.out.println(func.apply(newStud));
	}
}
