package com.amitclive.fundamentals;
//using instance variable in static method
public class Examples5 {

	int a;
	public static void main(String[] args) {
		System.out.println(a);
		//Compilation Error: Cannot make a static reference to the non-static field a
	}
}
