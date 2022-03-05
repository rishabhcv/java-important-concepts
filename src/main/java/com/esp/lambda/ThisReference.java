package com.esp.lambda;

import java.util.function.Consumer;

public class ThisReference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThisReference obj = new ThisReference();
		obj.greet();
		
		Consumer<String> consume = s-> {
			System.out.println(s);
			//System.out.println(this); 
			//won't work here because this is a static context. this will always refer to the class reference
		};
		
		consume.accept("Hello World Lambda");
		Consumer<String> innerClass = new Consumer<String>() {
			
			@Override
			public void accept(String t) {
				System.out.println(t);
				System.out.println(this);
			}
			
			@Override
			public String toString() {
				return "InnerClass class reference";
			}
		};
		
		innerClass.accept("Hello World innerClass!");

	}
	
	public void greet() {
		Consumer<String> consumerLambda = s-> {
			System.out.println(s);
			System.out.println(this);
		};
		consumerLambda.accept("Hello world");
	}
	
	@Override
	public String toString() {
		return "ThisReference class reference";
	}

}
