package com.mkpits.practice01;

public class NestedException {

	public static void main(String[] args) {
		try {
			
			try {
				System.out.println("**");
				int a = 2/0;
				
			} catch (ArithmeticException e) {
			
				e.printStackTrace();
				System.out.println("going to divide by zero");
				
				
			}
			
		} catch (Exception e) {
			
		}

	}

}
