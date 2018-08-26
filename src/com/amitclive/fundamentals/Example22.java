package com.amitclive.fundamentals;
//final variable cannot be modified
public class Example22 {

	public static void main(String[] args) {
		final int A =100;
		System.out.println(A);
		A=88;
		System.out.println(A);
		//Compilation error: reassignment is not possible for final variable
	}
	
}
