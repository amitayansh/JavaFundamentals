package com.amitclive.fundamentals;

public class Example52 {

	public static void main(String[] args) {
		Hello hello = new Hello();
		System.out.println(hello instanceof Hello);
		System.out.println(hello instanceof Object);
//		System.out.println(hello instanceof String);Compilation error: Incompatible conditional operand types Hello and String
		
		Object h1 = new Hello();
		System.out.println(h1 instanceof String);
		System.out.println(h1 instanceof Hello);
		System.out.println(h1 instanceof Object);
		
		Hello h2 = null;
		String str =null;
		System.out.println(h2 instanceof Hello);
		System.out.println(str instanceof String);
		
	}
	
}
class Hello{
	
}