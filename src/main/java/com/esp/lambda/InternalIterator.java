package com.esp.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class InternalIterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> names = Arrays.asList("Rishabh", "Ravi", "Aman");

		//External Iterator 1
		for(int i=0; i<names.size();i++) {
			System.out.println(names.get(i));
		}

		//External Iterator 2
		for(String name : names) {
			System.out.println(name);
		}

		//External Iterator 3
		ListIterator<String> itr = names.listIterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		//Internal Iterator
		names.forEach(n -> System.out.println(n));
		
		//using a method reference
		names.forEach(System.out :: println);


	}

}
