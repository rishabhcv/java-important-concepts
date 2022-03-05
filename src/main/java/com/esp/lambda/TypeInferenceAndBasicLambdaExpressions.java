package com.esp.lambda;

public class TypeInferenceAndBasicLambdaExpressions {

	public static void main(String[] args) {


		//Single line lambda, return the length of the string
		StringLambda lambdaLength = s -> s.length();
		System.out.println(lambdaLength.lengthOfstring("hello"));  //using reference to invoke the method
		printMethodUsingLambda(s->s.length());   //Passing the lambda expression as a behaviour

		//(s-> s.length()).lengthOfstring("hellow");  Invalid way to call the lambda

		//A multi-line lambda that doesn't return anything
		PrintAdditionDivisionLambda lambdaAdd = (a,b,c) -> {
			System.out.println(a+b+c);
			System.out.println((a/b)/c);
		};

		lambdaAdd.printAddDivide(10, 5, 1);

		//Multiple argument lambda to return the multiplication of numbers
		MultiplyLambda multiply = (a,b,c)-> a*b*c;
		System.out.println("Multiplication " + multiply.multiply(10, 2, -9));


	}

	public static void printMethodUsingLambda(StringLambda l) {
		System.out.println(l.lengthOfstring("hello world"));
	}

	@FunctionalInterface
	public interface StringLambda {
		int lengthOfstring(String s);
		//int length(String s);  Invalid as a functional interface can have only one abstract method
	}

	@FunctionalInterface
	public interface PrintAdditionDivisionLambda {
		void printAddDivide(int a, int b, int c);
	}

	@FunctionalInterface
	public interface MultiplyLambda {
		int multiply(int a, int b, int c);
	}
}
