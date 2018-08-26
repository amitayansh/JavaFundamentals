package com.amitclive.fundamentals;

public class Example16 {

	public static void main(String[] args) {
		int a = b = c = 10;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		//Compilation error: b and c cannot be resolved to a variable
	}
}
