package com.esp.lambda;

public class ThreadBackwardCompatibility {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Thread innerClassThread = new Thread(new Runnable() {
			
			@Override
			public void run() {
				System.out.println("Printing from Anonymous inner class");
			}
		});
		
		innerClassThread.run();
		
		Thread lambdaThread = new Thread(()-> System.out.println("Printing from lambda expression"));
		lambdaThread.run();
		lambdaThread.start();
	}

}
