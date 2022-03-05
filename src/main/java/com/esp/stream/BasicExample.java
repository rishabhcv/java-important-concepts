package com.esp.stream;

import java.util.Arrays;
import java.util.List;

public class BasicExample {

	public static void main(String[] args) {

		List<String> names = Arrays.asList("Rishabh","Ravi","Aman","Ankit");

		long count = names.stream().count();
		System.out.println(count);
		
		names.stream()
		.forEach(n -> System.out.println(n));

		names.stream()
		.filter(s->s.startsWith("R"))
		.forEach(s -> System.out.println(s));

		names.stream()
		.filter(n -> {return n.length()>4;})
		.forEach(n -> System.out.println(n));
	}

}
