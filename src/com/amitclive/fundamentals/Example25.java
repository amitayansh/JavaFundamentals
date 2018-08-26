package com.amitclive.fundamentals;

public class Example25 {

	public static void main(String[] args) {
		final int A;
		A =100;
		System.out.println(A);
		A=98;
		System.out.println(A);
		
		//Compilation Error: The final local variable A may already have been assigned
	}
}
