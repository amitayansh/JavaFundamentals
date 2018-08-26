package com.amitclive.fundamentals;

public class Example28 {

	public static void main(String[] args) {
		final String STR ="amitclive";
		STR ="www.amitclive.com";
		System.out.println(STR);
		//Compilation error: The final local variable STR cannot be assigned. It must be blank and not using a compound assignment
	}
}
